// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor JPC_CollisionCollector_UpdateEarlyOutFraction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_CollisionCollector_UpdateEarlyOutFraction$MH = RuntimeHelper.downcallHandle(
        "JPC_CollisionCollector_UpdateEarlyOutFraction",
        constants$33.JPC_CollisionCollector_UpdateEarlyOutFraction$FUNC
    );
    static final FunctionDescriptor JPC_CollisionCollector_ResetEarlyOutFraction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_CollisionCollector_ResetEarlyOutFraction$MH = RuntimeHelper.downcallHandle(
        "JPC_CollisionCollector_ResetEarlyOutFraction",
        constants$33.JPC_CollisionCollector_ResetEarlyOutFraction$FUNC
    );
    static final FunctionDescriptor JPC_RayCastBodyCollector_ForceEarlyOut$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_RayCastBodyCollector_ForceEarlyOut$MH = RuntimeHelper.downcallHandle(
        "JPC_RayCastBodyCollector_ForceEarlyOut",
        constants$33.JPC_RayCastBodyCollector_ForceEarlyOut$FUNC
    );
    static final FunctionDescriptor JPC_RayCastBodyCollector_ShouldEarlyOut$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_RayCastBodyCollector_ShouldEarlyOut$MH = RuntimeHelper.downcallHandle(
        "JPC_RayCastBodyCollector_ShouldEarlyOut",
        constants$33.JPC_RayCastBodyCollector_ShouldEarlyOut$FUNC
    );
    static final FunctionDescriptor JPC_CollideShapeBodyCollector_ForceEarlyOut$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CollideShapeBodyCollector_ForceEarlyOut$MH = RuntimeHelper.downcallHandle(
        "JPC_CollideShapeBodyCollector_ForceEarlyOut",
        constants$33.JPC_CollideShapeBodyCollector_ForceEarlyOut$FUNC
    );
    static final FunctionDescriptor JPC_CollideShapeBodyCollector_ShouldEarlyOut$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CollideShapeBodyCollector_ShouldEarlyOut$MH = RuntimeHelper.downcallHandle(
        "JPC_CollideShapeBodyCollector_ShouldEarlyOut",
        constants$33.JPC_CollideShapeBodyCollector_ShouldEarlyOut$FUNC
    );
}


