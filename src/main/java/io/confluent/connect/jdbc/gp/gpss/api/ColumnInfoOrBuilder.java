// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package io.confluent.connect.jdbc.gp.gpss.api;

public interface ColumnInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.ColumnInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Column name
   * </pre>
   *
   * <code>string Name = 1;</code>
   */
  String getName();
  /**
   * <pre>
   * Column name
   * </pre>
   *
   * <code>string Name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Greenplum data type
   * </pre>
   *
   * <code>string DatabaseType = 2;</code>
   */
  String getDatabaseType();
  /**
   * <pre>
   * Greenplum data type
   * </pre>
   *
   * <code>string DatabaseType = 2;</code>
   */
  com.google.protobuf.ByteString
      getDatabaseTypeBytes();

  /**
   * <pre>
   * Contains length information?
   * </pre>
   *
   * <code>bool HasLength = 3;</code>
   */
  boolean getHasLength();

  /**
   * <pre>
   * Length if HasLength is true
   * </pre>
   *
   * <code>int64 Length = 4;</code>
   */
  long getLength();

  /**
   * <pre>
   * Contains precision or scale information?
   * </pre>
   *
   * <code>bool HasPrecisionScale = 5;</code>
   */
  boolean getHasPrecisionScale();

  /**
   * <code>int64 Precision = 6;</code>
   */
  long getPrecision();

  /**
   * <code>int64 Scale = 7;</code>
   */
  long getScale();

  /**
   * <pre>
   * Contains Nullable constraint?
   * </pre>
   *
   * <code>bool HasNullable = 8;</code>
   */
  boolean getHasNullable();

  /**
   * <code>bool Nullable = 9;</code>
   */
  boolean getNullable();
}
