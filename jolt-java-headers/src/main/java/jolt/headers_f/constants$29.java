// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$29 {

    static final FunctionDescriptor JPC_PhysicsSystem_GetNumBodies$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetNumBodies$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetNumBodies",
        constants$29.JPC_PhysicsSystem_GetNumBodies$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetNumActiveBodies$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetNumActiveBodies$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetNumActiveBodies",
        constants$29.JPC_PhysicsSystem_GetNumActiveBodies$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetMaxBodies$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetMaxBodies$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetMaxBodies",
        constants$29.JPC_PhysicsSystem_GetMaxBodies$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetGravity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetGravity$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetGravity",
        constants$29.JPC_PhysicsSystem_GetGravity$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_SetGravity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_SetGravity$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_SetGravity",
        constants$29.JPC_PhysicsSystem_SetGravity$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_GetBodyInterface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_GetBodyInterface$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_GetBodyInterface",
        constants$29.JPC_PhysicsSystem_GetBodyInterface$FUNC
    );
}


