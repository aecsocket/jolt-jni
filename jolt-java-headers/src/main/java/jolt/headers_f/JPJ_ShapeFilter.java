// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPJ_ShapeFilter {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("vtable"),
        Constants$root.C_INT$LAYOUT.withName("body_id"),
        MemoryLayout.paddingLayout(32)
    ).withName("JPJ_ShapeFilter");
    public static MemoryLayout $LAYOUT() {
        return JPJ_ShapeFilter.$struct$LAYOUT;
    }
    static final VarHandle vtable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vtable"));
    public static VarHandle vtable$VH() {
        return JPJ_ShapeFilter.vtable$VH;
    }
    public static MemoryAddress vtable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPJ_ShapeFilter.vtable$VH.get(seg);
    }
    public static void vtable$set( MemorySegment seg, MemoryAddress x) {
        JPJ_ShapeFilter.vtable$VH.set(seg, x);
    }
    public static MemoryAddress vtable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPJ_ShapeFilter.vtable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vtable$set(MemorySegment seg, long index, MemoryAddress x) {
        JPJ_ShapeFilter.vtable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle body_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("body_id"));
    public static VarHandle body_id$VH() {
        return JPJ_ShapeFilter.body_id$VH;
    }
    public static int body_id$get(MemorySegment seg) {
        return (int)JPJ_ShapeFilter.body_id$VH.get(seg);
    }
    public static void body_id$set( MemorySegment seg, int x) {
        JPJ_ShapeFilter.body_id$VH.set(seg, x);
    }
    public static int body_id$get(MemorySegment seg, long index) {
        return (int)JPJ_ShapeFilter.body_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void body_id$set(MemorySegment seg, long index, int x) {
        JPJ_ShapeFilter.body_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


