// Generated by jextract

package jolt.headers;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$41 {

    static final FunctionDescriptor JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf",
        constants$41.JPC_MeshShapeSettings_GetMaxTrianglesPerLeaf$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf",
        constants$41.JPC_MeshShapeSettings_SetMaxTrianglesPerLeaf$FUNC
    );
    static final FunctionDescriptor JPC_MeshShapeSettings_Sanitize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MeshShapeSettings_Sanitize$MH = RuntimeHelper.downcallHandle(
        "JPC_MeshShapeSettings_Sanitize",
        constants$41.JPC_MeshShapeSettings_Sanitize$FUNC
    );
    static final FunctionDescriptor JPC_Shape_AddRef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_AddRef$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_AddRef",
        constants$41.JPC_Shape_AddRef$FUNC
    );
    static final FunctionDescriptor JPC_Shape_Release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_Release$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_Release",
        constants$41.JPC_Shape_Release$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetRefCount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetRefCount$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetRefCount",
        constants$41.JPC_Shape_GetRefCount$FUNC
    );
}


