// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package io.confluent.connect.jdbc.gp.gpss.api;

/**
 * <pre>
 * Operation mode
 * </pre>
 *
 * Protobuf enum {@code Operation}
 */
public enum Operation
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Insert all data into table; behavior of duplicate key or data depends upon the constraints of the target table.
   * </pre>
   *
   * <code>Insert = 0;</code>
   */
  Insert(0),
  /**
   * <pre>
   * Insert and Update
   * </pre>
   *
   * <code>Merge = 1;</code>
   */
  Merge(1),
  /**
   * <pre>
   * Update the value of "UpdateColumns" if "MatchColumns" match
   * </pre>
   *
   * <code>Update = 2;</code>
   */
  Update(2),
  /**
   * <pre>
   * Not supported
   * </pre>
   *
   * <code>Read = 3;</code>
   */
  Read(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Insert all data into table; behavior of duplicate key or data depends upon the constraints of the target table.
   * </pre>
   *
   * <code>Insert = 0;</code>
   */
  public static final int Insert_VALUE = 0;
  /**
   * <pre>
   * Insert and Update
   * </pre>
   *
   * <code>Merge = 1;</code>
   */
  public static final int Merge_VALUE = 1;
  /**
   * <pre>
   * Update the value of "UpdateColumns" if "MatchColumns" match
   * </pre>
   *
   * <code>Update = 2;</code>
   */
  public static final int Update_VALUE = 2;
  /**
   * <pre>
   * Not supported
   * </pre>
   *
   * <code>Read = 3;</code>
   */
  public static final int Read_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static Operation valueOf(int value) {
    return forNumber(value);
  }

  public static Operation forNumber(int value) {
    switch (value) {
      case 0: return Insert;
      case 1: return Merge;
      case 2: return Update;
      case 3: return Read;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Operation>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Operation> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
          public Operation findValueByNumber(int number) {
            return Operation.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return GpssOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Operation[] VALUES = values();

  public static Operation valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Operation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.Operation)
}

