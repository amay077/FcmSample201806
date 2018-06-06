package net.yourdomain.fcmsample

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this, FirebaseOptions.Builder()
                .setApplicationId(BuildConfig.APP_ID)
                .setApiKey(BuildConfig.API_KEY)
                .build())

    }
}
