// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_MotorSettings {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("frequency"),
        Constants$root.C_FLOAT$LAYOUT.withName("damping"),
        Constants$root.C_FLOAT$LAYOUT.withName("min_force_limit"),
        Constants$root.C_FLOAT$LAYOUT.withName("max_force_limit"),
        Constants$root.C_FLOAT$LAYOUT.withName("min_torque_limit"),
        Constants$root.C_FLOAT$LAYOUT.withName("max_torque_limit")
    ).withName("JPC_MotorSettings");
    public static MemoryLayout $LAYOUT() {
        return JPC_MotorSettings.$struct$LAYOUT;
    }
    static final VarHandle frequency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frequency"));
    public static VarHandle frequency$VH() {
        return JPC_MotorSettings.frequency$VH;
    }
    public static float frequency$get(MemorySegment seg) {
        return (float)JPC_MotorSettings.frequency$VH.get(seg);
    }
    public static void frequency$set( MemorySegment seg, float x) {
        JPC_MotorSettings.frequency$VH.set(seg, x);
    }
    public static float frequency$get(MemorySegment seg, long index) {
        return (float)JPC_MotorSettings.frequency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void frequency$set(MemorySegment seg, long index, float x) {
        JPC_MotorSettings.frequency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle damping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("damping"));
    public static VarHandle damping$VH() {
        return JPC_MotorSettings.damping$VH;
    }
    public static float damping$get(MemorySegment seg) {
        return (float)JPC_MotorSettings.damping$VH.get(seg);
    }
    public static void damping$set( MemorySegment seg, float x) {
        JPC_MotorSettings.damping$VH.set(seg, x);
    }
    public static float damping$get(MemorySegment seg, long index) {
        return (float)JPC_MotorSettings.damping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void damping$set(MemorySegment seg, long index, float x) {
        JPC_MotorSettings.damping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle min_force_limit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("min_force_limit"));
    public static VarHandle min_force_limit$VH() {
        return JPC_MotorSettings.min_force_limit$VH;
    }
    public static float min_force_limit$get(MemorySegment seg) {
        return (float)JPC_MotorSettings.min_force_limit$VH.get(seg);
    }
    public static void min_force_limit$set( MemorySegment seg, float x) {
        JPC_MotorSettings.min_force_limit$VH.set(seg, x);
    }
    public static float min_force_limit$get(MemorySegment seg, long index) {
        return (float)JPC_MotorSettings.min_force_limit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_force_limit$set(MemorySegment seg, long index, float x) {
        JPC_MotorSettings.min_force_limit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_force_limit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_force_limit"));
    public static VarHandle max_force_limit$VH() {
        return JPC_MotorSettings.max_force_limit$VH;
    }
    public static float max_force_limit$get(MemorySegment seg) {
        return (float)JPC_MotorSettings.max_force_limit$VH.get(seg);
    }
    public static void max_force_limit$set( MemorySegment seg, float x) {
        JPC_MotorSettings.max_force_limit$VH.set(seg, x);
    }
    public static float max_force_limit$get(MemorySegment seg, long index) {
        return (float)JPC_MotorSettings.max_force_limit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_force_limit$set(MemorySegment seg, long index, float x) {
        JPC_MotorSettings.max_force_limit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle min_torque_limit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("min_torque_limit"));
    public static VarHandle min_torque_limit$VH() {
        return JPC_MotorSettings.min_torque_limit$VH;
    }
    public static float min_torque_limit$get(MemorySegment seg) {
        return (float)JPC_MotorSettings.min_torque_limit$VH.get(seg);
    }
    public static void min_torque_limit$set( MemorySegment seg, float x) {
        JPC_MotorSettings.min_torque_limit$VH.set(seg, x);
    }
    public static float min_torque_limit$get(MemorySegment seg, long index) {
        return (float)JPC_MotorSettings.min_torque_limit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void min_torque_limit$set(MemorySegment seg, long index, float x) {
        JPC_MotorSettings.min_torque_limit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_torque_limit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_torque_limit"));
    public static VarHandle max_torque_limit$VH() {
        return JPC_MotorSettings.max_torque_limit$VH;
    }
    public static float max_torque_limit$get(MemorySegment seg) {
        return (float)JPC_MotorSettings.max_torque_limit$VH.get(seg);
    }
    public static void max_torque_limit$set( MemorySegment seg, float x) {
        JPC_MotorSettings.max_torque_limit$VH.set(seg, x);
    }
    public static float max_torque_limit$get(MemorySegment seg, long index) {
        return (float)JPC_MotorSettings.max_torque_limit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_torque_limit$set(MemorySegment seg, long index, float x) {
        JPC_MotorSettings.max_torque_limit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


