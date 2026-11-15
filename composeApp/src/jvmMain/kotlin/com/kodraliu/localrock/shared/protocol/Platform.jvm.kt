package com.kodraliu.localrock.shared.protocol

import java.io.File
import java.security.SecureRandom

internal actual fun secureRandomBytes(size: Int): ByteArray {
    val buf = ByteArray(size)
    SecureRandom().nextBytes(buf)
    return buf
}

actual fun saveDebugBlob(name: String, bytes: ByteArray): String? {
    val file = File(System.getProperty("java.io.tmpdir"), name)
    file.writeBytes(bytes)
    return file.absolutePath
}
