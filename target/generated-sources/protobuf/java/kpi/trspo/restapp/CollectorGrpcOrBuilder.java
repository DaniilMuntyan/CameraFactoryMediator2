// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities/collector.proto

package kpi.trspo.restapp;

public interface CollectorGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kpi.trspo.restapp.CollectorGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kpi.trspo.restapp.MyUuid collectorId = 1;</code>
   */
  boolean hasCollectorId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid collectorId = 1;</code>
   */
  kpi.trspo.restapp.MyUuid getCollectorId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid collectorId = 1;</code>
   */
  kpi.trspo.restapp.MyUuidOrBuilder getCollectorIdOrBuilder();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string surname = 3;</code>
   */
  java.lang.String getSurname();
  /**
   * <code>string surname = 3;</code>
   */
  com.google.protobuf.ByteString
      getSurnameBytes();

  /**
   * <code>string phone = 4;</code>
   */
  java.lang.String getPhone();
  /**
   * <code>string phone = 4;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();
}
