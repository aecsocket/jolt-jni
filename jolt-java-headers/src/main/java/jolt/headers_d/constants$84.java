// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$84 {

    static final FunctionDescriptor JPC_Constraint_GetNumVelocityStepsOverride$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Constraint_GetNumVelocityStepsOverride$MH = RuntimeHelper.downcallHandle(
        "JPC_Constraint_GetNumVelocityStepsOverride",
        constants$84.JPC_Constraint_GetNumVelocityStepsOverride$FUNC
    );
    static final FunctionDescriptor JPC_Constraint_SetNumPositionStepsOverride$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_Constraint_SetNumPositionStepsOverride$MH = RuntimeHelper.downcallHandle(
        "JPC_Constraint_SetNumPositionStepsOverride",
        constants$84.JPC_Constraint_SetNumPositionStepsOverride$FUNC
    );
    static final FunctionDescriptor JPC_Constraint_GetNumPositionStepsOverride$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Constraint_GetNumPositionStepsOverride$MH = RuntimeHelper.downcallHandle(
        "JPC_Constraint_GetNumPositionStepsOverride",
        constants$84.JPC_Constraint_GetNumPositionStepsOverride$FUNC
    );
    static final FunctionDescriptor JPC_Constraint_SetEnabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle JPC_Constraint_SetEnabled$MH = RuntimeHelper.downcallHandle(
        "JPC_Constraint_SetEnabled",
        constants$84.JPC_Constraint_SetEnabled$FUNC
    );
    static final FunctionDescriptor JPC_Constraint_GetEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Constraint_GetEnabled$MH = RuntimeHelper.downcallHandle(
        "JPC_Constraint_GetEnabled",
        constants$84.JPC_Constraint_GetEnabled$FUNC
    );
    static final FunctionDescriptor JPC_TwoBodyConstraint_GetBody1$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_TwoBodyConstraint_GetBody1$MH = RuntimeHelper.downcallHandle(
        "JPC_TwoBodyConstraint_GetBody1",
        constants$84.JPC_TwoBodyConstraint_GetBody1$FUNC
    );
}


