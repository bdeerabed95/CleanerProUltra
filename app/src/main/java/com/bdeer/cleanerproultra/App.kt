package com.bdeer.cleanerproultra

import android.app.Application
import android.content.Context
import com.bdeer.cleanerproultra.utils.Preferences

class App : Application() {
    
    companion object {
        lateinit var instance: App
            private set
    }
    
    override fun onCreate() {
        super.onCreate()
        instance = this
        
        // تهيئة الإعدادات
        Preferences.init(this)
        
        // تفعيل وضع Galaxy Ultra OS تلقائياً
        if (Preferences.isFullOSMode(this)) {
            GalaxyUltraOS.enable(this)
        }
    }
    
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        instance = this
    }
}
