// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * Complex Number
 * This struct represents a long long complex number.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp64sc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp64sc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp64sc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp64sc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp64sc position(long position) {
        return (Npp64sc)super.position(position);
    }

    /**  Real part */
    public native @Cast("Npp64s") long re(); public native Npp64sc re(long re);
    /**  Imaginary part */
    public native @Cast("Npp64s") long im(); public native Npp64sc im(long im);
}