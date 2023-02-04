package jolt.core;

import jolt.jni.JniBind;
import jolt.jni.JniBindDelete;
import jolt.jni.JniInclude;
import jolt.jni.JniType;

@JniInclude("<Jolt/Core/TempAllocator.h>")
@JniType("TempAllocatorImpl")
public final class TempAllocatorImpl extends TempAllocator {
    private TempAllocatorImpl(long address) { super(address); }
    public static TempAllocatorImpl ref(long address) { return address == 0 ? null : new TempAllocatorImpl(address); }

    @Override
    public void delete() {
        if (address == 0L) throw new IllegalStateException(NATIVE_OBJECT_DELETED);
        _delete(address);
        address = 0;
    }
    @JniBindDelete
    private static native void _delete(long address);

    public static TempAllocatorImpl ofSize(long size) { return ref(_ofSize(size)); }
    @JniBind("return (long) new TempAllocatorImpl(size);")
    private static native long _ofSize(long size);
}
