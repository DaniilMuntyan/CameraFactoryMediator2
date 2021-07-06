// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/assembleBack.proto

package kpi.trspo.restapp;

/**
 * Protobuf type {@code kpi.trspo.restapp.AssembleBackResponse}
 */
public  final class AssembleBackResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kpi.trspo.restapp.AssembleBackResponse)
    AssembleBackResponseOrBuilder {
  // Use AssembleBackResponse.newBuilder() to construct.
  private AssembleBackResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssembleBackResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AssembleBackResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            kpi.trspo.restapp.CameraBackGrpc.Builder subBuilder = null;
            if (cameraBack_ != null) {
              subBuilder = cameraBack_.toBuilder();
            }
            cameraBack_ = input.readMessage(kpi.trspo.restapp.CameraBackGrpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cameraBack_);
              cameraBack_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kpi.trspo.restapp.AssembleBack.internal_static_kpi_trspo_restapp_AssembleBackResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kpi.trspo.restapp.AssembleBack.internal_static_kpi_trspo_restapp_AssembleBackResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kpi.trspo.restapp.AssembleBackResponse.class, kpi.trspo.restapp.AssembleBackResponse.Builder.class);
  }

  public static final int CAMERABACK_FIELD_NUMBER = 1;
  private kpi.trspo.restapp.CameraBackGrpc cameraBack_;
  /**
   * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
   */
  public boolean hasCameraBack() {
    return cameraBack_ != null;
  }
  /**
   * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
   */
  public kpi.trspo.restapp.CameraBackGrpc getCameraBack() {
    return cameraBack_ == null ? kpi.trspo.restapp.CameraBackGrpc.getDefaultInstance() : cameraBack_;
  }
  /**
   * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
   */
  public kpi.trspo.restapp.CameraBackGrpcOrBuilder getCameraBackOrBuilder() {
    return getCameraBack();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (cameraBack_ != null) {
      output.writeMessage(1, getCameraBack());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cameraBack_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCameraBack());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof kpi.trspo.restapp.AssembleBackResponse)) {
      return super.equals(obj);
    }
    kpi.trspo.restapp.AssembleBackResponse other = (kpi.trspo.restapp.AssembleBackResponse) obj;

    boolean result = true;
    result = result && (hasCameraBack() == other.hasCameraBack());
    if (hasCameraBack()) {
      result = result && getCameraBack()
          .equals(other.getCameraBack());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCameraBack()) {
      hash = (37 * hash) + CAMERABACK_FIELD_NUMBER;
      hash = (53 * hash) + getCameraBack().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.AssembleBackResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(kpi.trspo.restapp.AssembleBackResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code kpi.trspo.restapp.AssembleBackResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kpi.trspo.restapp.AssembleBackResponse)
      kpi.trspo.restapp.AssembleBackResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kpi.trspo.restapp.AssembleBack.internal_static_kpi_trspo_restapp_AssembleBackResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kpi.trspo.restapp.AssembleBack.internal_static_kpi_trspo_restapp_AssembleBackResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kpi.trspo.restapp.AssembleBackResponse.class, kpi.trspo.restapp.AssembleBackResponse.Builder.class);
    }

    // Construct using kpi.trspo.restapp.AssembleBackResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (cameraBackBuilder_ == null) {
        cameraBack_ = null;
      } else {
        cameraBack_ = null;
        cameraBackBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kpi.trspo.restapp.AssembleBack.internal_static_kpi_trspo_restapp_AssembleBackResponse_descriptor;
    }

    public kpi.trspo.restapp.AssembleBackResponse getDefaultInstanceForType() {
      return kpi.trspo.restapp.AssembleBackResponse.getDefaultInstance();
    }

    public kpi.trspo.restapp.AssembleBackResponse build() {
      kpi.trspo.restapp.AssembleBackResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kpi.trspo.restapp.AssembleBackResponse buildPartial() {
      kpi.trspo.restapp.AssembleBackResponse result = new kpi.trspo.restapp.AssembleBackResponse(this);
      if (cameraBackBuilder_ == null) {
        result.cameraBack_ = cameraBack_;
      } else {
        result.cameraBack_ = cameraBackBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof kpi.trspo.restapp.AssembleBackResponse) {
        return mergeFrom((kpi.trspo.restapp.AssembleBackResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kpi.trspo.restapp.AssembleBackResponse other) {
      if (other == kpi.trspo.restapp.AssembleBackResponse.getDefaultInstance()) return this;
      if (other.hasCameraBack()) {
        mergeCameraBack(other.getCameraBack());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      kpi.trspo.restapp.AssembleBackResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kpi.trspo.restapp.AssembleBackResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private kpi.trspo.restapp.CameraBackGrpc cameraBack_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.CameraBackGrpc, kpi.trspo.restapp.CameraBackGrpc.Builder, kpi.trspo.restapp.CameraBackGrpcOrBuilder> cameraBackBuilder_;
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    public boolean hasCameraBack() {
      return cameraBackBuilder_ != null || cameraBack_ != null;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    public kpi.trspo.restapp.CameraBackGrpc getCameraBack() {
      if (cameraBackBuilder_ == null) {
        return cameraBack_ == null ? kpi.trspo.restapp.CameraBackGrpc.getDefaultInstance() : cameraBack_;
      } else {
        return cameraBackBuilder_.getMessage();
      }
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    public Builder setCameraBack(kpi.trspo.restapp.CameraBackGrpc value) {
      if (cameraBackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cameraBack_ = value;
        onChanged();
      } else {
        cameraBackBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    public Builder setCameraBack(
        kpi.trspo.restapp.CameraBackGrpc.Builder builderForValue) {
      if (cameraBackBuilder_ == null) {
        cameraBack_ = builderForValue.build();
        onChanged();
      } else {
        cameraBackBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    public Builder mergeCameraBack(kpi.trspo.restapp.CameraBackGrpc value) {
      if (cameraBackBuilder_ == null) {
        if (cameraBack_ != null) {
          cameraBack_ =
            kpi.trspo.restapp.CameraBackGrpc.newBuilder(cameraBack_).mergeFrom(value).buildPartial();
        } else {
          cameraBack_ = value;
        }
        onChanged();
      } else {
        cameraBackBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    public Builder clearCameraBack() {
      if (cameraBackBuilder_ == null) {
        cameraBack_ = null;
        onChanged();
      } else {
        cameraBack_ = null;
        cameraBackBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    public kpi.trspo.restapp.CameraBackGrpc.Builder getCameraBackBuilder() {
      
      onChanged();
      return getCameraBackFieldBuilder().getBuilder();
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    public kpi.trspo.restapp.CameraBackGrpcOrBuilder getCameraBackOrBuilder() {
      if (cameraBackBuilder_ != null) {
        return cameraBackBuilder_.getMessageOrBuilder();
      } else {
        return cameraBack_ == null ?
            kpi.trspo.restapp.CameraBackGrpc.getDefaultInstance() : cameraBack_;
      }
    }
    /**
     * <code>.kpi.trspo.restapp.CameraBackGrpc cameraBack = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kpi.trspo.restapp.CameraBackGrpc, kpi.trspo.restapp.CameraBackGrpc.Builder, kpi.trspo.restapp.CameraBackGrpcOrBuilder> 
        getCameraBackFieldBuilder() {
      if (cameraBackBuilder_ == null) {
        cameraBackBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kpi.trspo.restapp.CameraBackGrpc, kpi.trspo.restapp.CameraBackGrpc.Builder, kpi.trspo.restapp.CameraBackGrpcOrBuilder>(
                getCameraBack(),
                getParentForChildren(),
                isClean());
        cameraBack_ = null;
      }
      return cameraBackBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:kpi.trspo.restapp.AssembleBackResponse)
  }

  // @@protoc_insertion_point(class_scope:kpi.trspo.restapp.AssembleBackResponse)
  private static final kpi.trspo.restapp.AssembleBackResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kpi.trspo.restapp.AssembleBackResponse();
  }

  public static kpi.trspo.restapp.AssembleBackResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssembleBackResponse>
      PARSER = new com.google.protobuf.AbstractParser<AssembleBackResponse>() {
    public AssembleBackResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssembleBackResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssembleBackResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssembleBackResponse> getParserForType() {
    return PARSER;
  }

  public kpi.trspo.restapp.AssembleBackResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

