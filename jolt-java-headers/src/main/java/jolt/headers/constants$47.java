// Generated by jextract

package jolt.headers;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$47 {

    static final FunctionDescriptor JPC_Body_IsActive$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsActive$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsActive",
        constants$47.JPC_Body_IsActive$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsStatic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsStatic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsStatic",
        constants$47.JPC_Body_IsStatic$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsKinematic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsKinematic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsKinematic",
        constants$47.JPC_Body_IsKinematic$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsDynamic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsDynamic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsDynamic",
        constants$47.JPC_Body_IsDynamic$FUNC
    );
    static final FunctionDescriptor JPC_Body_CanBeKinematicOrDynamic$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_CanBeKinematicOrDynamic$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_CanBeKinematicOrDynamic",
        constants$47.JPC_Body_CanBeKinematicOrDynamic$FUNC
    );
    static final FunctionDescriptor JPC_Body_SetIsSensor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle JPC_Body_SetIsSensor$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetIsSensor",
        constants$47.JPC_Body_SetIsSensor$FUNC
    );
}


