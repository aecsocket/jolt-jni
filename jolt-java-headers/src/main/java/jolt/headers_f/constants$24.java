// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$24 {

    static final FunctionDescriptor JPC_MotionProperties_GetAngularDamping$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetAngularDamping$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetAngularDamping",
        constants$24.JPC_MotionProperties_GetAngularDamping$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_SetAngularDamping$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_SetAngularDamping$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_SetAngularDamping",
        constants$24.JPC_MotionProperties_SetAngularDamping$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetGravityFactor$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetGravityFactor$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetGravityFactor",
        constants$24.JPC_MotionProperties_GetGravityFactor$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_SetGravityFactor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_SetGravityFactor$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_SetGravityFactor",
        constants$24.JPC_MotionProperties_SetGravityFactor$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_SetMassProperties$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_SetMassProperties$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_SetMassProperties",
        constants$24.JPC_MotionProperties_SetMassProperties$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_GetInverseMass$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetInverseMass$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetInverseMass",
        constants$24.JPC_MotionProperties_GetInverseMass$FUNC
    );
}


