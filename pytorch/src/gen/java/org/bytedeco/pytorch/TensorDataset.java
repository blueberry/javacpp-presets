// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** A dataset of tensors.
 *  Stores a single tensor internally, which is then indexed inside {@code get()}. */
@Namespace("torch::data::datasets") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorDataset extends TensorDatasetBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorDataset(Pointer p) { super(p); }

  /** Creates a {@code TensorDataset} from a vector of tensors. */
  public TensorDataset(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector tensors) { super((Pointer)null); allocate(tensors); }
  private native void allocate(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector tensors);

  public TensorDataset(@ByVal Tensor tensor) { super((Pointer)null); allocate(tensor); }
  private native void allocate(@ByVal Tensor tensor);

  /** Returns a single {@code TensorExample}. */
  public native @ByVal @Cast("torch::data::TensorExample*") Example get(@Cast("size_t") long index);

  /** Returns the number of tensors in the dataset. */
  public native @ByVal SizeTOptional size();

  public native @ByRef Tensor tensor(); public native TensorDataset tensor(Tensor setter);
}