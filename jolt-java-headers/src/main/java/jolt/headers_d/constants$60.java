// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$60 {

    static final FunctionDescriptor JPC_BodyInterface_SetPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetPosition",
        constants$60.JPC_BodyInterface_SetPosition$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetPosition",
        constants$60.JPC_BodyInterface_GetPosition$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetCenterOfMassPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetCenterOfMassPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetCenterOfMassPosition",
        constants$60.JPC_BodyInterface_GetCenterOfMassPosition$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetRotation",
        constants$60.JPC_BodyInterface_SetRotation$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetRotation",
        constants$60.JPC_BodyInterface_GetRotation$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetWorldTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetWorldTransform$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetWorldTransform",
        constants$60.JPC_BodyInterface_GetWorldTransform$FUNC
    );
}


