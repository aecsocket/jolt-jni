// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __once_flag {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("__data")
    );
    public static MemoryLayout $LAYOUT() {
        return __once_flag.$struct$LAYOUT;
    }
    static final VarHandle __data$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("__data"));
    public static VarHandle __data$VH() {
        return __once_flag.__data$VH;
    }
    public static int __data$get(MemorySegment seg) {
        return (int)__once_flag.__data$VH.get(seg);
    }
    public static void __data$set( MemorySegment seg, int x) {
        __once_flag.__data$VH.set(seg, x);
    }
    public static int __data$get(MemorySegment seg, long index) {
        return (int)__once_flag.__data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __data$set(MemorySegment seg, long index, int x) {
        __once_flag.__data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


