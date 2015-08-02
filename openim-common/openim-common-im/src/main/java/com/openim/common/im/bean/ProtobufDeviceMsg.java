// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: devicemsg.proto

package com.openim.common.im.bean;

public final class ProtobufDeviceMsg {
  private ProtobufDeviceMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DeviceMsgOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 type = 1;
    boolean hasType();
    int getType();
    
    // optional string to = 2;
    boolean hasTo();
    String getTo();
    
    // optional string msg = 3;
    boolean hasMsg();
    String getMsg();
    
    // optional string from = 4;
    boolean hasFrom();
    String getFrom();
    
    // optional string loginId = 5;
    boolean hasLoginId();
    String getLoginId();
    
    // optional string pwd = 6;
    boolean hasPwd();
    String getPwd();
    
    // optional string serverQueue = 7;
    boolean hasServerQueue();
    String getServerQueue();
  }
  public static final class DeviceMsg extends
      com.google.protobuf.GeneratedMessage
      implements DeviceMsgOrBuilder {
    // Use DeviceMsg.newBuilder() to construct.
    private DeviceMsg(Builder builder) {
      super(builder);
    }
    private DeviceMsg(boolean noInit) {}
    
    private static final DeviceMsg defaultInstance;
    public static DeviceMsg getDefaultInstance() {
      return defaultInstance;
    }
    
    public DeviceMsg getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.openim.common.im.bean.ProtobufDeviceMsg.internal_static_openim_DeviceMsg_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.openim.common.im.bean.ProtobufDeviceMsg.internal_static_openim_DeviceMsg_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getType() {
      return type_;
    }
    
    // optional string to = 2;
    public static final int TO_FIELD_NUMBER = 2;
    private java.lang.Object to_;
    public boolean hasTo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getTo() {
      java.lang.Object ref = to_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          to_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getToBytes() {
      java.lang.Object ref = to_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string msg = 3;
    public static final int MSG_FIELD_NUMBER = 3;
    private java.lang.Object msg_;
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          msg_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string from = 4;
    public static final int FROM_FIELD_NUMBER = 4;
    private java.lang.Object from_;
    public boolean hasFrom() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getFrom() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          from_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string loginId = 5;
    public static final int LOGINID_FIELD_NUMBER = 5;
    private java.lang.Object loginId_;
    public boolean hasLoginId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getLoginId() {
      java.lang.Object ref = loginId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          loginId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLoginIdBytes() {
      java.lang.Object ref = loginId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        loginId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string pwd = 6;
    public static final int PWD_FIELD_NUMBER = 6;
    private java.lang.Object pwd_;
    public boolean hasPwd() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getPwd() {
      java.lang.Object ref = pwd_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          pwd_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPwdBytes() {
      java.lang.Object ref = pwd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        pwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string serverQueue = 7;
    public static final int SERVERQUEUE_FIELD_NUMBER = 7;
    private java.lang.Object serverQueue_;
    public boolean hasServerQueue() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getServerQueue() {
      java.lang.Object ref = serverQueue_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          serverQueue_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getServerQueueBytes() {
      java.lang.Object ref = serverQueue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        serverQueue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      type_ = 0;
      to_ = "";
      msg_ = "";
      from_ = "";
      loginId_ = "";
      pwd_ = "";
      serverQueue_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getToBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMsgBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getFromBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getLoginIdBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getPwdBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getServerQueueBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getToBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMsgBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getFromBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getLoginIdBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getPwdBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getServerQueueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.openim.common.im.bean.ProtobufDeviceMsg.internal_static_openim_DeviceMsg_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.openim.common.im.bean.ProtobufDeviceMsg.internal_static_openim_DeviceMsg_fieldAccessorTable;
      }
      
      // Construct using com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        to_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        from_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        loginId_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        pwd_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        serverQueue_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg.getDescriptor();
      }
      
      public com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg getDefaultInstanceForType() {
        return com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg.getDefaultInstance();
      }
      
      public com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg build() {
        com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg buildPartial() {
        com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg result = new com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.to_ = to_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.msg_ = msg_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.from_ = from_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.loginId_ = loginId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.pwd_ = pwd_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.serverQueue_ = serverQueue_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg) {
          return mergeFrom((com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg other) {
        if (other == com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasTo()) {
          setTo(other.getTo());
        }
        if (other.hasMsg()) {
          setMsg(other.getMsg());
        }
        if (other.hasFrom()) {
          setFrom(other.getFrom());
        }
        if (other.hasLoginId()) {
          setLoginId(other.getLoginId());
        }
        if (other.hasPwd()) {
          setPwd(other.getPwd());
        }
        if (other.hasServerQueue()) {
          setServerQueue(other.getServerQueue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              to_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              msg_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              from_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              loginId_ = input.readBytes();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              pwd_ = input.readBytes();
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              serverQueue_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 type = 1;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // optional string to = 2;
      private java.lang.Object to_ = "";
      public boolean hasTo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getTo() {
        java.lang.Object ref = to_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          to_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTo(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        to_ = value;
        onChanged();
        return this;
      }
      public Builder clearTo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        to_ = getDefaultInstance().getTo();
        onChanged();
        return this;
      }
      void setTo(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        to_ = value;
        onChanged();
      }
      
      // optional string msg = 3;
      private java.lang.Object msg_ = "";
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMsg(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        msg_ = value;
        onChanged();
        return this;
      }
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000004);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      void setMsg(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        msg_ = value;
        onChanged();
      }
      
      // optional string from = 4;
      private java.lang.Object from_ = "";
      public boolean hasFrom() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getFrom() {
        java.lang.Object ref = from_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setFrom(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        from_ = value;
        onChanged();
        return this;
      }
      public Builder clearFrom() {
        bitField0_ = (bitField0_ & ~0x00000008);
        from_ = getDefaultInstance().getFrom();
        onChanged();
        return this;
      }
      void setFrom(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        from_ = value;
        onChanged();
      }
      
      // optional string loginId = 5;
      private java.lang.Object loginId_ = "";
      public boolean hasLoginId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getLoginId() {
        java.lang.Object ref = loginId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          loginId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLoginId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        loginId_ = value;
        onChanged();
        return this;
      }
      public Builder clearLoginId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        loginId_ = getDefaultInstance().getLoginId();
        onChanged();
        return this;
      }
      void setLoginId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        loginId_ = value;
        onChanged();
      }
      
      // optional string pwd = 6;
      private java.lang.Object pwd_ = "";
      public boolean hasPwd() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getPwd() {
        java.lang.Object ref = pwd_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          pwd_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPwd(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        pwd_ = value;
        onChanged();
        return this;
      }
      public Builder clearPwd() {
        bitField0_ = (bitField0_ & ~0x00000020);
        pwd_ = getDefaultInstance().getPwd();
        onChanged();
        return this;
      }
      void setPwd(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        pwd_ = value;
        onChanged();
      }
      
      // optional string serverQueue = 7;
      private java.lang.Object serverQueue_ = "";
      public boolean hasServerQueue() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getServerQueue() {
        java.lang.Object ref = serverQueue_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          serverQueue_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setServerQueue(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        serverQueue_ = value;
        onChanged();
        return this;
      }
      public Builder clearServerQueue() {
        bitField0_ = (bitField0_ & ~0x00000040);
        serverQueue_ = getDefaultInstance().getServerQueue();
        onChanged();
        return this;
      }
      void setServerQueue(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        serverQueue_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:openim.DeviceMsg)
    }
    
    static {
      defaultInstance = new DeviceMsg(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:openim.DeviceMsg)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_openim_DeviceMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_openim_DeviceMsg_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017devicemsg.proto\022\006openim\"s\n\tDeviceMsg\022\014" +
      "\n\004type\030\001 \002(\005\022\n\n\002to\030\002 \001(\t\022\013\n\003msg\030\003 \001(\t\022\014\n" +
      "\004from\030\004 \001(\t\022\017\n\007loginId\030\005 \001(\t\022\013\n\003pwd\030\006 \001(" +
      "\t\022\023\n\013serverQueue\030\007 \001(\tB.\n\031com.openim.com" +
      "mon.im.beanB\021ProtobufDeviceMsg"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_openim_DeviceMsg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_openim_DeviceMsg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_openim_DeviceMsg_descriptor,
              new java.lang.String[] { "Type", "To", "Msg", "From", "LoginId", "Pwd", "ServerQueue", },
              com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg.class,
              com.openim.common.im.bean.ProtobufDeviceMsg.DeviceMsg.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}