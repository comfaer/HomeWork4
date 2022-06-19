import io.grpc.Server
import io.grpc.ServerBuilder

class AuthServer(port: Int) {

    private val server: Server

    init {
        val authenticationService = AuthenticationService(
            validUsers = listOf(
                "Ivan",
                "Maxim",
                "Oleg",
            ),
        )
        server = ServerBuilder.forPort(port).addService(authenticationService).build()
    }

    fun start() {
        server.start()
        Runtime.getRuntime().addShutdownHook(Thread {
            println("Shutting down gRPC server since JVM is shutting down.")
            server.shutdown()
            println("Server shut down.")
        })
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }
}