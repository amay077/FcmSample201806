package net.yourdomain.fcmsample

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId

import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIDService : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        // トークンが更新されたときに呼び出される
        val refreshedToken = FirebaseInstanceId.getInstance().token ?: ""
        Log.d("FCM-TEST", "Refreshed token: $refreshedToken")
    }
}