// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/assembleLens.proto

package kpi.trspo.restapp;

public interface AssembleLensRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kpi.trspo.restapp.AssembleLensRequest)
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
   * <code>int32 focalLength = 2;</code>
   */
  int getFocalLength();

  /**
   * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
   */
  int getLensTypeValue();
  /**
   * <code>.kpi.trspo.restapp.LensType lensType = 3;</code>
   */
  kpi.trspo.restapp.LensType getLensType();
}