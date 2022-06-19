import server.auth.proto.AuthenticationRequest
import server.auth.proto.AuthenticationResponse
import server.auth.proto.AuthenticationServiceGrpcKt

class AuthenticationService(
    private val validUsers: List<String>,
): AuthenticationServiceGrpcKt.AuthenticationServiceCoroutineImplBase() {

    override suspend fun authenticate(
        request: AuthenticationRequest,
    ): AuthenticationResponse {
        val isUserAuthorized = request.name in validUsers
        println("Request. Username: ${request.name}, authorized: $isUserAuthorized.")
        return AuthenticationResponse.newBuilder().setIsAuthorized(isUserAuthorized).build()
    }
}