// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$27 {

    static final FunctionDescriptor JPC_MotionProperties_GetMaxAngularVelocity$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_GetMaxAngularVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_GetMaxAngularVelocity",
        constants$27.JPC_MotionProperties_GetMaxAngularVelocity$FUNC
    );
    static final FunctionDescriptor JPC_MotionProperties_SetMaxAngularVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_MotionProperties_SetMaxAngularVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_MotionProperties_SetMaxAngularVelocity",
        constants$27.JPC_MotionProperties_SetMaxAngularVelocity$FUNC
    );
    static final FunctionDescriptor JPC_TempAllocator_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_TempAllocator_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_TempAllocator_Create",
        constants$27.JPC_TempAllocator_Create$FUNC
    );
    static final FunctionDescriptor JPC_TempAllocator_Destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_TempAllocator_Destroy$MH = RuntimeHelper.downcallHandle(
        "JPC_TempAllocator_Destroy",
        constants$27.JPC_TempAllocator_Destroy$FUNC
    );
    static final FunctionDescriptor JPC_JobSystem_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_JobSystem_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_JobSystem_Create",
        constants$27.JPC_JobSystem_Create$FUNC
    );
    static final FunctionDescriptor JPC_JobSystem_Destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_JobSystem_Destroy$MH = RuntimeHelper.downcallHandle(
        "JPC_JobSystem_Destroy",
        constants$27.JPC_JobSystem_Destroy$FUNC
    );
}


