// Targeted by JavaCPP version 1.5.12-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videoio;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;

import static org.bytedeco.opencv.global.opencv_videoio.*;


/** \} OBSENSOR
 <p>
 *  \} videoio_flags_others
<p>
/** \brief Read data stream interface
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_videoio.class)
public class IStreamReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IStreamReader(Pointer p) { super(p); }


    /** \brief Read bytes from stream */
    public native long read(@Cast("char*") BytePointer buffer, long size);
    public native long read(@Cast("char*") ByteBuffer buffer, long size);
    public native long read(@Cast("char*") byte[] buffer, long size);

    /** \brief Sets the stream position
     *
     * @param offset Seek offset
     * @param origin SEEK_SET / SEEK_END / SEEK_CUR
     *
     * @see fseek
     */
    public native long seek(long offset, int origin);
}