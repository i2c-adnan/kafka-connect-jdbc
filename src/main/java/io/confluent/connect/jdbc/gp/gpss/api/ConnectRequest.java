// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package io.confluent.connect.jdbc.gp.gpss.api;

/**
 * <pre>
 * Connect service Request message
 * </pre>
 *
 * Protobuf type {@code ConnectRequest}
 */
public  final class ConnectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.ConnectRequest)
    ConnectRequestOrBuilder {
  // Use ConnectRequest.newBuilder() to construct.
  private ConnectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectRequest() {
    host_ = "";
    port_ = 0;
    username_ = "";
    password_ = "";
    dB_ = "";
    useSSL_ = false;
    sessionTimeout_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ConnectRequest(
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
            String s = input.readStringRequireUtf8();

            host_ = s;
            break;
          }
          case 16: {

            port_ = input.readInt32();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            password_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            dB_ = s;
            break;
          }
          case 48: {

            useSSL_ = input.readBool();
            break;
          }
          case 56: {

            sessionTimeout_ = input.readInt32();
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
    return GpssOuterClass.internal_static_api_ConnectRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GpssOuterClass.internal_static_api_ConnectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ConnectRequest.class, ConnectRequest.Builder.class);
  }

  public static final int HOST_FIELD_NUMBER = 1;
  private volatile Object host_;
  /**
   * <pre>
   * Host address of Greenplum coordinator; must be accessible from gpss server system
   * </pre>
   *
   * <code>string Host = 1;</code>
   */
  public String getHost() {
    Object ref = host_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Host address of Greenplum coordinator; must be accessible from gpss server system
   * </pre>
   *
   * <code>string Host = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHostBytes() {
    Object ref = host_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <pre>
   * Greenplum coordinator port
   * </pre>
   *
   * <code>int32 Port = 2;</code>
   */
  public int getPort() {
    return port_;
  }

  public static final int USERNAME_FIELD_NUMBER = 3;
  private volatile Object username_;
  /**
   * <pre>
   * User or role name that gpss uses to access Greenplum
   * </pre>
   *
   * <code>string Username = 3;</code>
   */
  public String getUsername() {
    Object ref = username_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * User or role name that gpss uses to access Greenplum
   * </pre>
   *
   * <code>string Username = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    Object ref = username_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORD_FIELD_NUMBER = 4;
  private volatile Object password_;
  /**
   * <pre>
   * User password
   * </pre>
   *
   * <code>string Password = 4;</code>
   */
  public String getPassword() {
    Object ref = password_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * User password
   * </pre>
   *
   * <code>string Password = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    Object ref = password_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DB_FIELD_NUMBER = 5;
  private volatile Object dB_;
  /**
   * <pre>
   * Database name
   * </pre>
   *
   * <code>string DB = 5;</code>
   */
  public String getDB() {
    Object ref = dB_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      dB_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Database name
   * </pre>
   *
   * <code>string DB = 5;</code>
   */
  public com.google.protobuf.ByteString
      getDBBytes() {
    Object ref = dB_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      dB_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USESSL_FIELD_NUMBER = 6;
  private boolean useSSL_;
  /**
   * <pre>
   * Use SSL or not; ignored, use the gpss config file to config SSL
   * </pre>
   *
   * <code>bool UseSSL = 6;</code>
   */
  public boolean getUseSSL() {
    return useSSL_;
  }

  public static final int SESSIONTIMEOUT_FIELD_NUMBER = 7;
  private int sessionTimeout_;
  /**
   * <pre>
   * Release the session after idle for specified number of seconds
   * </pre>
   *
   * <code>int32 SessionTimeout = 7;</code>
   */
  public int getSessionTimeout() {
    return sessionTimeout_;
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
    if (!getHostBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, host_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, username_);
    }
    if (!getPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, password_);
    }
    if (!getDBBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, dB_);
    }
    if (useSSL_ != false) {
      output.writeBool(6, useSSL_);
    }
    if (sessionTimeout_ != 0) {
      output.writeInt32(7, sessionTimeout_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHostBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, host_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, port_);
    }
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, username_);
    }
    if (!getPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, password_);
    }
    if (!getDBBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, dB_);
    }
    if (useSSL_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, useSSL_);
    }
    if (sessionTimeout_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, sessionTimeout_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ConnectRequest)) {
      return super.equals(obj);
    }
    ConnectRequest other =  (ConnectRequest) obj;

    boolean result = true;
    result = result && getHost()
        .equals(other.getHost());
    result = result && (getPort()
        == other.getPort());
    result = result && getUsername()
        .equals(other.getUsername());
    result = result && getPassword()
        .equals(other.getPassword());
    result = result && getDB()
        .equals(other.getDB());
    result = result && (getUseSSL()
        == other.getUseSSL());
    result = result && (getSessionTimeout()
        == other.getSessionTimeout());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (37 * hash) + DB_FIELD_NUMBER;
    hash = (53 * hash) + getDB().hashCode();
    hash = (37 * hash) + USESSL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseSSL());
    hash = (37 * hash) + SESSIONTIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + getSessionTimeout();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ConnectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConnectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConnectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConnectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConnectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConnectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConnectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConnectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConnectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ConnectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConnectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConnectRequest parseFrom(
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
  public static Builder newBuilder (ConnectRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Connect service Request message
   * </pre>
   *
   * Protobuf type {@code ConnectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.ConnectRequest)
      ConnectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GpssOuterClass.internal_static_api_ConnectRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GpssOuterClass.internal_static_api_ConnectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ConnectRequest.class, ConnectRequest.Builder.class);
    }

    // Construct using ConnectRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      host_ = "";

      port_ = 0;

      username_ = "";

      password_ = "";

      dB_ = "";

      useSSL_ = false;

      sessionTimeout_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GpssOuterClass.internal_static_api_ConnectRequest_descriptor;
    }

    public ConnectRequest getDefaultInstanceForType() {
      return ConnectRequest.getDefaultInstance();
    }

    public ConnectRequest build() {
      ConnectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ConnectRequest buildPartial() {
      ConnectRequest result = new ConnectRequest(this);
      result.host_ = host_;
      result.port_ = port_;
      result.username_ = username_;
      result.password_ = password_;
      result.dB_ = dB_;
      result.useSSL_ = useSSL_;
      result.sessionTimeout_ = sessionTimeout_;
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
      if (other instanceof ConnectRequest) {
        return mergeFrom( (ConnectRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom (ConnectRequest other) {
      if (other == ConnectRequest.getDefaultInstance()) return this;
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
      }
      if (!other.getDB().isEmpty()) {
        dB_ = other.dB_;
        onChanged();
      }
      if (other.getUseSSL() != false) {
        setUseSSL(other.getUseSSL());
      }
      if (other.getSessionTimeout() != 0) {
        setSessionTimeout(other.getSessionTimeout());
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
      ConnectRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =  (ConnectRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object host_ = "";
    /**
     * <pre>
     * Host address of Greenplum coordinator; must be accessible from gpss server system
     * </pre>
     *
     * <code>string Host = 1;</code>
     */
    public String getHost() {
      Object ref = host_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Host address of Greenplum coordinator; must be accessible from gpss server system
     * </pre>
     *
     * <code>string Host = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Host address of Greenplum coordinator; must be accessible from gpss server system
     * </pre>
     *
     * <code>string Host = 1;</code>
     */
    public Builder setHost(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      host_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host address of Greenplum coordinator; must be accessible from gpss server system
     * </pre>
     *
     * <code>string Host = 1;</code>
     */
    public Builder clearHost() {
      
      host_ = getDefaultInstance().getHost();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host address of Greenplum coordinator; must be accessible from gpss server system
     * </pre>
     *
     * <code>string Host = 1;</code>
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      host_ = value;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <pre>
     * Greenplum coordinator port
     * </pre>
     *
     * <code>int32 Port = 2;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <pre>
     * Greenplum coordinator port
     * </pre>
     *
     * <code>int32 Port = 2;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Greenplum coordinator port
     * </pre>
     *
     * <code>int32 Port = 2;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private Object username_ = "";
    /**
     * <pre>
     * User or role name that gpss uses to access Greenplum
     * </pre>
     *
     * <code>string Username = 3;</code>
     */
    public String getUsername() {
      Object ref = username_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * User or role name that gpss uses to access Greenplum
     * </pre>
     *
     * <code>string Username = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * User or role name that gpss uses to access Greenplum
     * </pre>
     *
     * <code>string Username = 3;</code>
     */
    public Builder setUsername(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User or role name that gpss uses to access Greenplum
     * </pre>
     *
     * <code>string Username = 3;</code>
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User or role name that gpss uses to access Greenplum
     * </pre>
     *
     * <code>string Username = 3;</code>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private Object password_ = "";
    /**
     * <pre>
     * User password
     * </pre>
     *
     * <code>string Password = 4;</code>
     */
    public String getPassword() {
      Object ref = password_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * User password
     * </pre>
     *
     * <code>string Password = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * User password
     * </pre>
     *
     * <code>string Password = 4;</code>
     */
    public Builder setPassword(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User password
     * </pre>
     *
     * <code>string Password = 4;</code>
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User password
     * </pre>
     *
     * <code>string Password = 4;</code>
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
      onChanged();
      return this;
    }

    private Object dB_ = "";
    /**
     * <pre>
     * Database name
     * </pre>
     *
     * <code>string DB = 5;</code>
     */
    public String getDB() {
      Object ref = dB_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        dB_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Database name
     * </pre>
     *
     * <code>string DB = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDBBytes() {
      Object ref = dB_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        dB_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Database name
     * </pre>
     *
     * <code>string DB = 5;</code>
     */
    public Builder setDB(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dB_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Database name
     * </pre>
     *
     * <code>string DB = 5;</code>
     */
    public Builder clearDB() {
      
      dB_ = getDefaultInstance().getDB();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Database name
     * </pre>
     *
     * <code>string DB = 5;</code>
     */
    public Builder setDBBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dB_ = value;
      onChanged();
      return this;
    }

    private boolean useSSL_ ;
    /**
     * <pre>
     * Use SSL or not; ignored, use the gpss config file to config SSL
     * </pre>
     *
     * <code>bool UseSSL = 6;</code>
     */
    public boolean getUseSSL() {
      return useSSL_;
    }
    /**
     * <pre>
     * Use SSL or not; ignored, use the gpss config file to config SSL
     * </pre>
     *
     * <code>bool UseSSL = 6;</code>
     */
    public Builder setUseSSL(boolean value) {
      
      useSSL_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Use SSL or not; ignored, use the gpss config file to config SSL
     * </pre>
     *
     * <code>bool UseSSL = 6;</code>
     */
    public Builder clearUseSSL() {
      
      useSSL_ = false;
      onChanged();
      return this;
    }

    private int sessionTimeout_ ;
    /**
     * <pre>
     * Release the session after idle for specified number of seconds
     * </pre>
     *
     * <code>int32 SessionTimeout = 7;</code>
     */
    public int getSessionTimeout() {
      return sessionTimeout_;
    }
    /**
     * <pre>
     * Release the session after idle for specified number of seconds
     * </pre>
     *
     * <code>int32 SessionTimeout = 7;</code>
     */
    public Builder setSessionTimeout(int value) {
      
      sessionTimeout_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Release the session after idle for specified number of seconds
     * </pre>
     *
     * <code>int32 SessionTimeout = 7;</code>
     */
    public Builder clearSessionTimeout() {
      
      sessionTimeout_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.ConnectRequest)
  }

  // @@protoc_insertion_point(class_scope:api.ConnectRequest)
  private static final ConnectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ConnectRequest();
  }

  public static ConnectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectRequest>
      PARSER = new com.google.protobuf.AbstractParser<ConnectRequest>() {
    public ConnectRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConnectRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConnectRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ConnectRequest> getParserForType() {
    return PARSER;
  }

  public ConnectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

