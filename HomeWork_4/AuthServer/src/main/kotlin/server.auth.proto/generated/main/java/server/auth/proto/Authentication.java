// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: authentication.proto

package server.auth.proto;

public final class Authentication {
  private Authentication() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_server_auth_proto_AuthenticationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_server_auth_proto_AuthenticationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_server_auth_proto_AuthenticationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_server_auth_proto_AuthenticationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024authentication.proto\022\021server.auth.prot" +
      "o\"%\n\025AuthenticationRequest\022\014\n\004name\030\001 \001(\t" +
      "\"/\n\026AuthenticationResponse\022\025\n\ris_authori" +
      "zed\030\001 \001(\0102~\n\025AuthenticationService\022e\n\014au" +
      "thenticate\022(.server.auth.proto.Authentic" +
      "ationRequest\032).server.auth.proto.Authent" +
      "icationResponse\"\000B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_server_auth_proto_AuthenticationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_server_auth_proto_AuthenticationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_server_auth_proto_AuthenticationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_server_auth_proto_AuthenticationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_server_auth_proto_AuthenticationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_server_auth_proto_AuthenticationResponse_descriptor,
        new java.lang.String[] { "IsAuthorized", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
