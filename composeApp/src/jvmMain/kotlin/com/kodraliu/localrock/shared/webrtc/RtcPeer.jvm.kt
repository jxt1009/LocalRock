package com.kodraliu.localrock.shared.webrtc

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.MutableStateFlow

private class UnavailableRtcPeer(
    override val localCandidates: SharedFlow<RtcIceCandidate> = kotlinx.coroutines.flow.MutableSharedFlow(),
    override val connectionState: StateFlow<RtcConnectionState> = MutableStateFlow(RtcConnectionState.FAILED),
) : RtcPeer {
    override suspend fun createOffer(): String = error("Live view is not supported on the JVM test target")
    override suspend fun setRemoteAnswer(sdp: String) = error("Live view is not supported on the JVM test target")
    override fun addRemoteCandidate(candidate: RtcIceCandidate) = Unit
    override fun close() = Unit
}

actual val liveViewSupported: Boolean = false

actual fun createRtcPeer(iceServers: List<RtcIceServer>): RtcPeer = UnavailableRtcPeer()
