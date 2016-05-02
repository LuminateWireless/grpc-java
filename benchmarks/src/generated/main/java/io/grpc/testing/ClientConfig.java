// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qpstest.proto

package io.grpc.testing;

/**
 * Protobuf type {@code grpc.testing.ClientConfig}
 */
public  final class ClientConfig extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.testing.ClientConfig)
    ClientConfigOrBuilder {
  // Use ClientConfig.newBuilder() to construct.
  private ClientConfig(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ClientConfig() {
    serverTargets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    clientType_ = 0;
    enableSsl_ = false;
    outstandingRpcsPerChannel_ = 0;
    clientChannels_ = 0;
    payloadSize_ = 0;
    asyncClientThreads_ = 0;
    rpcType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClientConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              serverTargets_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            serverTargets_.add(s);
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            clientType_ = rawValue;
            break;
          }
          case 24: {

            enableSsl_ = input.readBool();
            break;
          }
          case 32: {

            outstandingRpcsPerChannel_ = input.readInt32();
            break;
          }
          case 40: {

            clientChannels_ = input.readInt32();
            break;
          }
          case 48: {

            payloadSize_ = input.readInt32();
            break;
          }
          case 56: {

            asyncClientThreads_ = input.readInt32();
            break;
          }
          case 64: {
            int rawValue = input.readEnum();

            rpcType_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        serverTargets_ = serverTargets_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.testing.ClientConfig.class, io.grpc.testing.ClientConfig.Builder.class);
  }

  private int bitField0_;
  public static final int SERVER_TARGETS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList serverTargets_;
  /**
   * <code>repeated string server_targets = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getServerTargetsList() {
    return serverTargets_;
  }
  /**
   * <code>repeated string server_targets = 1;</code>
   */
  public int getServerTargetsCount() {
    return serverTargets_.size();
  }
  /**
   * <code>repeated string server_targets = 1;</code>
   */
  public java.lang.String getServerTargets(int index) {
    return serverTargets_.get(index);
  }
  /**
   * <code>repeated string server_targets = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServerTargetsBytes(int index) {
    return serverTargets_.getByteString(index);
  }

  public static final int CLIENT_TYPE_FIELD_NUMBER = 2;
  private int clientType_;
  /**
   * <code>optional .grpc.testing.ClientType client_type = 2;</code>
   */
  public int getClientTypeValue() {
    return clientType_;
  }
  /**
   * <code>optional .grpc.testing.ClientType client_type = 2;</code>
   */
  public io.grpc.testing.ClientType getClientType() {
    io.grpc.testing.ClientType result = io.grpc.testing.ClientType.valueOf(clientType_);
    return result == null ? io.grpc.testing.ClientType.UNRECOGNIZED : result;
  }

  public static final int ENABLE_SSL_FIELD_NUMBER = 3;
  private boolean enableSsl_;
  /**
   * <code>optional bool enable_ssl = 3;</code>
   */
  public boolean getEnableSsl() {
    return enableSsl_;
  }

  public static final int OUTSTANDING_RPCS_PER_CHANNEL_FIELD_NUMBER = 4;
  private int outstandingRpcsPerChannel_;
  /**
   * <code>optional int32 outstanding_rpcs_per_channel = 4;</code>
   */
  public int getOutstandingRpcsPerChannel() {
    return outstandingRpcsPerChannel_;
  }

  public static final int CLIENT_CHANNELS_FIELD_NUMBER = 5;
  private int clientChannels_;
  /**
   * <code>optional int32 client_channels = 5;</code>
   */
  public int getClientChannels() {
    return clientChannels_;
  }

  public static final int PAYLOAD_SIZE_FIELD_NUMBER = 6;
  private int payloadSize_;
  /**
   * <code>optional int32 payload_size = 6;</code>
   */
  public int getPayloadSize() {
    return payloadSize_;
  }

  public static final int ASYNC_CLIENT_THREADS_FIELD_NUMBER = 7;
  private int asyncClientThreads_;
  /**
   * <code>optional int32 async_client_threads = 7;</code>
   *
   * <pre>
   * only for async client:
   * </pre>
   */
  public int getAsyncClientThreads() {
    return asyncClientThreads_;
  }

  public static final int RPC_TYPE_FIELD_NUMBER = 8;
  private int rpcType_;
  /**
   * <code>optional .grpc.testing.RpcType rpc_type = 8;</code>
   */
  public int getRpcTypeValue() {
    return rpcType_;
  }
  /**
   * <code>optional .grpc.testing.RpcType rpc_type = 8;</code>
   */
  public io.grpc.testing.RpcType getRpcType() {
    io.grpc.testing.RpcType result = io.grpc.testing.RpcType.valueOf(rpcType_);
    return result == null ? io.grpc.testing.RpcType.UNRECOGNIZED : result;
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
    for (int i = 0; i < serverTargets_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, serverTargets_.getRaw(i));
    }
    if (clientType_ != io.grpc.testing.ClientType.SYNCHRONOUS_CLIENT.getNumber()) {
      output.writeEnum(2, clientType_);
    }
    if (enableSsl_ != false) {
      output.writeBool(3, enableSsl_);
    }
    if (outstandingRpcsPerChannel_ != 0) {
      output.writeInt32(4, outstandingRpcsPerChannel_);
    }
    if (clientChannels_ != 0) {
      output.writeInt32(5, clientChannels_);
    }
    if (payloadSize_ != 0) {
      output.writeInt32(6, payloadSize_);
    }
    if (asyncClientThreads_ != 0) {
      output.writeInt32(7, asyncClientThreads_);
    }
    if (rpcType_ != io.grpc.testing.RpcType.UNARY.getNumber()) {
      output.writeEnum(8, rpcType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < serverTargets_.size(); i++) {
        dataSize += computeStringSizeNoTag(serverTargets_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getServerTargetsList().size();
    }
    if (clientType_ != io.grpc.testing.ClientType.SYNCHRONOUS_CLIENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, clientType_);
    }
    if (enableSsl_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enableSsl_);
    }
    if (outstandingRpcsPerChannel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, outstandingRpcsPerChannel_);
    }
    if (clientChannels_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, clientChannels_);
    }
    if (payloadSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, payloadSize_);
    }
    if (asyncClientThreads_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, asyncClientThreads_);
    }
    if (rpcType_ != io.grpc.testing.RpcType.UNARY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(8, rpcType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.testing.ClientConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.testing.ClientConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.testing.ClientConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.testing.ClientConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.testing.ClientConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.testing.ClientConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.testing.ClientConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.testing.ClientConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.testing.ClientConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.testing.ClientConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.testing.ClientConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.testing.ClientConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.testing.ClientConfig)
      io.grpc.testing.ClientConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.testing.ClientConfig.class, io.grpc.testing.ClientConfig.Builder.class);
    }

    // Construct using io.grpc.testing.ClientConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      serverTargets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      clientType_ = 0;

      enableSsl_ = false;

      outstandingRpcsPerChannel_ = 0;

      clientChannels_ = 0;

      payloadSize_ = 0;

      asyncClientThreads_ = 0;

      rpcType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientConfig_descriptor;
    }

    public io.grpc.testing.ClientConfig getDefaultInstanceForType() {
      return io.grpc.testing.ClientConfig.getDefaultInstance();
    }

    public io.grpc.testing.ClientConfig build() {
      io.grpc.testing.ClientConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.testing.ClientConfig buildPartial() {
      io.grpc.testing.ClientConfig result = new io.grpc.testing.ClientConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        serverTargets_ = serverTargets_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.serverTargets_ = serverTargets_;
      result.clientType_ = clientType_;
      result.enableSsl_ = enableSsl_;
      result.outstandingRpcsPerChannel_ = outstandingRpcsPerChannel_;
      result.clientChannels_ = clientChannels_;
      result.payloadSize_ = payloadSize_;
      result.asyncClientThreads_ = asyncClientThreads_;
      result.rpcType_ = rpcType_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.testing.ClientConfig) {
        return mergeFrom((io.grpc.testing.ClientConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.testing.ClientConfig other) {
      if (other == io.grpc.testing.ClientConfig.getDefaultInstance()) return this;
      if (!other.serverTargets_.isEmpty()) {
        if (serverTargets_.isEmpty()) {
          serverTargets_ = other.serverTargets_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureServerTargetsIsMutable();
          serverTargets_.addAll(other.serverTargets_);
        }
        onChanged();
      }
      if (other.clientType_ != 0) {
        setClientTypeValue(other.getClientTypeValue());
      }
      if (other.getEnableSsl() != false) {
        setEnableSsl(other.getEnableSsl());
      }
      if (other.getOutstandingRpcsPerChannel() != 0) {
        setOutstandingRpcsPerChannel(other.getOutstandingRpcsPerChannel());
      }
      if (other.getClientChannels() != 0) {
        setClientChannels(other.getClientChannels());
      }
      if (other.getPayloadSize() != 0) {
        setPayloadSize(other.getPayloadSize());
      }
      if (other.getAsyncClientThreads() != 0) {
        setAsyncClientThreads(other.getAsyncClientThreads());
      }
      if (other.rpcType_ != 0) {
        setRpcTypeValue(other.getRpcTypeValue());
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
      io.grpc.testing.ClientConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.testing.ClientConfig) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList serverTargets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureServerTargetsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        serverTargets_ = new com.google.protobuf.LazyStringArrayList(serverTargets_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getServerTargetsList() {
      return serverTargets_.getUnmodifiableView();
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public int getServerTargetsCount() {
      return serverTargets_.size();
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public java.lang.String getServerTargets(int index) {
      return serverTargets_.get(index);
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServerTargetsBytes(int index) {
      return serverTargets_.getByteString(index);
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public Builder setServerTargets(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureServerTargetsIsMutable();
      serverTargets_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public Builder addServerTargets(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureServerTargetsIsMutable();
      serverTargets_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public Builder addAllServerTargets(
        java.lang.Iterable<java.lang.String> values) {
      ensureServerTargetsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, serverTargets_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public Builder clearServerTargets() {
      serverTargets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string server_targets = 1;</code>
     */
    public Builder addServerTargetsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureServerTargetsIsMutable();
      serverTargets_.add(value);
      onChanged();
      return this;
    }

    private int clientType_ = 0;
    /**
     * <code>optional .grpc.testing.ClientType client_type = 2;</code>
     */
    public int getClientTypeValue() {
      return clientType_;
    }
    /**
     * <code>optional .grpc.testing.ClientType client_type = 2;</code>
     */
    public Builder setClientTypeValue(int value) {
      clientType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .grpc.testing.ClientType client_type = 2;</code>
     */
    public io.grpc.testing.ClientType getClientType() {
      io.grpc.testing.ClientType result = io.grpc.testing.ClientType.valueOf(clientType_);
      return result == null ? io.grpc.testing.ClientType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .grpc.testing.ClientType client_type = 2;</code>
     */
    public Builder setClientType(io.grpc.testing.ClientType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      clientType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .grpc.testing.ClientType client_type = 2;</code>
     */
    public Builder clearClientType() {
      
      clientType_ = 0;
      onChanged();
      return this;
    }

    private boolean enableSsl_ ;
    /**
     * <code>optional bool enable_ssl = 3;</code>
     */
    public boolean getEnableSsl() {
      return enableSsl_;
    }
    /**
     * <code>optional bool enable_ssl = 3;</code>
     */
    public Builder setEnableSsl(boolean value) {
      
      enableSsl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool enable_ssl = 3;</code>
     */
    public Builder clearEnableSsl() {
      
      enableSsl_ = false;
      onChanged();
      return this;
    }

    private int outstandingRpcsPerChannel_ ;
    /**
     * <code>optional int32 outstanding_rpcs_per_channel = 4;</code>
     */
    public int getOutstandingRpcsPerChannel() {
      return outstandingRpcsPerChannel_;
    }
    /**
     * <code>optional int32 outstanding_rpcs_per_channel = 4;</code>
     */
    public Builder setOutstandingRpcsPerChannel(int value) {
      
      outstandingRpcsPerChannel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 outstanding_rpcs_per_channel = 4;</code>
     */
    public Builder clearOutstandingRpcsPerChannel() {
      
      outstandingRpcsPerChannel_ = 0;
      onChanged();
      return this;
    }

    private int clientChannels_ ;
    /**
     * <code>optional int32 client_channels = 5;</code>
     */
    public int getClientChannels() {
      return clientChannels_;
    }
    /**
     * <code>optional int32 client_channels = 5;</code>
     */
    public Builder setClientChannels(int value) {
      
      clientChannels_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 client_channels = 5;</code>
     */
    public Builder clearClientChannels() {
      
      clientChannels_ = 0;
      onChanged();
      return this;
    }

    private int payloadSize_ ;
    /**
     * <code>optional int32 payload_size = 6;</code>
     */
    public int getPayloadSize() {
      return payloadSize_;
    }
    /**
     * <code>optional int32 payload_size = 6;</code>
     */
    public Builder setPayloadSize(int value) {
      
      payloadSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 payload_size = 6;</code>
     */
    public Builder clearPayloadSize() {
      
      payloadSize_ = 0;
      onChanged();
      return this;
    }

    private int asyncClientThreads_ ;
    /**
     * <code>optional int32 async_client_threads = 7;</code>
     *
     * <pre>
     * only for async client:
     * </pre>
     */
    public int getAsyncClientThreads() {
      return asyncClientThreads_;
    }
    /**
     * <code>optional int32 async_client_threads = 7;</code>
     *
     * <pre>
     * only for async client:
     * </pre>
     */
    public Builder setAsyncClientThreads(int value) {
      
      asyncClientThreads_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 async_client_threads = 7;</code>
     *
     * <pre>
     * only for async client:
     * </pre>
     */
    public Builder clearAsyncClientThreads() {
      
      asyncClientThreads_ = 0;
      onChanged();
      return this;
    }

    private int rpcType_ = 0;
    /**
     * <code>optional .grpc.testing.RpcType rpc_type = 8;</code>
     */
    public int getRpcTypeValue() {
      return rpcType_;
    }
    /**
     * <code>optional .grpc.testing.RpcType rpc_type = 8;</code>
     */
    public Builder setRpcTypeValue(int value) {
      rpcType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .grpc.testing.RpcType rpc_type = 8;</code>
     */
    public io.grpc.testing.RpcType getRpcType() {
      io.grpc.testing.RpcType result = io.grpc.testing.RpcType.valueOf(rpcType_);
      return result == null ? io.grpc.testing.RpcType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .grpc.testing.RpcType rpc_type = 8;</code>
     */
    public Builder setRpcType(io.grpc.testing.RpcType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      rpcType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .grpc.testing.RpcType rpc_type = 8;</code>
     */
    public Builder clearRpcType() {
      
      rpcType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.testing.ClientConfig)
  }

  // @@protoc_insertion_point(class_scope:grpc.testing.ClientConfig)
  private static final io.grpc.testing.ClientConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.testing.ClientConfig();
  }

  public static io.grpc.testing.ClientConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientConfig>
      PARSER = new com.google.protobuf.AbstractParser<ClientConfig>() {
    public ClientConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ClientConfig(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ClientConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientConfig> getParserForType() {
    return PARSER;
  }

  public io.grpc.testing.ClientConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

