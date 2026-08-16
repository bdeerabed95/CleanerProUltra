package com.bdeer.cleanerproultra

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GalaxyUltraHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galaxy_ultra_home)
        
        findViewById<Button>(R.id.btnDeviceCare).setOnClickListener {
            // الانتقال إلى Device Care
        }
    }
}
