package net.yourdomain.fcmsample

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        // FCMメッセージを受信したときに呼び出される

        // 通知メッセージの受信
        if (remoteMessage?.notification != null) {
            val notification = remoteMessage.notification
            val title = notification?.title ?: ""
            val body = notification?.body ?: ""

            android.util.Log.d("FCM-TEST", "メッセージタイプ: 通知\nタイトル: $title\n本文: $body")
        }
    }
}
