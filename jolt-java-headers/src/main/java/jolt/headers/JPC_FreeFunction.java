// Generated by jextract

package jolt.headers;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;

public interface JPC_FreeFunction {

    void apply(MemoryAddress in_block);
    static MemorySegment allocate(JPC_FreeFunction fi, MemorySession session) {
        return RuntimeHelper.upcallStub(JPC_FreeFunction.class, fi, constants$18.JPC_FreeFunction$FUNC, session);
    }
    static JPC_FreeFunction ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (MemoryAddress _in_block) -> {
            try {
                constants$19.JPC_FreeFunction$MH.invokeExact((Addressable)symbol, (Addressable)_in_block);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


