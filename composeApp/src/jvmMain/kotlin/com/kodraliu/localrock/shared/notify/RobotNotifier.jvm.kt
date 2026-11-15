package com.kodraliu.localrock.shared.notify

import com.kodraliu.localrock.shared.notify.RobotNotifier

private object NoopRobotNotifier : RobotNotifier {
    override fun post(notification: RobotNotification) = Unit

    override fun showProgress(progress: RobotProgress) = Unit

    override fun clearProgress(duid: String) = Unit
}

actual fun platformRobotNotifier(): RobotNotifier = NoopRobotNotifier

actual val backgroundAlertsSupported: Boolean = false
