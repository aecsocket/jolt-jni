// Generated by jextract

package jolt.headers;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$32 {

    static final FunctionDescriptor JPC_ShapeSettings_SetUserData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle JPC_ShapeSettings_SetUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_ShapeSettings_SetUserData",
        constants$32.JPC_ShapeSettings_SetUserData$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_GetMaterial$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_GetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_GetMaterial",
        constants$32.JPC_ConvexShapeSettings_GetMaterial$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_SetMaterial$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_SetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_SetMaterial",
        constants$32.JPC_ConvexShapeSettings_SetMaterial$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_GetDensity$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_GetDensity$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_GetDensity",
        constants$32.JPC_ConvexShapeSettings_GetDensity$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShapeSettings_SetDensity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_ConvexShapeSettings_SetDensity$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShapeSettings_SetDensity",
        constants$32.JPC_ConvexShapeSettings_SetDensity$FUNC
    );
    static final FunctionDescriptor JPC_BoxShapeSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BoxShapeSettings_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_BoxShapeSettings_Create",
        constants$32.JPC_BoxShapeSettings_Create$FUNC
    );
}


