// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/assembleBack.proto

package kpi.trspo.restapp;

public final class AssembleBack {
  private AssembleBack() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_AssembleBackRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_AssembleBackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kpi_trspo_restapp_AssembleBackResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kpi_trspo_restapp_AssembleBackResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033services/assembleBack.proto\022\021kpi.trspo" +
      ".restapp\032\033google/protobuf/empty.proto\032\025e" +
      "ntities/myUuid.proto\032\031entities/dimension" +
      "s.proto\032\032entities/cameraParts.proto\"\240\001\n\023" +
      "AssembleBackRequest\022.\n\013collectorId\030\001 \001(\013" +
      "2\031.kpi.trspo.restapp.MyUuid\0221\n\ndimension" +
      "s\030\002 \001(\0132\035.kpi.trspo.restapp.Dimensions\022\022" +
      "\n\nresolution\030\003 \001(\005\022\022\n\ncolorDepth\030\004 \001(\005\"M" +
      "\n\024AssembleBackResponse\0225\n\ncameraBack\030\001 \001" +
      "(\0132!.kpi.trspo.restapp.CameraBackGrpc2v\n",
      "\023AssembleBackService\022_\n\014assembleBack\022&.k" +
      "pi.trspo.restapp.AssembleBackRequest\032\'.k" +
      "pi.trspo.restapp.AssembleBackResponseB\002P" +
      "\001b\006proto3"
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
          kpi.trspo.restapp.DimensionsOuterClass.getDescriptor(),
          kpi.trspo.restapp.CameraParts.getDescriptor(),
        }, assigner);
    internal_static_kpi_trspo_restapp_AssembleBackRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kpi_trspo_restapp_AssembleBackRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_AssembleBackRequest_descriptor,
        new java.lang.String[] { "CollectorId", "Dimensions", "Resolution", "ColorDepth", });
    internal_static_kpi_trspo_restapp_AssembleBackResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kpi_trspo_restapp_AssembleBackResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kpi_trspo_restapp_AssembleBackResponse_descriptor,
        new java.lang.String[] { "CameraBack", });
    com.google.protobuf.EmptyProto.getDescriptor();
    kpi.trspo.restapp.MyUuidOuterClass.getDescriptor();
    kpi.trspo.restapp.DimensionsOuterClass.getDescriptor();
    kpi.trspo.restapp.CameraParts.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
