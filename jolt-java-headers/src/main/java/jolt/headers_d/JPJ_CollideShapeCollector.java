// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPJ_CollideShapeCollector {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("vtable"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("early_out_fraction"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("context")
        ).withName("collector")
    ).withName("JPJ_CollideShapeCollector");
    public static MemoryLayout $LAYOUT() {
        return JPJ_CollideShapeCollector.$struct$LAYOUT;
    }
    static final VarHandle vtable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vtable"));
    public static VarHandle vtable$VH() {
        return JPJ_CollideShapeCollector.vtable$VH;
    }
    public static MemoryAddress vtable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPJ_CollideShapeCollector.vtable$VH.get(seg);
    }
    public static void vtable$set( MemorySegment seg, MemoryAddress x) {
        JPJ_CollideShapeCollector.vtable$VH.set(seg, x);
    }
    public static MemoryAddress vtable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPJ_CollideShapeCollector.vtable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vtable$set(MemorySegment seg, long index, MemoryAddress x) {
        JPJ_CollideShapeCollector.vtable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment collector$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


