// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$32 {

    static final FunctionDescriptor JPC_BroadPhaseQuery_CastAABox$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BroadPhaseQuery_CastAABox$MH = RuntimeHelper.downcallHandle(
        "JPC_BroadPhaseQuery_CastAABox",
        constants$32.JPC_BroadPhaseQuery_CastAABox$FUNC
    );
    static final FunctionDescriptor JPC_NarrowPhaseQuery_CastRay$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_NarrowPhaseQuery_CastRay$MH = RuntimeHelper.downcallHandle(
        "JPC_NarrowPhaseQuery_CastRay",
        constants$32.JPC_NarrowPhaseQuery_CastRay$FUNC
    );
    static final FunctionDescriptor JPC_SphereShape_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SphereShape_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_SphereShape_Create",
        constants$32.JPC_SphereShape_Create$FUNC
    );
    static final FunctionDescriptor JPC_SphereShape_GetRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SphereShape_GetRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_SphereShape_GetRadius",
        constants$32.JPC_SphereShape_GetRadius$FUNC
    );
    static final FunctionDescriptor JPC_BoxShape_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BoxShape_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_BoxShape_Create",
        constants$32.JPC_BoxShape_Create$FUNC
    );
    static final FunctionDescriptor JPC_BoxShape_GetHalfExtent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BoxShape_GetHalfExtent$MH = RuntimeHelper.downcallHandle(
        "JPC_BoxShape_GetHalfExtent",
        constants$32.JPC_BoxShape_GetHalfExtent$FUNC
    );
}


