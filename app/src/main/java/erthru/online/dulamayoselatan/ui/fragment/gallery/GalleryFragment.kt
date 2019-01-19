package erthru.online.dulamayoselatan.ui.fragment.gallery


import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import erthru.online.dulamayoselatan.R
import erthru.online.dulamayoselatan.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_gallery.*
import kotlinx.android.synthetic.main.fragment_gallery.view.*


class GalleryFragment : BaseFragment() {

    val listPicture = ArrayList<Int>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_gallery, container, false)

        setToolbar(v.tbGallery)

        listPicture.add(R.drawable.dulamayo_a)
        listPicture.add(R.drawable.dulamayo_b)
        listPicture.add(R.drawable.dulamayo_c)
        listPicture.add(R.drawable.dulamayo_d)
        listPicture.add(R.drawable.dulamayo_e)
        listPicture.add(R.drawable.dulamayo_f)
        listPicture.add(R.drawable.dulamayo_g)
        listPicture.add(R.drawable.dulamayo_h)

        v.rvGallery.layoutManager = GridLayoutManager(context,2)
        v.rvGallery.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        v.rvGallery.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL))

        val adapter = GalleryRecyclerView(context!!,listPicture)
        adapter.notifyDataSetChanged()
        v.rvGallery.adapter = adapter


        return v
    }


}
