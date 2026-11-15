package com.kodraliu.localrock.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.time.LocalTime
import java.time.format.DateTimeFormatter

@Composable
actual fun rememberUse24HourClock(): Boolean = remember {
    val time = LocalTime.now().format(DateTimeFormatter.ofPattern("H"))
    // The JVM has no public API for the user's clock format; 24h is the safer default for a test stub.
    time.isNotEmpty()
}
