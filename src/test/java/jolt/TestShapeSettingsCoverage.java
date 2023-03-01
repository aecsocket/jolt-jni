package jolt;

import jolt.math.FVec3;
import jolt.physics.collision.shape.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

public final class TestShapeSettingsCoverage {
    // arbitrary constants for testing, we don't care about their actual values
    private static final Random RANDOM = ThreadLocalRandom.current();
    private static final int RANDOM_POOL_SIZE = 8;

    private static final float F1 = RANDOM.nextFloat();
    private static final float F2 = RANDOM.nextFloat();
    private static final float F3 = RANDOM.nextFloat();
    private static final float F4 = RANDOM.nextFloat();
    private static final float F5 = RANDOM.nextFloat();
    private static final float F6 = RANDOM.nextFloat();
    private static final float F7 = RANDOM.nextFloat();
    private static final float F8 = RANDOM.nextFloat();

    private static final FVec3 FVEC3_1 = new FVec3(RANDOM.nextFloat(), RANDOM.nextFloat(), RANDOM.nextFloat());
    private static final FVec3 FVEC3_2 = new FVec3(RANDOM.nextFloat(), RANDOM.nextFloat(), RANDOM.nextFloat());
    private static final FVec3 FVEC3_3 = new FVec3(RANDOM.nextFloat(), RANDOM.nextFloat(), RANDOM.nextFloat());
    private static final FVec3 FVEC3_4 = new FVec3(RANDOM.nextFloat(), RANDOM.nextFloat(), RANDOM.nextFloat());
    private static final FVec3 FVEC3_5 = new FVec3(RANDOM.nextFloat(), RANDOM.nextFloat(), RANDOM.nextFloat());
    private static final FVec3 FVEC3_6 = new FVec3(RANDOM.nextFloat(), RANDOM.nextFloat(), RANDOM.nextFloat());
    private static final FVec3 FVEC3_7 = new FVec3(RANDOM.nextFloat(), RANDOM.nextFloat(), RANDOM.nextFloat());
    private static final FVec3 FVEC3_8 = new FVec3(RANDOM.nextFloat(), RANDOM.nextFloat(), RANDOM.nextFloat());

    @BeforeAll
    public static void setUp() {
        Jolt.load();

        Jolt.registerDefaultAllocator();
        Jolt.createFactory();
        Jolt.registerTypes();
    }

    private void convex(ConvexShapeSettings obj) {
        obj.setDensity(F8);
        assertEquals(F8, obj.getDensity());
    }

    @Test
    public void sphere() {
        Jolt.use(SphereShapeSettings.create(F1), obj -> {
            assertEquals(F1, obj.getRadius());

            obj.setRadius(F2);
            assertEquals(F2, obj.getRadius());

            convex(obj);
        });
    }

    @Test
    public void box() {
        Jolt.use(BoxShapeSettings.create(FVEC3_1, F1), obj -> {
            assertEquals(FVEC3_1, obj.getHalfExtent());
            assertEquals(F1, obj.getConvexRadius());

            obj.setHalfExtent(FVEC3_2);
            assertEquals(FVEC3_2, obj.getHalfExtent());
            obj.setConvexRadius(F2);
            assertEquals(F2, obj.getConvexRadius());

            convex(obj);
        });
    }

    @Test
    public void triangle() {
        Jolt.use(TriangleShapeSettings.create(FVEC3_1, FVEC3_2, FVEC3_3, F1), obj -> {
            var vertices = obj.getVertices();
            assertEquals(FVEC3_1, vertices.v1());
            assertEquals(FVEC3_2, vertices.v2());
            assertEquals(FVEC3_3, vertices.v3());

            obj.setVertices(FVEC3_4, FVEC3_5, FVEC3_6);
            vertices = obj.getVertices();
            assertEquals(FVEC3_4, vertices.v1());
            assertEquals(FVEC3_5, vertices.v2());
            assertEquals(FVEC3_6, vertices.v3());

            convex(obj);
        });
    }

    @Test
    public void capsule() {
        Jolt.use(CapsuleShapeSettings.create(F1, F2), obj -> {
            assertEquals(F1, obj.getHalfHeight());
            assertEquals(F2, obj.getRadius());

            obj.setHalfHeight(F3);
            assertEquals(F3, obj.getHalfHeight());
            obj.setRadius(F4);
            assertEquals(F4, obj.getRadius());

            convex(obj);
        });
    }

    @Test
    public void taperedCapsule() {
        Jolt.use(TaperedCapsuleShapeSettings.create(F1, F2, F3), obj -> {
            assertEquals(F1, obj.getHalfHeight());
            assertEquals(F2, obj.getTopRadius());
            assertEquals(F3, obj.getBottomRadius());

            obj.setHalfHeight(F4);
            assertEquals(F4, obj.getHalfHeight());
            obj.setTopRadius(F5);
            assertEquals(F5, obj.getTopRadius());
            obj.setBottomRadius(F6);
            assertEquals(F6, obj.getBottomRadius());

            convex(obj);
        });
    }

    @Test
    public void cylinder() {
        Jolt.use(CylinderShapeSettings.create(F1, F2, F3), obj -> {
            assertEquals(F1, obj.getHalfHeight());
            assertEquals(F2, obj.getRadius());
            assertEquals(F3, obj.getConvexRadius());

            obj.setHalfHeight(F4);
            assertEquals(F4, obj.getHalfHeight());
            obj.setRadius(F5);
            assertEquals(F5, obj.getRadius());
            obj.setConvexRadius(F6);
            assertEquals(F6, obj.getConvexRadius());

            convex(obj);
        });
    }

    @Test
    public void convexHull() {
        Jolt.use(ConvexHullShapeSettings.create(new FVec3[] { FVEC3_1, FVEC3_2, FVEC3_3, FVEC3_4 }, F1), obj -> {
            // TODO test point access
            assertEquals(F1, obj.getMaxConvexRadius());

            obj.setMaxConvexRadius(F2);
            assertEquals(F2, obj.getMaxConvexRadius());
            obj.setMaxErrorConvexRadius(F3);
            assertEquals(F3, obj.getMaxErrorConvexRadius());
            obj.setHullTolerance(F4);
            assertEquals(F4, obj.getHullTolerance());
        });
    }
}
