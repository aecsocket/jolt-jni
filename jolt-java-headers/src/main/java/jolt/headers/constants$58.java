// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$58 {

    static final FunctionDescriptor JPC_BodyInterface_SetObjectLayer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetObjectLayer$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetObjectLayer",
        constants$58.JPC_BodyInterface_SetObjectLayer$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetObjectLayer$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetObjectLayer$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetObjectLayer",
        constants$58.JPC_BodyInterface_GetObjectLayer$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetPositionAndRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetPositionAndRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetPositionAndRotation",
        constants$58.JPC_BodyInterface_SetPositionAndRotation$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetPositionAndRotationWhenChanged$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetPositionAndRotationWhenChanged$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetPositionAndRotationWhenChanged",
        constants$58.JPC_BodyInterface_SetPositionAndRotationWhenChanged$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetPositionAndRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetPositionAndRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetPositionAndRotation",
        constants$58.JPC_BodyInterface_GetPositionAndRotation$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_SetPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_SetPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_SetPosition",
        constants$58.JPC_BodyInterface_SetPosition$FUNC
    );
}


