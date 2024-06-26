// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package io.confluent.connect.jdbc.gp.gpss.api;

public interface OpenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.OpenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Session ID returned by Connect
   * </pre>
   *
   * <code>.api.Session Session = 1;</code>
   */
  boolean hasSession();
  /**
   * <pre>
   * Session ID returned by Connect
   * </pre>
   *
   * <code>.api.Session Session = 1;</code>
   */
  Session getSession();
  /**
   * <pre>
   * Session ID returned by Connect
   * </pre>
   *
   * <code>.api.Session Session = 1;</code>
   */
  SessionOrBuilder getSessionOrBuilder();

  /**
   * <pre>
   * Name of the Greenplum Database schema
   * </pre>
   *
   * <code>string SchemaName = 2;</code>
   */
  String getSchemaName();
  /**
   * <pre>
   * Name of the Greenplum Database schema
   * </pre>
   *
   * <code>string SchemaName = 2;</code>
   */
  com.google.protobuf.ByteString
      getSchemaNameBytes();

  /**
   * <pre>
   * Name of the Greenplum Database table
   * </pre>
   *
   * <code>string TableName = 3;</code>
   */
  String getTableName();
  /**
   * <pre>
   * Name of the Greenplum Database table
   * </pre>
   *
   * <code>string TableName = 3;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <pre>
   * SQL to execute before gpss loads the data
   * </pre>
   *
   * <code>string PreSQL = 4;</code>
   */
  String getPreSQL();
  /**
   * <pre>
   * SQL to execute before gpss loads the data
   * </pre>
   *
   * <code>string PreSQL = 4;</code>
   */
  com.google.protobuf.ByteString
      getPreSQLBytes();

  /**
   * <pre>
   * SQL to execute after gpss loads the data
   * </pre>
   *
   * <code>string PostSQL = 5;</code>
   */
  String getPostSQL();
  /**
   * <pre>
   * SQL to execute after gpss loads the data
   * </pre>
   *
   * <code>string PostSQL = 5;</code>
   */
  com.google.protobuf.ByteString
      getPostSQLBytes();

  /**
   * <pre>
   * Time to wait before aborting the operation (seconds); not supported
   * </pre>
   *
   * <code>int32 Timeout = 6;</code>
   */
  int getTimeout();

  /**
   * <pre>
   * Encoding of text data; not supported
   * </pre>
   *
   * <code>string Encoding = 7;</code>
   */
  String getEncoding();
  /**
   * <pre>
   * Encoding of text data; not supported
   * </pre>
   *
   * <code>string Encoding = 7;</code>
   */
  com.google.protobuf.ByteString
      getEncodingBytes();

  /**
   * <pre>
   * Schema in which gpss creates external and temp tables; default is to create these tables in the same schema as the target table
   * </pre>
   *
   * <code>string StagingSchema = 8;</code>
   */
  String getStagingSchema();
  /**
   * <pre>
   * Schema in which gpss creates external and temp tables; default is to create these tables in the same schema as the target table
   * </pre>
   *
   * <code>string StagingSchema = 8;</code>
   */
  com.google.protobuf.ByteString
      getStagingSchemaBytes();

  /**
   * <code>.api.FormatAvro avro = 9;</code>
   */
  boolean hasAvro();
  /**
   * <code>.api.FormatAvro avro = 9;</code>
   */
  FormatAvro getAvro();
  /**
   * <code>.api.FormatAvro avro = 9;</code>
   */
  FormatAvroOrBuilder getAvroOrBuilder();

  /**
   * <code>.api.FormatBinary binary = 10;</code>
   */
  boolean hasBinary();
  /**
   * <code>.api.FormatBinary binary = 10;</code>
   */
  FormatBinary getBinary();
  /**
   * <code>.api.FormatBinary binary = 10;</code>
   */
  FormatBinaryOrBuilder getBinaryOrBuilder();

  /**
   * <code>.api.FormatCSV csv = 11;</code>
   */
  boolean hasCsv();
  /**
   * <code>.api.FormatCSV csv = 11;</code>
   */
  FormatCSV getCsv();
  /**
   * <code>.api.FormatCSV csv = 11;</code>
   */
  FormatCSVOrBuilder getCsvOrBuilder();

  /**
   * <code>.api.FormatDelimited delimited = 12;</code>
   */
  boolean hasDelimited();
  /**
   * <code>.api.FormatDelimited delimited = 12;</code>
   */
  FormatDelimited getDelimited();
  /**
   * <code>.api.FormatDelimited delimited = 12;</code>
   */
  FormatDelimitedOrBuilder getDelimitedOrBuilder();

  /**
   * <code>.api.FormatJSON json = 13;</code>
   */
  boolean hasJson();
  /**
   * <code>.api.FormatJSON json = 13;</code>
   */
  FormatJSON getJson();
  /**
   * <code>.api.FormatJSON json = 13;</code>
   */
  FormatJSONOrBuilder getJsonOrBuilder();

  /**
   * <code>.api.FormatCustom custom = 14;</code>
   */
  boolean hasCustom();
  /**
   * <code>.api.FormatCustom custom = 14;</code>
   */
  FormatCustom getCustom();
  /**
   * <code>.api.FormatCustom custom = 14;</code>
   */
  FormatCustomOrBuilder getCustomOrBuilder();

  /**
   * <code>string proto = 15;</code>
   */
  String getProto();
  /**
   * <code>string proto = 15;</code>
   */
  com.google.protobuf.ByteString
      getProtoBytes();

  /**
   * <code>.api.InsertOption InsertOption = 100;</code>
   */
  InsertOption getInsertOption();
  /**
   * <code>.api.InsertOption InsertOption = 100;</code>
   */
  InsertOptionOrBuilder getInsertOptionOrBuilder();

  /**
   * <code>.api.UpdateOption UpdateOption = 101;</code>
   */
  UpdateOption getUpdateOption();
  /**
   * <code>.api.UpdateOption UpdateOption = 101;</code>
   */
  UpdateOptionOrBuilder getUpdateOptionOrBuilder();

  /**
   * <code>.api.MergeOption MergeOption = 102;</code>
   */
  MergeOption getMergeOption();
  /**
   * <code>.api.MergeOption MergeOption = 102;</code>
   */
  MergeOptionOrBuilder getMergeOptionOrBuilder();

  public OpenRequest.OptionCase getOptionCase();
}
