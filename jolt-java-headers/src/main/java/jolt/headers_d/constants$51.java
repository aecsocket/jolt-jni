// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$51 {

    static final FunctionDescriptor JPC_Shape_MustBeStatic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_MustBeStatic$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_MustBeStatic",
        constants$51.JPC_Shape_MustBeStatic$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetCenterOfMass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetCenterOfMass$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetCenterOfMass",
        constants$51.JPC_Shape_GetCenterOfMass$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetLocalBounds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetLocalBounds$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetLocalBounds",
        constants$51.JPC_Shape_GetLocalBounds$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSubShapeIDBitsRecursive$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubShapeIDBitsRecursive$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubShapeIDBitsRecursive",
        constants$51.JPC_Shape_GetSubShapeIDBitsRecursive$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetWorldSpaceBounds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetWorldSpaceBounds$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetWorldSpaceBounds",
        constants$51.JPC_Shape_GetWorldSpaceBounds$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetInnerRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetInnerRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetInnerRadius",
        constants$51.JPC_Shape_GetInnerRadius$FUNC
    );
}


