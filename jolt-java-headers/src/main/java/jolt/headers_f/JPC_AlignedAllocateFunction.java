// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface JPC_AlignedAllocateFunction {

    java.lang.foreign.Addressable apply(long in_size, long in_alignment);
    static MemorySegment allocate(JPC_AlignedAllocateFunction fi, MemorySession session) {
        return RuntimeHelper.upcallStub(JPC_AlignedAllocateFunction.class, fi, constants$19.JPC_AlignedAllocateFunction$FUNC, session);
    }
    static JPC_AlignedAllocateFunction ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _in_size, long _in_alignment) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$19.JPC_AlignedAllocateFunction$MH.invokeExact((Addressable)symbol, _in_size, _in_alignment);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


