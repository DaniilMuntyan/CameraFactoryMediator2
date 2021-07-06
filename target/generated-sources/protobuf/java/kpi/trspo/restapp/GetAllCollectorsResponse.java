// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities/collector.proto

package kpi.trspo.restapp;

/**
 * Protobuf type {@code kpi.trspo.restapp.GetAllCollectorsResponse}
 */
public  final class GetAllCollectorsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kpi.trspo.restapp.GetAllCollectorsResponse)
    GetAllCollectorsResponseOrBuilder {
  // Use GetAllCollectorsResponse.newBuilder() to construct.
  private GetAllCollectorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllCollectorsResponse() {
    collectors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetAllCollectorsResponse(
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
              collectors_ = new java.util.ArrayList<kpi.trspo.restapp.CollectorGrpc>();
              mutable_bitField0_ |= 0x00000001;
            }
            collectors_.add(
                input.readMessage(kpi.trspo.restapp.CollectorGrpc.parser(), extensionRegistry));
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
        collectors_ = java.util.Collections.unmodifiableList(collectors_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kpi.trspo.restapp.Collector.internal_static_kpi_trspo_restapp_GetAllCollectorsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kpi.trspo.restapp.Collector.internal_static_kpi_trspo_restapp_GetAllCollectorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kpi.trspo.restapp.GetAllCollectorsResponse.class, kpi.trspo.restapp.GetAllCollectorsResponse.Builder.class);
  }

  public static final int COLLECTORS_FIELD_NUMBER = 1;
  private java.util.List<kpi.trspo.restapp.CollectorGrpc> collectors_;
  /**
   * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
   */
  public java.util.List<kpi.trspo.restapp.CollectorGrpc> getCollectorsList() {
    return collectors_;
  }
  /**
   * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
   */
  public java.util.List<? extends kpi.trspo.restapp.CollectorGrpcOrBuilder> 
      getCollectorsOrBuilderList() {
    return collectors_;
  }
  /**
   * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
   */
  public int getCollectorsCount() {
    return collectors_.size();
  }
  /**
   * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
   */
  public kpi.trspo.restapp.CollectorGrpc getCollectors(int index) {
    return collectors_.get(index);
  }
  /**
   * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
   */
  public kpi.trspo.restapp.CollectorGrpcOrBuilder getCollectorsOrBuilder(
      int index) {
    return collectors_.get(index);
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
    for (int i = 0; i < collectors_.size(); i++) {
      output.writeMessage(1, collectors_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < collectors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, collectors_.get(i));
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
    if (!(obj instanceof kpi.trspo.restapp.GetAllCollectorsResponse)) {
      return super.equals(obj);
    }
    kpi.trspo.restapp.GetAllCollectorsResponse other = (kpi.trspo.restapp.GetAllCollectorsResponse) obj;

    boolean result = true;
    result = result && getCollectorsList()
        .equals(other.getCollectorsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCollectorsCount() > 0) {
      hash = (37 * hash) + COLLECTORS_FIELD_NUMBER;
      hash = (53 * hash) + getCollectorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kpi.trspo.restapp.GetAllCollectorsResponse parseFrom(
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
  public static Builder newBuilder(kpi.trspo.restapp.GetAllCollectorsResponse prototype) {
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
   * Protobuf type {@code kpi.trspo.restapp.GetAllCollectorsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kpi.trspo.restapp.GetAllCollectorsResponse)
      kpi.trspo.restapp.GetAllCollectorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kpi.trspo.restapp.Collector.internal_static_kpi_trspo_restapp_GetAllCollectorsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kpi.trspo.restapp.Collector.internal_static_kpi_trspo_restapp_GetAllCollectorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kpi.trspo.restapp.GetAllCollectorsResponse.class, kpi.trspo.restapp.GetAllCollectorsResponse.Builder.class);
    }

    // Construct using kpi.trspo.restapp.GetAllCollectorsResponse.newBuilder()
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
        getCollectorsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (collectorsBuilder_ == null) {
        collectors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        collectorsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kpi.trspo.restapp.Collector.internal_static_kpi_trspo_restapp_GetAllCollectorsResponse_descriptor;
    }

    public kpi.trspo.restapp.GetAllCollectorsResponse getDefaultInstanceForType() {
      return kpi.trspo.restapp.GetAllCollectorsResponse.getDefaultInstance();
    }

    public kpi.trspo.restapp.GetAllCollectorsResponse build() {
      kpi.trspo.restapp.GetAllCollectorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kpi.trspo.restapp.GetAllCollectorsResponse buildPartial() {
      kpi.trspo.restapp.GetAllCollectorsResponse result = new kpi.trspo.restapp.GetAllCollectorsResponse(this);
      int from_bitField0_ = bitField0_;
      if (collectorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          collectors_ = java.util.Collections.unmodifiableList(collectors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.collectors_ = collectors_;
      } else {
        result.collectors_ = collectorsBuilder_.build();
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
      if (other instanceof kpi.trspo.restapp.GetAllCollectorsResponse) {
        return mergeFrom((kpi.trspo.restapp.GetAllCollectorsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kpi.trspo.restapp.GetAllCollectorsResponse other) {
      if (other == kpi.trspo.restapp.GetAllCollectorsResponse.getDefaultInstance()) return this;
      if (collectorsBuilder_ == null) {
        if (!other.collectors_.isEmpty()) {
          if (collectors_.isEmpty()) {
            collectors_ = other.collectors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCollectorsIsMutable();
            collectors_.addAll(other.collectors_);
          }
          onChanged();
        }
      } else {
        if (!other.collectors_.isEmpty()) {
          if (collectorsBuilder_.isEmpty()) {
            collectorsBuilder_.dispose();
            collectorsBuilder_ = null;
            collectors_ = other.collectors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            collectorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCollectorsFieldBuilder() : null;
          } else {
            collectorsBuilder_.addAllMessages(other.collectors_);
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
      kpi.trspo.restapp.GetAllCollectorsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kpi.trspo.restapp.GetAllCollectorsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<kpi.trspo.restapp.CollectorGrpc> collectors_ =
      java.util.Collections.emptyList();
    private void ensureCollectorsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        collectors_ = new java.util.ArrayList<kpi.trspo.restapp.CollectorGrpc>(collectors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        kpi.trspo.restapp.CollectorGrpc, kpi.trspo.restapp.CollectorGrpc.Builder, kpi.trspo.restapp.CollectorGrpcOrBuilder> collectorsBuilder_;

    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public java.util.List<kpi.trspo.restapp.CollectorGrpc> getCollectorsList() {
      if (collectorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(collectors_);
      } else {
        return collectorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public int getCollectorsCount() {
      if (collectorsBuilder_ == null) {
        return collectors_.size();
      } else {
        return collectorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public kpi.trspo.restapp.CollectorGrpc getCollectors(int index) {
      if (collectorsBuilder_ == null) {
        return collectors_.get(index);
      } else {
        return collectorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder setCollectors(
        int index, kpi.trspo.restapp.CollectorGrpc value) {
      if (collectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectorsIsMutable();
        collectors_.set(index, value);
        onChanged();
      } else {
        collectorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder setCollectors(
        int index, kpi.trspo.restapp.CollectorGrpc.Builder builderForValue) {
      if (collectorsBuilder_ == null) {
        ensureCollectorsIsMutable();
        collectors_.set(index, builderForValue.build());
        onChanged();
      } else {
        collectorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder addCollectors(kpi.trspo.restapp.CollectorGrpc value) {
      if (collectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectorsIsMutable();
        collectors_.add(value);
        onChanged();
      } else {
        collectorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder addCollectors(
        int index, kpi.trspo.restapp.CollectorGrpc value) {
      if (collectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectorsIsMutable();
        collectors_.add(index, value);
        onChanged();
      } else {
        collectorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder addCollectors(
        kpi.trspo.restapp.CollectorGrpc.Builder builderForValue) {
      if (collectorsBuilder_ == null) {
        ensureCollectorsIsMutable();
        collectors_.add(builderForValue.build());
        onChanged();
      } else {
        collectorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder addCollectors(
        int index, kpi.trspo.restapp.CollectorGrpc.Builder builderForValue) {
      if (collectorsBuilder_ == null) {
        ensureCollectorsIsMutable();
        collectors_.add(index, builderForValue.build());
        onChanged();
      } else {
        collectorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder addAllCollectors(
        java.lang.Iterable<? extends kpi.trspo.restapp.CollectorGrpc> values) {
      if (collectorsBuilder_ == null) {
        ensureCollectorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, collectors_);
        onChanged();
      } else {
        collectorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder clearCollectors() {
      if (collectorsBuilder_ == null) {
        collectors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        collectorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public Builder removeCollectors(int index) {
      if (collectorsBuilder_ == null) {
        ensureCollectorsIsMutable();
        collectors_.remove(index);
        onChanged();
      } else {
        collectorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public kpi.trspo.restapp.CollectorGrpc.Builder getCollectorsBuilder(
        int index) {
      return getCollectorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public kpi.trspo.restapp.CollectorGrpcOrBuilder getCollectorsOrBuilder(
        int index) {
      if (collectorsBuilder_ == null) {
        return collectors_.get(index);  } else {
        return collectorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public java.util.List<? extends kpi.trspo.restapp.CollectorGrpcOrBuilder> 
         getCollectorsOrBuilderList() {
      if (collectorsBuilder_ != null) {
        return collectorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(collectors_);
      }
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public kpi.trspo.restapp.CollectorGrpc.Builder addCollectorsBuilder() {
      return getCollectorsFieldBuilder().addBuilder(
          kpi.trspo.restapp.CollectorGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public kpi.trspo.restapp.CollectorGrpc.Builder addCollectorsBuilder(
        int index) {
      return getCollectorsFieldBuilder().addBuilder(
          index, kpi.trspo.restapp.CollectorGrpc.getDefaultInstance());
    }
    /**
     * <code>repeated .kpi.trspo.restapp.CollectorGrpc collectors = 1;</code>
     */
    public java.util.List<kpi.trspo.restapp.CollectorGrpc.Builder> 
         getCollectorsBuilderList() {
      return getCollectorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        kpi.trspo.restapp.CollectorGrpc, kpi.trspo.restapp.CollectorGrpc.Builder, kpi.trspo.restapp.CollectorGrpcOrBuilder> 
        getCollectorsFieldBuilder() {
      if (collectorsBuilder_ == null) {
        collectorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            kpi.trspo.restapp.CollectorGrpc, kpi.trspo.restapp.CollectorGrpc.Builder, kpi.trspo.restapp.CollectorGrpcOrBuilder>(
                collectors_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        collectors_ = null;
      }
      return collectorsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:kpi.trspo.restapp.GetAllCollectorsResponse)
  }

  // @@protoc_insertion_point(class_scope:kpi.trspo.restapp.GetAllCollectorsResponse)
  private static final kpi.trspo.restapp.GetAllCollectorsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kpi.trspo.restapp.GetAllCollectorsResponse();
  }

  public static kpi.trspo.restapp.GetAllCollectorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAllCollectorsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAllCollectorsResponse>() {
    public GetAllCollectorsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAllCollectorsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAllCollectorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllCollectorsResponse> getParserForType() {
    return PARSER;
  }

  public kpi.trspo.restapp.GetAllCollectorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
