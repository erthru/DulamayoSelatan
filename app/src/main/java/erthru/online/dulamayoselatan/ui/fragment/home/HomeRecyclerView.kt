package erthru.online.dulamayoselatan.ui.fragment.home

import android.content.Context
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.TranslateAnimation
import android.widget.LinearLayout
import erthru.online.dulamayoselatan.R
import kotlinx.android.synthetic.main.list_home.view.*

class HomeRecyclerView(val context: Context, val arrayList: ArrayList<String>?) : RecyclerView.Adapter<HomeRecyclerView.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list_home,parent,false))

    }

    override fun getItemCount(): Int = arrayList?.size ?: 0

    override fun onBindViewHolder(holder: Holder, position: Int) {

        var EXPAND = false

        val title = arrayList?.get(position)
        holder.v.tvTitleLH.text = title

        if(title.equals("Visi Misi")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.visiMisi,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.visiMisi)
            }
        }else if(title.equals("Luas Wilayah")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.luasWilayah,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.luasWilayah)
            }
        }else if(title.equals("Batas Wilayah")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.batasWilayah,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.batasWilayah)
            }
        }else if(title.equals("Wilayah Dusun")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.wilayahDusun,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.wilayahDusun)
            }
        }else if(title.equals("Letak Geografis")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.letakGeografis,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.letakGeografis)
            }
        }else if(title.equals("Letak Desa Dari Pusat Kota (Ibu Kota)")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.letakDariPusatKota,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.letakDariPusatKota)
            }
        }else if(title.equals("Penduduk Dulamayo Selatan")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.pendudukDulamayoSelatan,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.pendudukDulamayoSelatan)
            }
        }else if(title.equals("Jumlah Penduduk Miskin")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.jumlahPendudukMiskin,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.jumlahPendudukMiskin)
            }
        }else if(title.equals("Potensi")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.potensi,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.potensi)
            }
        }else if(title.equals("Mata Pencaharian Masyarakat")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.mataPencaharianMasyarakat,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.mataPencaharianMasyarakat)
            }
        }else if(title.equals("Sumber Pendapatan Tani")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.sumberPendapatanTani,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.sumberPendapatanTani)
            }
        }else if(title.equals("Bidang Anggaran")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.bidangAnggaran,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.bidangAnggaran)
            }
        }else if(title.equals("Pajak")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.pajak,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.pajak)
            }
        }else if(title.equals("Bangunan Sarana / Prasarana Pemerintah")){
            if(Build.VERSION.SDK_INT >= 24){
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.bangunananSaranaPrasaranaPemerintah,Html.FROM_HTML_MODE_COMPACT)
            }else{
                holder.v.tvContentLH.text = Html.fromHtml(HomeFragment.bangunananSaranaPrasaranaPemerintah)
            }
        }

        holder.v.setOnClickListener {

            if(EXPAND){
                EXPAND = false
                holder.v.imgExpandLH.setImageDrawable(context.resources.getDrawable(R.drawable.ic_expand_more_yellow_24dp))
                holder.v.layoutContentLH.visibility = View.GONE
            }else{
                EXPAND = true
                holder.v.imgExpandLH.setImageDrawable(context.resources.getDrawable(R.drawable.ic_expand_less_yellow_24dp))
                layoutExpandsAnimate(holder.v.layoutContentLH)
            }

        }

    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    private fun layoutExpandsAnimate(linearLayout: LinearLayout){

        val animate = TranslateAnimation(0f,0f,30f,0f)
        animate.duration = 500
        animate.fillAfter = true
        linearLayout.startAnimation(animate)
        linearLayout.visibility = View.VISIBLE

    }


    class Holder(val v:View) : RecyclerView.ViewHolder(v)
}