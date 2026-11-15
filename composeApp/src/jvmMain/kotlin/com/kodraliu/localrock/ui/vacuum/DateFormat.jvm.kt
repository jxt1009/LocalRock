package com.kodraliu.localrock.ui.vacuum

import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

actual fun formatCleanRecordTime(epochSeconds: Long): String =
    DateTimeFormatter.ofPattern("d MMM yyyy, HH:mm").format(
        Instant.ofEpochSecond(epochSeconds).atZone(ZoneId.systemDefault()),
    )
