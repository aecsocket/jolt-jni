// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$72 {

    static final FunctionDescriptor JPC_Body_IsInBroadPhase$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsInBroadPhase$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsInBroadPhase",
        constants$72.JPC_Body_IsInBroadPhase$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsCollisionCacheInvalid$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsCollisionCacheInvalid$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsCollisionCacheInvalid",
        constants$72.JPC_Body_IsCollisionCacheInvalid$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetShape$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetShape$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetShape",
        constants$72.JPC_Body_GetShape$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetPosition",
        constants$72.JPC_Body_GetPosition$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetRotation",
        constants$72.JPC_Body_GetRotation$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetWorldTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetWorldTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetWorldTransform",
        constants$72.JPC_Body_GetWorldTransform$FUNC
    );
}


