// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class JPC_BodyActivationListenerVTable {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("__unused0"),
        Constants$root.C_POINTER$LAYOUT.withName("__unused1"),
        Constants$root.C_POINTER$LAYOUT.withName("OnBodyActivated"),
        Constants$root.C_POINTER$LAYOUT.withName("OnBodyDeactivated")
    ).withName("JPC_BodyActivationListenerVTable");
    public static MemoryLayout $LAYOUT() {
        return JPC_BodyActivationListenerVTable.$struct$LAYOUT;
    }
    static final VarHandle __unused0$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("__unused0"));
    public static VarHandle __unused0$VH() {
        return JPC_BodyActivationListenerVTable.__unused0$VH;
    }
    public static MemoryAddress __unused0$get(MemorySegment seg) {
        return (MemoryAddress)JPC_BodyActivationListenerVTable.__unused0$VH.get(seg);
    }
    public static void __unused0$set( MemorySegment seg, MemoryAddress x) {
        JPC_BodyActivationListenerVTable.__unused0$VH.set(seg, x);
    }
    public static MemoryAddress __unused0$get(MemorySegment seg, long index) {
        return (MemoryAddress)JPC_BodyActivationListenerVTable.__unused0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __unused0$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BodyActivationListenerVTable.__unused0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __unused1$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("__unused1"));
    public static VarHandle __unused1$VH() {
        return JPC_BodyActivationListenerVTable.__unused1$VH;
    }
    public static MemoryAddress __unused1$get(MemorySegment seg) {
        return (MemoryAddress)JPC_BodyActivationListenerVTable.__unused1$VH.get(seg);
    }
    public static void __unused1$set( MemorySegment seg, MemoryAddress x) {
        JPC_BodyActivationListenerVTable.__unused1$VH.set(seg, x);
    }
    public static MemoryAddress __unused1$get(MemorySegment seg, long index) {
        return (MemoryAddress)JPC_BodyActivationListenerVTable.__unused1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __unused1$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BodyActivationListenerVTable.__unused1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor OnBodyActivated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle OnBodyActivated$MH = RuntimeHelper.downcallHandle(
        JPC_BodyActivationListenerVTable.OnBodyActivated$FUNC
    );
    public interface OnBodyActivated {

        void apply(MemoryAddress _x0, MemoryAddress _x1, long _x2);
        static MemorySegment allocate(OnBodyActivated fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnBodyActivated.class, fi, JPC_BodyActivationListenerVTable.OnBodyActivated$FUNC, session);
        }
        static OnBodyActivated ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (MemoryAddress __x0, MemoryAddress __x1, long __x2) -> {
                try {
                    JPC_BodyActivationListenerVTable.OnBodyActivated$MH.invokeExact((Addressable)symbol, (Addressable)__x0, (Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnBodyActivated$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("OnBodyActivated"));
    public static VarHandle OnBodyActivated$VH() {
        return JPC_BodyActivationListenerVTable.OnBodyActivated$VH;
    }
    public static MemoryAddress OnBodyActivated$get(MemorySegment seg) {
        return (MemoryAddress)JPC_BodyActivationListenerVTable.OnBodyActivated$VH.get(seg);
    }
    public static void OnBodyActivated$set( MemorySegment seg, MemoryAddress x) {
        JPC_BodyActivationListenerVTable.OnBodyActivated$VH.set(seg, x);
    }
    public static MemoryAddress OnBodyActivated$get(MemorySegment seg, long index) {
        return (MemoryAddress)JPC_BodyActivationListenerVTable.OnBodyActivated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnBodyActivated$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BodyActivationListenerVTable.OnBodyActivated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnBodyActivated OnBodyActivated (MemorySegment segment, MemorySession session) {
        return OnBodyActivated.ofAddress(OnBodyActivated$get(segment), session);
    }
    static final FunctionDescriptor OnBodyDeactivated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle OnBodyDeactivated$MH = RuntimeHelper.downcallHandle(
        JPC_BodyActivationListenerVTable.OnBodyDeactivated$FUNC
    );
    public interface OnBodyDeactivated {

        void apply(MemoryAddress _x0, MemoryAddress _x1, long _x2);
        static MemorySegment allocate(OnBodyDeactivated fi, MemorySession session) {
            return RuntimeHelper.upcallStub(OnBodyDeactivated.class, fi, JPC_BodyActivationListenerVTable.OnBodyDeactivated$FUNC, session);
        }
        static OnBodyDeactivated ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (MemoryAddress __x0, MemoryAddress __x1, long __x2) -> {
                try {
                    JPC_BodyActivationListenerVTable.OnBodyDeactivated$MH.invokeExact((Addressable)symbol, (Addressable)__x0, (Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnBodyDeactivated$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("OnBodyDeactivated"));
    public static VarHandle OnBodyDeactivated$VH() {
        return JPC_BodyActivationListenerVTable.OnBodyDeactivated$VH;
    }
    public static MemoryAddress OnBodyDeactivated$get(MemorySegment seg) {
        return (MemoryAddress)JPC_BodyActivationListenerVTable.OnBodyDeactivated$VH.get(seg);
    }
    public static void OnBodyDeactivated$set( MemorySegment seg, MemoryAddress x) {
        JPC_BodyActivationListenerVTable.OnBodyDeactivated$VH.set(seg, x);
    }
    public static MemoryAddress OnBodyDeactivated$get(MemorySegment seg, long index) {
        return (MemoryAddress)JPC_BodyActivationListenerVTable.OnBodyDeactivated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnBodyDeactivated$set(MemorySegment seg, long index, MemoryAddress x) {
        JPC_BodyActivationListenerVTable.OnBodyDeactivated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnBodyDeactivated OnBodyDeactivated (MemorySegment segment, MemorySession session) {
        return OnBodyDeactivated.ofAddress(OnBodyDeactivated$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


