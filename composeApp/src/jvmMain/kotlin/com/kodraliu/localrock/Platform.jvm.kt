package com.kodraliu.localrock

actual fun getPlatform(): Platform = object : Platform {
    override val name: String = "JvmTest"
}
