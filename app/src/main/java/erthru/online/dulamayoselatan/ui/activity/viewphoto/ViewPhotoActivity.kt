package erthru.online.dulamayoselatan.ui.activity.viewphoto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import erthru.online.dulamayoselatan.R
import kotlinx.android.synthetic.main.activity_view_photo.*

class ViewPhotoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_photo)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val i = intent

        photoVP.setImageDrawable(resources.getDrawable(i.getStringExtra("img").toInt()))

    }
}
