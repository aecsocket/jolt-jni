// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPJ_ObjectVsBroadPhaseLayerFilter {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("vtable")
    ).withName("JPJ_ObjectVsBroadPhaseLayerFilter");
    public static MemoryLayout $LAYOUT() {
        return JPJ_ObjectVsBroadPhaseLayerFilter.$struct$LAYOUT;
    }
    static final VarHandle vtable$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("vtable"));
    public static VarHandle vtable$VH() {
        return JPJ_ObjectVsBroadPhaseLayerFilter.vtable$VH;
    }
    public static MemoryAddress vtable$get(MemorySegment seg) {
        return (MemoryAddress)JPJ_ObjectVsBroadPhaseLayerFilter.vtable$VH.get(seg);
    }
    public static void vtable$set( MemorySegment seg, MemoryAddress x) {
        JPJ_ObjectVsBroadPhaseLayerFilter.vtable$VH.set(seg, x);
    }
    public static MemoryAddress vtable$get(MemorySegment seg, long index) {
        return (MemoryAddress)JPJ_ObjectVsBroadPhaseLayerFilter.vtable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vtable$set(MemorySegment seg, long index, MemoryAddress x) {
        JPJ_ObjectVsBroadPhaseLayerFilter.vtable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


