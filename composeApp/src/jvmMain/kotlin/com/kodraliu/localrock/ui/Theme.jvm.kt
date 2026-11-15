package com.kodraliu.localrock.ui

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
actual fun platformDynamicColorScheme(useDark: Boolean): ColorScheme? =
    if (useDark) MaterialTheme.colorScheme else lightColorScheme()

@Composable
actual fun SystemBarsAppearance(darkTheme: Boolean) = Unit
