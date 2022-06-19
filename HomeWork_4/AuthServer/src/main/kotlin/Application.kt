private const val VAR_PORT = "auth_port"

fun main() {
    val port = System.getenv(VAR_PORT)?.toInt() ?: 50051
    AuthServer(port).apply {
        println("Server started.")
        start()
        blockUntilShutdown()
    }
}
