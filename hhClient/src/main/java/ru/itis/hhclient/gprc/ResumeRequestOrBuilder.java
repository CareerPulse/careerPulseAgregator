// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resume.proto

package ru.itis.hhclient.gprc;

public interface ResumeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ResumeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  String getTitle();
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string sorting = 2;</code>
   * @return Whether the sorting field is set.
   */
  boolean hasSorting();
  /**
   * <code>optional string sorting = 2;</code>
   * @return The sorting.
   */
  String getSorting();
  /**
   * <code>optional string sorting = 2;</code>
   * @return The bytes for sorting.
   */
  com.google.protobuf.ByteString
      getSortingBytes();
}
