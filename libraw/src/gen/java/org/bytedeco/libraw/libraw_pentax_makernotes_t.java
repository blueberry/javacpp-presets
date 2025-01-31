// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_pentax_makernotes_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_pentax_makernotes_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_pentax_makernotes_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_pentax_makernotes_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_pentax_makernotes_t position(long position) {
          return (libraw_pentax_makernotes_t)super.position(position);
      }
      @Override public libraw_pentax_makernotes_t getPointer(long i) {
          return new libraw_pentax_makernotes_t((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("uchar") byte DriveMode(int i); public native libraw_pentax_makernotes_t DriveMode(int i, byte setter);
    @MemberGetter public native @Cast("uchar*") BytePointer DriveMode();
    public native @Cast("ushort") short FocusMode(int i); public native libraw_pentax_makernotes_t FocusMode(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer FocusMode();
    public native @Cast("ushort") short AFPointSelected(int i); public native libraw_pentax_makernotes_t AFPointSelected(int i, short setter);
    @MemberGetter public native @Cast("ushort*") ShortPointer AFPointSelected();
    public native @Cast("ushort") short AFPointSelected_Area(); public native libraw_pentax_makernotes_t AFPointSelected_Area(short setter);
    public native int AFPointsInFocus_version(); public native libraw_pentax_makernotes_t AFPointsInFocus_version(int setter);
    public native @Cast("unsigned") int AFPointsInFocus(); public native libraw_pentax_makernotes_t AFPointsInFocus(int setter);
    public native @Cast("ushort") short FocusPosition(); public native libraw_pentax_makernotes_t FocusPosition(short setter);
    public native short AFAdjustment(); public native libraw_pentax_makernotes_t AFAdjustment(short setter);
    public native @Cast("uchar") byte AFPointMode(); public native libraw_pentax_makernotes_t AFPointMode(byte setter);
    public native @Cast("uchar") byte MultiExposure(); public native libraw_pentax_makernotes_t MultiExposure(byte setter); /* last bit is not "1" if ME is not used */
    public native @Cast("ushort") short Quality(); public native libraw_pentax_makernotes_t Quality(short setter); /* 4 is raw, 7 is raw w/ pixel shift, 8 is raw w/ dynamic
                       pixel shift */
  }
