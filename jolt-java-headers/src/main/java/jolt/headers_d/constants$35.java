// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$35 {

    static final FunctionDescriptor JPC_ShapeSettings_GetUserData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_GetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_GetUserData",
        constants$35.JPC_ShapeSettings_GetUserData$FUNC
    );
    static final FunctionDescriptor JPC_ShapeSettings_SetUserData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_SetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_SetUserData",
        constants$35.JPC_ShapeSettings_SetUserData$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_GetMaterial$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_GetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_GetMaterial",
        constants$35.JPC_ConvexShapeSettings_GetMaterial$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_SetMaterial$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_SetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_SetMaterial",
        constants$35.JPC_ConvexShapeSettings_SetMaterial$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_GetDensity$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_GetDensity$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_GetDensity",
        constants$35.JPC_ConvexShapeSettings_GetDensity$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_SetDensity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_SetDensity$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_SetDensity",
        constants$35.JPC_ConvexShapeSettings_SetDensity$FUNC
    );
}


