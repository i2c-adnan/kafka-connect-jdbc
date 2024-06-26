// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package io.confluent.connect.jdbc.gp.gpss.api;

/**
 * Protobuf type {@code FormatBinary}
 */
public  final class FormatBinary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.FormatBinary)
    FormatBinaryOrBuilder {
  // Use FormatBinary.newBuilder() to construct.
  private FormatBinary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FormatBinary() {
    sourceColumnName_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FormatBinary(
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

            sourceColumnName_ = s;
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
    return GpssOuterClass.internal_static_api_FormatBinary_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GpssOuterClass.internal_static_api_FormatBinary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FormatBinary.class, FormatBinary.Builder.class);
  }

  public static final int SOURCE_COLUMN_NAME_FIELD_NUMBER = 1;
  private volatile Object sourceColumnName_;
  /**
   * <pre>
   * The source column name
   * </pre>
   *
   * <code>string source_column_name = 1;</code>
   */
  public String getSourceColumnName() {
    Object ref = sourceColumnName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      sourceColumnName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The source column name
   * </pre>
   *
   * <code>string source_column_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSourceColumnNameBytes() {
    Object ref = sourceColumnName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      sourceColumnName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSourceColumnNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceColumnName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourceColumnNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceColumnName_);
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
    if (!(obj instanceof FormatBinary)) {
      return super.equals(obj);
    }
    FormatBinary other =  (FormatBinary) obj;

    boolean result = true;
    result = result && getSourceColumnName()
        .equals(other.getSourceColumnName());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SOURCE_COLUMN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSourceColumnName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FormatBinary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FormatBinary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FormatBinary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FormatBinary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FormatBinary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FormatBinary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FormatBinary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FormatBinary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FormatBinary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FormatBinary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FormatBinary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FormatBinary parseFrom(
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
  public static Builder newBuilder (FormatBinary prototype) {
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
   * Protobuf type {@code FormatBinary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.FormatBinary)
      FormatBinaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GpssOuterClass.internal_static_api_FormatBinary_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GpssOuterClass.internal_static_api_FormatBinary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FormatBinary.class, FormatBinary.Builder.class);
    }

    // Construct using FormatBinary.newBuilder()
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
      sourceColumnName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GpssOuterClass.internal_static_api_FormatBinary_descriptor;
    }

    public FormatBinary getDefaultInstanceForType() {
      return FormatBinary.getDefaultInstance();
    }

    public FormatBinary build() {
      FormatBinary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public FormatBinary buildPartial() {
      FormatBinary result = new FormatBinary(this);
      result.sourceColumnName_ = sourceColumnName_;
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
      if (other instanceof FormatBinary) {
        return mergeFrom( (FormatBinary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom (FormatBinary other) {
      if (other == FormatBinary.getDefaultInstance()) return this;
      if (!other.getSourceColumnName().isEmpty()) {
        sourceColumnName_ = other.sourceColumnName_;
        onChanged();
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
      FormatBinary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =  (FormatBinary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object sourceColumnName_ = "";
    /**
     * <pre>
     * The source column name
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     */
    public String getSourceColumnName() {
      Object ref = sourceColumnName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        sourceColumnName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * The source column name
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSourceColumnNameBytes() {
      Object ref = sourceColumnName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sourceColumnName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The source column name
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     */
    public Builder setSourceColumnName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceColumnName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source column name
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     */
    public Builder clearSourceColumnName() {
      
      sourceColumnName_ = getDefaultInstance().getSourceColumnName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source column name
     * </pre>
     *
     * <code>string source_column_name = 1;</code>
     */
    public Builder setSourceColumnNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceColumnName_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.FormatBinary)
  }

  // @@protoc_insertion_point(class_scope:api.FormatBinary)
  private static final FormatBinary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FormatBinary();
  }

  public static FormatBinary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FormatBinary>
      PARSER = new com.google.protobuf.AbstractParser<FormatBinary>() {
    public FormatBinary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FormatBinary(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FormatBinary> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FormatBinary> getParserForType() {
    return PARSER;
  }

  public FormatBinary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

