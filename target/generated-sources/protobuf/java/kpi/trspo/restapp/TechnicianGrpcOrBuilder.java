// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities/technician.proto

package kpi.trspo.restapp;

public interface TechnicianGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kpi.trspo.restapp.TechnicianGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.kpi.trspo.restapp.MyUuid id = 1;</code>
   */
  boolean hasId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid id = 1;</code>
   */
  kpi.trspo.restapp.MyUuid getId();
  /**
   * <code>.kpi.trspo.restapp.MyUuid id = 1;</code>
   */
  kpi.trspo.restapp.MyUuidOrBuilder getIdOrBuilder();

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
