package erthru.online.dulamayoselatan.ui.activity.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import erthru.online.dulamayoselatan.R
import erthru.online.dulamayoselatan.base.BaseActivity
import erthru.online.dulamayoselatan.ui.fragment.gallery.GalleryFragment
import erthru.online.dulamayoselatan.ui.fragment.home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    companion object {

        const val DULAMAYO_LAT = "0.6028966"
        const val DULAMAYO_LNG = "122.8507557"

    }

    val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val home = AHBottomNavigationItem("Beranda", R.drawable.ic_home_black_24dp)
        val info = AHBottomNavigationItem("Galeri", R.drawable.ic_collections_black_24dp)
        val map = AHBottomNavigationItem("Lokasi", R.drawable.ic_place_black_24dp)
        val exit = AHBottomNavigationItem("Keluar", R.drawable.ic_exit_to_app_black_24dp)

        botnavMain.addItem(home)
        botnavMain.addItem(info)
        botnavMain.addItem(map)
        botnavMain.addItem(exit)

        botnavMain.titleState = AHBottomNavigation.TitleState.ALWAYS_SHOW
        botnavMain.accentColor = resources.getColor(R.color.colorAccent)

        botnavMain.setOnTabSelectedListener(object : AHBottomNavigation.OnTabSelectedListener{

            override fun onTabSelected(position: Int, wasSelected: Boolean): Boolean {

                when(position){

                    0 -> fm.beginTransaction().replace(R.id.flMain, HomeFragment()).commit()
                    1 -> fm.beginTransaction().replace(R.id.flMain, GalleryFragment()).commit()
                    2 -> {
                        val intent = Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://maps.google.com/maps?saddr=&daddr=${DULAMAYO_LAT},${DULAMAYO_LNG}"))
                        startActivity(intent)
                    }
                    3 -> finishAffinity()

                }

                return true
            }

        })

    }

    override fun onResume() {
        super.onResume()
        fm.beginTransaction().replace(R.id.flMain, HomeFragment())
        botnavMain.currentItem = 0
    }
}
