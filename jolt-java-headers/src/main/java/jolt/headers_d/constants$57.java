// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$57 {

    static final FunctionDescriptor JPC_BodyInterface_CreateAndAddBody$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_CreateAndAddBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_CreateAndAddBody",
        constants$57.JPC_BodyInterface_CreateAndAddBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddBodiesPrepare$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddBodiesPrepare$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddBodiesPrepare",
        constants$57.JPC_BodyInterface_AddBodiesPrepare$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddBodiesFinalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddBodiesFinalize$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddBodiesFinalize",
        constants$57.JPC_BodyInterface_AddBodiesFinalize$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddBodiesAbort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddBodiesAbort$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddBodiesAbort",
        constants$57.JPC_BodyInterface_AddBodiesAbort$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_RemoveBodies$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_RemoveBodies$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_RemoveBodies",
        constants$57.JPC_BodyInterface_RemoveBodies$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_ActivateBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_ActivateBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_ActivateBody",
        constants$57.JPC_BodyInterface_ActivateBody$FUNC
    );
}


