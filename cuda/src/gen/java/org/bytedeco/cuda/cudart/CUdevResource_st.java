// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * \struct CUdevResource
 * A tagged union describing different resources identified by the type field. This structure should not be directly modified outside of the API that created it.
 * <pre>{@code
 * struct {
 *     CUdevResourceType type;
 *     union {
 *         CUdevSmResource sm;
 *     };
 * };
 * }</pre>
 * - If \p type is \p CU_DEV_RESOURCE_TYPE_INVALID, this resoure is not valid and cannot be further accessed.
 * - If \p type is \p CU_DEV_RESOURCE_TYPE_SM, the ::CUdevSmResource structure \p sm is filled in. For example,
 * \p sm.smCount will reflect the amount of streaming multiprocessors available in this resource.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUdevResource_st extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUdevResource_st() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUdevResource_st(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUdevResource_st(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUdevResource_st position(long position) {
        return (CUdevResource_st)super.position(position);
    }
    @Override public CUdevResource_st getPointer(long i) {
        return new CUdevResource_st((Pointer)this).offsetAddress(i);
    }

    /** Type of resource, dictates which union field was last set */
    public native @Cast("CUdevResourceType") int type(); public native CUdevResource_st type(int setter);
    public native @Cast("unsigned char") byte _internal_padding(int i); public native CUdevResource_st _internal_padding(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer _internal_padding();
        /** Resource corresponding to CU_DEV_RESOURCE_TYPE_SM \p. type. */
        public native @ByRef CUdevSmResource_st sm(); public native CUdevResource_st sm(CUdevSmResource_st setter);
        public native @Cast("unsigned char") byte _oversize(int i); public native CUdevResource_st _oversize(int i, byte setter);
        @MemberGetter public native @Cast("unsigned char*") BytePointer _oversize();
}