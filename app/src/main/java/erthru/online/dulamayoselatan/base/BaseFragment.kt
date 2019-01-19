package erthru.online.dulamayoselatan.base

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.WindowManager
import android.widget.Toolbar
import kotlinx.android.synthetic.main.fragment_gallery.view.*

open class BaseFragment : Fragment(){

    lateinit var v: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    fun setToolbar(toolbar:android.support.v7.widget.Toolbar){

        (activity as AppCompatActivity)?.setSupportActionBar(toolbar)
        (activity as AppCompatActivity)?.supportActionBar?.elevation = 1f

    }

}