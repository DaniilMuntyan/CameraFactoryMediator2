// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities/calibrator.proto

package kpi.trspo.restapp;

/**
 * Protobuf type {@code kpi.trspo.restapp.GetCalibratorsResponse}
 */
public  final class GetCalibratorsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kpi.trspo.restapp.GetCalibratorsResponse)
    GetCalibratorsResponseOrBuilder {
  // Use GetCalibratorsResponse.newBuilder() to construct.
  private GetCalibratorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCalibratorsResponse() {
    calibrators_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetCalibratorsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              calibrators_ = new java.util.ArrayList<kpi.trspo.restapp.CalibratorGrpc>();
              mutable_bitField0_ |= 0x00000001;
            }
            calibrators_.add(
                input.readMessage(kpi.trspo.restapp.CalibratorGrpc.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        calibrators_ = java.util.Collections.unmodifiableList(calibrators_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kpi.trspo.restapp.Calibrator.internal_static_kpi_trspo_restapp_GetCalibratorsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kpi.trspo.restapp.Calibrator.internal_static_kpi_trspo_restapp_GetCalibratorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kpi.trspo.restapp.GetCalibratorsResponse.class, kpi.trspo.restapp.GetCalibratorsResponse.Builder.class);
  }

  public static final int CALIBRATORS_FIELD_NUMBER = 1;
  private java.util.List<kpi.trspo.restapp.CalibratorGrpc> calibrators_;
  /**
   * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
   */
  public java.util.List<kpi.trspo.restapp.CalibratorGrpc> getCalibratorsList() {
    return calibrators_;
  }
  /**
   * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
   */
  public java.util.List<? extends kpi.trspo.restapp.CalibratorGrpcOrBuilder> 
      getCalibratorsOrBuilderList() {
    return calibrators_;
  }
  /**
   * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
   */
  public int getCalibratorsCount() {
    return calibrators_.size();
  }
  /**
   * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
   */
  public kpi.trspo.restapp.CalibratorGrpc getCalibrators(int index) {
    return calibrators_.get(index);
  }
  /**
   * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
   */
  public kpi.trspo.restapp.CalibratorGrpcOrBuilder getCalibratorsOrBuilder(
      int index) {
    return calibrators_.get(index);
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
    for (int i = 0; i < calibrators_.size(); i++) {
      output.writeMessage(1, calibrators_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < calibrators_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, calibrators_.get(i));
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
    if (!(obj instanceof kpi.trspo.restapp.GetCalibratorsResponse)) {
      return super.equals(obj);
    }
    kpi.trspo.restapp.GetCalibratorsResponse other = (kpi.trspo.restapp.GetCalibratorsResponse) obj;

    boolean result = true;
    result = result && getCalibratorsList()
        .equals(other.getCalibratorsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCalibratorsCount() > 0) {
      hash = (37 * hash) + CALIBRATORS_FIELD_NUMBER;
      hash = (53 * hash) + getCalibratorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.GetCalibratorsResponse parseFrom(
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
  public static Builder newBuilder(kpi.trspo.restapp.GetCalibratorsResponse prototype) {
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
   * Protobuf type {@code kpi.trspo.restapp.GetCalibratorsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kpi.trspo.restapp.GetCalibratorsResponse)
      kpi.trspo.restapp.GetCalibratorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kpi.trspo.restapp.Calibrator.internal_static_kpi_trspo_restapp_GetCalibratorsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kpi.trspo.restapp.Calibrator.internal_static_kpi_trspo_restapp_GetCalibratorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kpi.trspo.restapp.GetCalibratorsResponse.class, kpi.trspo.restapp.GetCalibratorsResponse.Builder.class);
    }

    // Construct using kpi.trspo.restapp.GetCalibratorsResponse.newBuilder()
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
        getCalibratorsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (calibratorsBuilder_ == null) {
        calibrators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        calibratorsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kpi.trspo.restapp.Calibrator.internal_static_kpi_trspo_restapp_GetCalibratorsResponse_descriptor;
    }

    public kpi.trspo.restapp.GetCalibratorsResponse getDefaultInstanceForType() {
      return kpi.trspo.restapp.GetCalibratorsResponse.getDefaultInstance();
    }

    public kpi.trspo.restapp.GetCalibratorsResponse build() {
      kpi.trspo.restapp.GetCalibratorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kpi.trspo.restapp.GetCalibratorsResponse buildPartial() {
      kpi.trspo.restapp.GetCalibratorsResponse result = new kpi.trspo.restapp.GetCalibratorsResponse(this);
      int from_bitField0_ = bitField0_;
      if (calibratorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          calibrators_ = java.util.Collections.unmodifiableList(calibrators_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.calibrators_ = calibrators_;
      } else {
        result.calibrators_ = calibratorsBuilder_.build();
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
      if (other instanceof kpi.trspo.restapp.GetCalibratorsResponse) {
        return mergeFrom((kpi.trspo.restapp.GetCalibratorsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kpi.trspo.restapp.GetCalibratorsResponse other) {
      if (other == kpi.trspo.restapp.GetCalibratorsResponse.getDefaultInstance()) return this;
      if (calibratorsBuilder_ == null) {
        if (!other.calibrators_.isEmpty()) {
          if (calibrators_.isEmpty()) {
            calibrators_ = other.calibrators_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCalibratorsIsMutable();
            calibrators_.addAll(other.calibrators_);
          }
          onChanged();
        }
      } else {
        if (!other.calibrators_.isEmpty()) {
          if (calibratorsBuilder_.isEmpty()) {
            calibratorsBuilder_.dispose();
            calibratorsBuilder_ = null;
            calibrators_ = other.calibrators_;
            bitField0_ = (bitField0_ & ~0x00000001);
            calibratorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCalibratorsFieldBuilder() : null;
          } else {
            calibratorsBuilder_.addAllMessages(other.calibrators_);
          }
        }
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
      kpi.trspo.restapp.GetCalibratorsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kpi.trspo.restapp.GetCalibratorsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<kpi.trspo.restapp.CalibratorGrpc> calibrators_ =
      java.util.Collections.emptyList();
    private void ensureCalibratorsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        calibrators_ = new java.util.ArrayList<kpi.trspo.restapp.CalibratorGrpc>(calibrators_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        kpi.trspo.restapp.CalibratorGrpc, kpi.trspo.restapp.CalibratorGrpc.Builder, kpi.trspo.restapp.CalibratorGrpcOrBuilder> calibratorsBuilder_;

    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public java.util.List<kpi.trspo.restapp.CalibratorGrpc> getCalibratorsList() {
      if (calibratorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(calibrators_);
      } else {
        return calibratorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public int getCalibratorsCount() {
      if (calibratorsBuilder_ == null) {
        return calibrators_.size();
      } else {
        return calibratorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public kpi.trspo.restapp.CalibratorGrpc getCalibrators(int index) {
      if (calibratorsBuilder_ == null) {
        return calibrators_.get(index);
      } else {
        return calibratorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder setCalibrators(
        int index, kpi.trspo.restapp.CalibratorGrpc value) {
      if (calibratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCalibratorsIsMutable();
        calibrators_.set(index, value);
        onChanged();
      } else {
        calibratorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder setCalibrators(
        int index, kpi.trspo.restapp.CalibratorGrpc.Builder builderForValue) {
      if (calibratorsBuilder_ == null) {
        ensureCalibratorsIsMutable();
        calibrators_.set(index, builderForValue.build());
        onChanged();
      } else {
        calibratorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder addCalibrators(kpi.trspo.restapp.CalibratorGrpc value) {
      if (calibratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCalibratorsIsMutable();
        calibrators_.add(value);
        onChanged();
      } else {
        calibratorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder addCalibrators(
        int index, kpi.trspo.restapp.CalibratorGrpc value) {
      if (calibratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCalibratorsIsMutable();
        calibrators_.add(index, value);
        onChanged();
      } else {
        calibratorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder addCalibrators(
        kpi.trspo.restapp.CalibratorGrpc.Builder builderForValue) {
      if (calibratorsBuilder_ == null) {
        ensureCalibratorsIsMutable();
        calibrators_.add(builderForValue.build());
        onChanged();
      } else {
        calibratorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder addCalibrators(
        int index, kpi.trspo.restapp.CalibratorGrpc.Builder builderForValue) {
      if (calibratorsBuilder_ == null) {
        ensureCalibratorsIsMutable();
        calibrators_.add(index, builderForValue.build());
        onChanged();
      } else {
        calibratorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder addAllCalibrators(
        java.lang.Iterable<? extends kpi.trspo.restapp.CalibratorGrpc> values) {
      if (calibratorsBuilder_ == null) {
        ensureCalibratorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, calibrators_);
        onChanged();
      } else {
        calibratorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder clearCalibrators() {
      if (calibratorsBuilder_ == null) {
        calibrators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        calibratorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public Builder removeCalibrators(int index) {
      if (calibratorsBuilder_ == null) {
        ensureCalibratorsIsMutable();
        calibrators_.remove(index);
        onChanged();
      } else {
        calibratorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public kpi.trspo.restapp.CalibratorGrpc.Builder getCalibratorsBuilder(
        int index) {
      return getCalibratorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public kpi.trspo.restapp.CalibratorGrpcOrBuilder getCalibratorsOrBuilder(
        int index) {
      if (calibratorsBuilder_ == null) {
        return calibrators_.get(index);  } else {
        return calibratorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public java.util.List<? extends kpi.trspo.restapp.CalibratorGrpcOrBuilder> 
         getCalibratorsOrBuilderList() {
      if (calibratorsBuilder_ != null) {
        return calibratorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(calibrators_);
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public kpi.trspo.restapp.CalibratorGrpc.Builder addCalibratorsBuilder() {
      return getCalibratorsFieldBuilder().addBuilder(
          kpi.trspo.restapp.CalibratorGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public kpi.trspo.restapp.CalibratorGrpc.Builder addCalibratorsBuilder(
        int index) {
      return getCalibratorsFieldBuilder().addBuilder(
          index, kpi.trspo.restapp.CalibratorGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CalibratorGrpc calibrators = 1;</code>
     */
    public java.util.List<kpi.trspo.restapp.CalibratorGrpc.Builder> 
         getCalibratorsBuilderList() {
      return getCalibratorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        kpi.trspo.restapp.CalibratorGrpc, kpi.trspo.restapp.CalibratorGrpc.Builder, kpi.trspo.restapp.CalibratorGrpcOrBuilder> 
        getCalibratorsFieldBuilder() {
      if (calibratorsBuilder_ == null) {
        calibratorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            kpi.trspo.restapp.CalibratorGrpc, kpi.trspo.restapp.CalibratorGrpc.Builder, kpi.trspo.restapp.CalibratorGrpcOrBuilder>(
                calibrators_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        calibrators_ = null;
      }
      return calibratorsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:kpi.trspo.restapp.GetCalibratorsResponse)
  }

  // @@protoc_insertion_point(class_scope:kpi.trspo.restapp.GetCalibratorsResponse)
  private static final kpi.trspo.restapp.GetCalibratorsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kpi.trspo.restapp.GetCalibratorsResponse();
  }

  public static kpi.trspo.restapp.GetCalibratorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCalibratorsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCalibratorsResponse>() {
    public GetCalibratorsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCalibratorsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCalibratorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCalibratorsResponse> getParserForType() {
    return PARSER;
  }

  public kpi.trspo.restapp.GetCalibratorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

