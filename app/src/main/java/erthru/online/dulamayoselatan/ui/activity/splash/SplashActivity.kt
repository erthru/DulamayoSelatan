package erthru.online.dulamayoselatan.ui.activity.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import erthru.online.dulamayoselatan.R
import erthru.online.dulamayoselatan.ui.activity.main.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        Handler().postDelayed(Runnable {

            this.finish()
            startActivity(Intent(this, MainActivity::class.java))

        },3000)

    }
}
