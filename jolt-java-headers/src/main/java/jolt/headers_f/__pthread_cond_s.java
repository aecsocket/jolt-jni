// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __pthread_cond_s {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("__value64"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("__low"),
                Constants$root.C_INT$LAYOUT.withName("__high")
            ).withName("__value32")
        ).withName("__wseq"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("__value64"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("__low"),
                Constants$root.C_INT$LAYOUT.withName("__high")
            ).withName("__value32")
        ).withName("__g1_start"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_refs"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_size"),
        Constants$root.C_INT$LAYOUT.withName("__g1_orig_size"),
        Constants$root.C_INT$LAYOUT.withName("__wrefs"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__g_signals")
    ).withName("__pthread_cond_s");
    public static MemoryLayout $LAYOUT() {
        return __pthread_cond_s.$struct$LAYOUT;
    }
    public static MemorySegment __wseq$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment __g1_start$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment __g_refs$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment __g_size$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    static final VarHandle __g1_orig_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__g1_orig_size"));
    public static VarHandle __g1_orig_size$VH() {
        return __pthread_cond_s.__g1_orig_size$VH;
    }
    public static int __g1_orig_size$get(MemorySegment seg) {
        return (int)__pthread_cond_s.__g1_orig_size$VH.get(seg);
    }
    public static void __g1_orig_size$set( MemorySegment seg, int x) {
        __pthread_cond_s.__g1_orig_size$VH.set(seg, x);
    }
    public static int __g1_orig_size$get(MemorySegment seg, long index) {
        return (int)__pthread_cond_s.__g1_orig_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __g1_orig_size$set(MemorySegment seg, long index, int x) {
        __pthread_cond_s.__g1_orig_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __wrefs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__wrefs"));
    public static VarHandle __wrefs$VH() {
        return __pthread_cond_s.__wrefs$VH;
    }
    public static int __wrefs$get(MemorySegment seg) {
        return (int)__pthread_cond_s.__wrefs$VH.get(seg);
    }
    public static void __wrefs$set( MemorySegment seg, int x) {
        __pthread_cond_s.__wrefs$VH.set(seg, x);
    }
    public static int __wrefs$get(MemorySegment seg, long index) {
        return (int)__pthread_cond_s.__wrefs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __wrefs$set(MemorySegment seg, long index, int x) {
        __pthread_cond_s.__wrefs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __g_signals$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


