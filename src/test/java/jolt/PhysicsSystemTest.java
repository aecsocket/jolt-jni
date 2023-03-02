package jolt;

import jolt.physics.PhysicsSystem;
import jolt.physics.collision.ObjectLayerPairFilter;
import jolt.physics.collision.broadphase.BroadPhaseLayerInterface;
import jolt.physics.collision.broadphase.BroadPhaseLayerInterfaceFn;
import jolt.physics.collision.broadphase.ObjectVsBroadPhaseLayerFilter;

import java.lang.foreign.MemorySession;

class PhysicsSystemTest extends MemoriedTest {
    static final byte BP_LAYER_NON_MOVING = 0;
    static final byte BP_LAYER_MOVING = 1;

    static final short OBJ_LAYER_NON_MOVING = 0;
    static final short OBJ_LAYER_MOVING = 1;

    protected BroadPhaseLayerInterface bpLayerIface;
    protected ObjectVsBroadPhaseLayerFilter objBpLayerIface;
    protected ObjectLayerPairFilter objLayerPairFilter;
    protected PhysicsSystem physics;

    protected void setUpPhysics() {
        bpLayerIface = BroadPhaseLayerInterface.of(session, new BroadPhaseLayerInterfaceFn() {
            @Override
            public int getNumBroadPhaseLayers() {
                return 2;
            }

            @Override
            public byte getBroadPhaseLayer(short layer) {
                return switch (layer) {
                    case OBJ_LAYER_NON_MOVING -> BP_LAYER_NON_MOVING;
                    case OBJ_LAYER_MOVING -> BP_LAYER_MOVING;
                    default -> throw new IllegalArgumentException("Invalid object layer " + layer);
                };
            }
        });
        objBpLayerIface = ObjectVsBroadPhaseLayerFilter.of(session, (layer1, layer2) -> switch (layer1) {
            case OBJ_LAYER_NON_MOVING -> layer2 == BP_LAYER_MOVING;
            case OBJ_LAYER_MOVING -> true;
            default -> false;
        });
        objLayerPairFilter = ObjectLayerPairFilter.of(session, (layer1, layer2) -> switch (layer1) {
            case OBJ_LAYER_NON_MOVING -> layer2 == OBJ_LAYER_MOVING;
            case OBJ_LAYER_MOVING -> true;
            default -> false;
        });
        physics = PhysicsSystem.create(
                1024, 0, 1024, 1024,
                bpLayerIface,
                objBpLayerIface,
                objLayerPairFilter
        );
    }

    protected void tearDownPhysics() {
        physics.destroy();
    }
}
