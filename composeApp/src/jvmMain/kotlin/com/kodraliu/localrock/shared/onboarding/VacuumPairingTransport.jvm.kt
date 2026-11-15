package com.kodraliu.localrock.shared.onboarding

actual class VacuumPairingTransport : AutoCloseable {
    actual suspend fun joinVacuumWifi(ssidPrefix: String, timeoutMs: Long): Unit =
        throw VacuumPairingException("Wi-Fi pairing is not supported on the JVM test target")

    actual suspend fun sendUdp(host: String, port: Int, data: ByteArray): Unit =
        throw VacuumPairingException("Wi-Fi pairing is not supported on the JVM test target")

    actual suspend fun receiveUdp(timeoutMs: Long): ByteArray? = null

    actual override fun close(): Unit = Unit
}

actual fun createVacuumPairingTransport(): VacuumPairingTransport = VacuumPairingTransport()

actual val vacuumPairingSupported: Boolean = false
