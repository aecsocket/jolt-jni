// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$54 {

    static final FunctionDescriptor JPC_Body_MoveKinematic$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_Body_MoveKinematic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_MoveKinematic",
        constants$54.JPC_Body_MoveKinematic$FUNC
    );
    static final FunctionDescriptor JPC_Body_ApplyBuoyancyImpulse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_Body_ApplyBuoyancyImpulse$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_ApplyBuoyancyImpulse",
        constants$54.JPC_Body_ApplyBuoyancyImpulse$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsInBroadPhase$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsInBroadPhase$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsInBroadPhase",
        constants$54.JPC_Body_IsInBroadPhase$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsCollisionCacheInvalid$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsCollisionCacheInvalid$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsCollisionCacheInvalid",
        constants$54.JPC_Body_IsCollisionCacheInvalid$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetShape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetShape$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetShape",
        constants$54.JPC_Body_GetShape$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetPosition",
        constants$54.JPC_Body_GetPosition$FUNC
    );
}


