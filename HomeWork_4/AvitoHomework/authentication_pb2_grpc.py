# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import authentication_pb2 as authentication__pb2


class AuthenticationServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.authenticate = channel.unary_unary(
                '/server.auth.proto.AuthenticationService/authenticate',
                request_serializer=authentication__pb2.AuthenticationRequest.SerializeToString,
                response_deserializer=authentication__pb2.AuthenticationResponse.FromString,
                )


class AuthenticationServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def authenticate(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_AuthenticationServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'authenticate': grpc.unary_unary_rpc_method_handler(
                    servicer.authenticate,
                    request_deserializer=authentication__pb2.AuthenticationRequest.FromString,
                    response_serializer=authentication__pb2.AuthenticationResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'server.auth.proto.AuthenticationService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AuthenticationService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def authenticate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/server.auth.proto.AuthenticationService/authenticate',
            authentication__pb2.AuthenticationRequest.SerializeToString,
            authentication__pb2.AuthenticationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)