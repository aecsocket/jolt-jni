// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$26 {

    static final FunctionDescriptor JPC_TempAllocator_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_TempAllocator_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_TempAllocator_Create",
        constants$26.JPC_TempAllocator_Create$FUNC
    );
    static final FunctionDescriptor JPC_TempAllocator_Destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_TempAllocator_Destroy$MH = RuntimeHelper.downcallHandle(
        "JPC_TempAllocator_Destroy",
        constants$26.JPC_TempAllocator_Destroy$FUNC
    );
    static final FunctionDescriptor JPC_JobSystem_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_JobSystem_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_JobSystem_Create",
        constants$26.JPC_JobSystem_Create$FUNC
    );
    static final FunctionDescriptor JPC_JobSystem_Destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_JobSystem_Destroy$MH = RuntimeHelper.downcallHandle(
        "JPC_JobSystem_Destroy",
        constants$26.JPC_JobSystem_Destroy$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_Create",
        constants$26.JPC_PhysicsSystem_Create$FUNC
    );
    static final FunctionDescriptor JPC_PhysicsSystem_Destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PhysicsSystem_Destroy$MH = RuntimeHelper.downcallHandle(
        "JPC_PhysicsSystem_Destroy",
        constants$26.JPC_PhysicsSystem_Destroy$FUNC
    );
}


