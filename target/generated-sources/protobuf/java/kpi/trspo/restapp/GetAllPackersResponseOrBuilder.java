// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities/packer.proto

package kpi.trspo.restapp;

public interface GetAllPackersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kpi.trspo.restapp.GetAllPackersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .kpi.trspo.restapp.PackerGrpc packers = 1;</code>
   */
  java.util.List<kpi.trspo.restapp.PackerGrpc> 
      getPackersList();
  /**
   * <code>repeated .kpi.trspo.restapp.PackerGrpc packers = 1;</code>
   */
  kpi.trspo.restapp.PackerGrpc getPackers(int index);
  /**
   * <code>repeated .kpi.trspo.restapp.PackerGrpc packers = 1;</code>
   */
  int getPackersCount();
  /**
   * <code>repeated .kpi.trspo.restapp.PackerGrpc packers = 1;</code>
   */
  java.util.List<? extends kpi.trspo.restapp.PackerGrpcOrBuilder> 
      getPackersOrBuilderList();
  /**
   * <code>repeated .kpi.trspo.restapp.PackerGrpc packers = 1;</code>
   */
  kpi.trspo.restapp.PackerGrpcOrBuilder getPackersOrBuilder(
      int index);
}
