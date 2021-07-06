// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities/calibrator.proto

package kpi.trspo.restapp;

public final class Calibrator {
  private Calibrator() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_CalibratorGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_CalibratorGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_GetCalibratorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_GetCalibratorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_GetCalibratorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_GetCalibratorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_CreateCalibratorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_CreateCalibratorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_CreateCalibratorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_CreateCalibratorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031entities/calibrator.proto\022\021kpi.trspo.r" +
      "estapp\032\033google/protobuf/empty.proto\032\025ent" +
      "ities/myUuid.proto\"O\n\016CalibratorGrpc\022/\n\014" +
      "calibratorId\030\001 \001(\0132\031.kpi.trspo.restapp.M" +
      "yUuid\022\014\n\004name\030\002 \001(\t\">\n\025GetCalibratorsReq" +
      "uest\022%\n\005value\030\001 \001(\0132\026.google.protobuf.Em" +
      "pty\"P\n\026GetCalibratorsResponse\0226\n\013calibra" +
      "tors\030\001 \003(\0132!.kpi.trspo.restapp.Calibrato" +
      "rGrpc\"\'\n\027CreateCalibratorRequest\022\014\n\004name" +
      "\030\001 \001(\t\"Q\n\030CreateCalibratorResponse\0225\n\nca",
      "librator\030\001 \001(\0132!.kpi.trspo.restapp.Calib" +
      "ratorGrpc2\207\001\n\030CreateCalibratorsService\022k" +
      "\n\020createCalibrator\022*.kpi.trspo.restapp.C" +
      "reateCalibratorRequest\032+.kpi.trspo.resta" +
      "pp.CreateCalibratorResponse2\201\001\n\025GetCalib" +
      "ratorsService\022h\n\021getAllCalibrators\022(.kpi" +
      ".trspo.restapp.GetCalibratorsRequest\032).k" +
      "pi.trspo.restapp.GetCalibratorsResponseB" +
      "\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          kpi.trspo.restapp.MyUuidOuterClass.getDescriptor(),
        }, assigner);
    internal_static_kpi_trspo_restapp_CalibratorGrpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kpi_trspo_restapp_CalibratorGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_CalibratorGrpc_descriptor,
        new java.lang.String[] { "CalibratorId", "Name", });
    internal_static_kpi_trspo_restapp_GetCalibratorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kpi_trspo_restapp_GetCalibratorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_GetCalibratorsRequest_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_kpi_trspo_restapp_GetCalibratorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_kpi_trspo_restapp_GetCalibratorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_GetCalibratorsResponse_descriptor,
        new java.lang.String[] { "Calibrators", });
    internal_static_kpi_trspo_restapp_CreateCalibratorRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_kpi_trspo_restapp_CreateCalibratorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_CreateCalibratorRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_kpi_trspo_restapp_CreateCalibratorResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_kpi_trspo_restapp_CreateCalibratorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_CreateCalibratorResponse_descriptor,
        new java.lang.String[] { "Calibrator", });
    com.google.protobuf.EmptyProto.getDescriptor();
    kpi.trspo.restapp.MyUuidOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
