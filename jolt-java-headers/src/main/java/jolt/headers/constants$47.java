// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$47 {

    static final FunctionDescriptor JPC_Shape_GetSurfaceNormal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSurfaceNormal$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSurfaceNormal",
        constants$47.JPC_Shape_GetSurfaceNormal$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSubShapeUserData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubShapeUserData$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubShapeUserData",
        constants$47.JPC_Shape_GetSubShapeUserData$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetVolume$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetVolume$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetVolume",
        constants$47.JPC_Shape_GetVolume$FUNC
    );
    static final FunctionDescriptor JPC_Shape_IsValidScale$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_IsValidScale$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_IsValidScale",
        constants$47.JPC_Shape_IsValidScale$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShape_SetMaterial$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShape_SetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShape_SetMaterial",
        constants$47.JPC_ConvexShape_SetMaterial$FUNC
    );
    static final FunctionDescriptor JPC_ConvexShape_GetMaterial$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexShape_GetMaterial$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexShape_GetMaterial",
        constants$47.JPC_ConvexShape_GetMaterial$FUNC
    );
}


