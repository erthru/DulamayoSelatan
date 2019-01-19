package erthru.online.dulamayoselatan.ui.fragment.gallery

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import erthru.online.dulamayoselatan.R
import erthru.online.dulamayoselatan.ui.activity.viewphoto.ViewPhotoActivity
import kotlinx.android.synthetic.main.list_gallery.view.*

class GalleryRecyclerView(val context: Context, val arrayList: ArrayList<Int>?) : RecyclerView.Adapter<GalleryRecyclerView.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list_gallery,parent,false))
    }

    override fun getItemCount(): Int = arrayList?.size ?:0

    override fun onBindViewHolder(holder: Holder, position: Int) {

        val images = arrayList?.get(position)
        Glide.with(context).load(images).into(holder.v.imgLG)
        holder.v.imgLG.setOnClickListener {
            val i = Intent(context,ViewPhotoActivity::class.java)
            i.putExtra("img",images.toString())
            context.startActivity(i)
        }

    }


    class Holder(val v:View) : RecyclerView.ViewHolder(v)
}