// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$44 {

    static final FunctionDescriptor JPC_MeshShapeSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_Create",
        constants$44.JPC_MeshShapeSettings_Create$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf",
        constants$44.JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf",
        constants$44.JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_Sanitize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_Sanitize$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_Sanitize",
        constants$44.JPC_MeshShapeSettings_Sanitize$FUNC
    );
    static final FunctionDescriptor JPC_Shape_AddRef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_AddRef$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_AddRef",
        constants$44.JPC_Shape_AddRef$FUNC
    );
    static final FunctionDescriptor JPC_Shape_Release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_Release$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_Release",
        constants$44.JPC_Shape_Release$FUNC
    );
}


