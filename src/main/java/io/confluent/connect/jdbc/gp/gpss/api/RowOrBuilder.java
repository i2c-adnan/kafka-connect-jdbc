// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package io.confluent.connect.jdbc.gp.gpss.api;

public interface RowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.Row)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  java.util.List<DBValue> 
      getColumnsList();
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  DBValue getColumns(int index);
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  int getColumnsCount();
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  java.util.List<? extends DBValueOrBuilder> 
      getColumnsOrBuilderList();
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  DBValueOrBuilder getColumnsOrBuilder(
      int index);
}
