// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_RayCastBodyCollector {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("vtable"),
        Constants$root.C_FLOAT$LAYOUT.withName("early_out_fraction"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("context")
    ).withName("JPC_RayCastBodyCollector");
    public static MemoryLayout $LAYOUT() {
        return JPC_RayCastBodyCollector.$struct$LAYOUT;
    }
    static final VarHandle vtable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vtable"));
    public static VarHandle vtable$VH() {
        return JPC_RayCastBodyCollector.vtable$VH;
    }
    public static MemoryAddress vtable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollector.vtable$VH.get(seg);
    }
    public static void vtable$set( MemorySegment seg, MemoryAddress x) {
        JPC_RayCastBodyCollector.vtable$VH.set(seg, x);
    }
    public static MemoryAddress vtable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollector.vtable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vtable$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_RayCastBodyCollector.vtable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle early_out_fraction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("early_out_fraction"));
    public static VarHandle early_out_fraction$VH() {
        return JPC_RayCastBodyCollector.early_out_fraction$VH;
    }
    public static float early_out_fraction$get(MemorySegment seg) {
        return (float)JPC_RayCastBodyCollector.early_out_fraction$VH.get(seg);
    }
    public static void early_out_fraction$set( MemorySegment seg, float x) {
        JPC_RayCastBodyCollector.early_out_fraction$VH.set(seg, x);
    }
    public static float early_out_fraction$get(MemorySegment seg, long index) {
        return (float)JPC_RayCastBodyCollector.early_out_fraction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void early_out_fraction$set(MemorySegment seg, long index, float x) {
        JPC_RayCastBodyCollector.early_out_fraction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("context"));
    public static VarHandle context$VH() {
        return JPC_RayCastBodyCollector.context$VH;
    }
    public static MemoryAddress context$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollector.context$VH.get(seg);
    }
    public static void context$set( MemorySegment seg, MemoryAddress x) {
        JPC_RayCastBodyCollector.context$VH.set(seg, x);
    }
    public static MemoryAddress context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)JPC_RayCastBodyCollector.context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void context$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_RayCastBodyCollector.context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


