// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor JPC_BodyInterface_SetRestitution$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetRestitution$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetRestitution",
        constants$65.JPC_BodyInterface_SetRestitution$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetRestitution$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetRestitution$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetRestitution",
        constants$65.JPC_BodyInterface_GetRestitution$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetFriction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetFriction$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetFriction",
        constants$65.JPC_BodyInterface_SetFriction$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetFriction$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetFriction$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetFriction",
        constants$65.JPC_BodyInterface_GetFriction$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetGravityFactor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetGravityFactor$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetGravityFactor",
        constants$65.JPC_BodyInterface_SetGravityFactor$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetGravityFactor$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetGravityFactor$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetGravityFactor",
        constants$65.JPC_BodyInterface_GetGravityFactor$FUNC
    );
}


