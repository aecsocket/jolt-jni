// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor JPC_BodyInterface_GetGravityFactor$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetGravityFactor$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetGravityFactor",
        constants$65.JPC_BodyInterface_GetGravityFactor$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetTransformedShape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetTransformedShape$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetTransformedShape",
        constants$65.JPC_BodyInterface_GetTransformedShape$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetUserData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetUserData",
        constants$65.JPC_BodyInterface_GetUserData$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_GetMaterial$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_GetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_GetMaterial",
        constants$65.JPC_BodyInterface_GetMaterial$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_InvalidateContactCache$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_InvalidateContactCache$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_InvalidateContactCache",
        constants$65.JPC_BodyInterface_InvalidateContactCache$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetID$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetID$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetID",
        constants$65.JPC_Body_GetID$FUNC
    );
}


