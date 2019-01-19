package erthru.online.dulamayoselatan.ui.fragment.home


import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import erthru.online.dulamayoselatan.R
import erthru.online.dulamayoselatan.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : BaseFragment() {

    companion object {

        const val visiMisi = "<b>VISI : </b><br>" +
                "<p>Terwujudnya Desa Dulamayo Selatan yang Maju, Mandiri, dan Sejahtera melalui Pengembangan Usaha Mikro dan Menengah yang dilandasi dengan Kearifan Lokal</p><br>" +
                "<b>MISI : </b><br>" +
                "<p>1. Bekerja sama dengan instansi yang terkait guna meningkatkan usaha mikro dan menengah, perbaikan dan pembangunan infrastruktur pendukung usaha masyarakat.<br>" +
                "2. Meningkatkan Usaha Mikro dan menengah melalui pembinaan kelompok-kelompok usaha diberbagai bidang.<br>" +
                "3. Meningkatkan dan Memperbaiki pengelolaan Pendapatan Asli Desa.<br>" +
                "4. Mewujudkan Pemerintahan yang baik dan bersih melalui pelaksanaan otonomi daerah.</p>"

        const val luasWilayah = "<p>Luas Desa Dulamayo Selatan + <b>4.225 Ha. - Atau 4.Km Persegi</b>"

        const val batasWilayah = "<p>DESA DULAMAYO SELATAN BERBATASAN :<br><br>" +
                "<b>Utara</b> Berbatasan dengan : Desa <b>DULAMAYO UTARA Kec.Telaga Biru</b><br><br>" +
                "<b>Timur</b> Berbatasan dengan : Desa <b>TONALA Kec.Telaga Biru</b><br><br>" +
                "<b>Selatan</b> Berbatasan dengan : Desa <b>MODELIDU Kec.Telaga Biru</b><br><br>" +
                "<b>Barat</b> Berbatasan dengan : Desa <b>DULAMAYO BARAT Kec.Telaga</b><br><br>" +
                "</p>"

        const val wilayahDusun = "<p>DESA DULAMAYO SELATAN TERDIRI ATAS TIGA DUSUN : <br><br>" +
                "1.Dusun I. Bayade<br>" +
                "2.Dusun II. Buniaa<br>" +
                "3.Dusun III. Moliliulo</p>"

        const val letakGeografis = "<p>Desa Dulamayo Selatan terletak pada ketinggian 900 meter dari Permukaan Laut (dpl)</p>"

        const val letakDariPusatKota = "<p> - Kecamatan Telaga : 30 Km.<br>" +
                "- Kabupaten Gorontalo : 20 Km.<br>" +
                "- Provinsi Gorontalo : 38 Km.</p>"

        const val pendudukDulamayoSelatan = "<p>KEPALA BERJUMLAH : 667 Kepala Keluarga<br><br>" +
                "<b>Jumlah Jiwa</b> : <br>" +
                " - Laki-laki : 1.224. Jiwa<br>" +
                " - Perempuan : 1.043. Jiwa<br>" +
                " <b>Jumlah : 2.267. Jiwa</b></p>"

        const val jumlahPendudukMiskin = "<p>- Penerima RASTRA : 295. Jiwa<br>" +
                "- Penerima PKH. : 291. Jiwa<br>" +
                "- Penerima BPNT : 297 Jikwa<br>" +
                "- Penerima BPJS KIS : 1.115 Jiwa<br>" +
                "- Penerima KIP : 205. Jiwa</p>"

        const val potensi = "<p>" +
                "<b>POTENSI HUTAN : </b><br>" +
                " - Potensi Hutan adalah Usaha Getah Pinus<br>" +
                " - Potensi Wisata Hutan.<br>" +
                " - Potensi Non Kayu Lainnya.<br><br>" +
                "<b>POTENSI TANAMAN PERKEBUNAN : </b><br>" +
                " - Tanaman Cangkih<br>" +
                " - Kemiri<br>" +
                " - Vanili<br>" +
                " - Cacao<br>" +
                " - Aren.<br><br>" +
                "<b>POTENSI TANAMAN HORTIKULTURA : </b><br>" +
                " - Sayur Buncis<br>" +
                " - Sayur Kol<br>" +
                " - Dan Sayuran lainnya.<br><br>" +
                "<b>POTENSI TANAMAN HORTIKULTURA BUAH : </b><br>" +
                " - Langsat<br>" +
                " - Durian<br>" +
                " - Duku<br>" +
                " - Apel<br>" +
                " - Stowbery.<br><br>" +
                "</p>"

        const val mataPencaharianMasyarakat = "<p>" +
                "- Petani : 98%<br>" +
                "- Pegawai Swasta : 21 Orang<br>" +
                "- PNS : 7 Orang<br>" +
                "- Dagang : 24 Orang" +
                "</p>"

        const val sumberPendapatanTani = "<p>" +
                "- Penyadapan Getah Pinus<br>" +
                "- Pertanian dan Pekebunan<br>" +
                "- Dagang<br>" +
                "- Wira usaha<br>" +
                "- Buah Tani<br>" +
                "- Karyawan<br>" +
                "- Tukang Batu<br>" +
                "- Tukang Kayu" +
                "</p>"

        const val bidangAnggaran = "<p>" +
                "<b>ANGGARAN ADD & DANA DESA DULAMAYO SELATAN TAHUN 2018</b><br><br>" +
                " - ADD Sejumlah Rp 349.000.000<br>" +
                " - Dana Desa Rp 1.211.000.000<br>" +
                " <b>Jumlah Pendapatan Rp 1.560.000.000.-</b><br><br>" +
                "<b>Anggaran tersebut sesuai Perdes Tahun 2018 diguanakan Pada : </b><br><br>" +
                " - Bidang Penyelenggaraan Pemerintah Desa<br>" +
                " - Bidang Pembangunan<br>" +
                " - Bidang Pembinaan<br>" +
                " - Bidang Pemberdayaan<br>" +
                " - Dan Pembiayaan." +
                "</p>"

        const val pajak = "<p>" +
                "<b>PAJAK BUMI DAN BANGUNAN (PBB) TAHUN 2018</b><br>" +
                " - PBB Dulamayo Selatan Tahun 2018 berjumlah Rp. 30.887.664" +
                "</p>"

        const val bangunananSaranaPrasaranaPemerintah = "<p>" +
                "- Desa Dulamayo Selatan memiliki Pasar<br>" +
                "- Mesjid 7. Buah<br>" +
                "- Gedung BPD<br>" +
                "- Gedung PUSTU<br>" +
                "- Sekolah Dasar<br>" +
                "- SMP SATAP<br>" +
                "- PAUD<br>" +
                "- Gedung Ex. Pasar Dulamayo Selatan." +
                "</p>"

    }

    private val title = ArrayList<String>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_home, container, false)

        setToolbar(v.tbHome)

        title.add("Visi Misi")
        title.add("Luas Wilayah")
        title.add("Batas Wilayah")
        title.add("Wilayah Dusun")
        title.add("Letak Geografis")
        title.add("Letak Desa Dari Pusat Kota (Ibu Kota)")
        title.add("Penduduk Dulamayo Selatan")
        title.add("Jumlah Penduduk Miskin")
        title.add("Potensi")
        title.add("Mata Pencaharian Masyarakat")
        title.add("Sumber Pendapatan Tani")
        title.add("Bidang Anggaran")
        title.add("Pajak")
        title.add("Bangunan Sarana / Prasarana Pemerintah")

        v.rvHome.layoutManager = LinearLayoutManager(context)
        v.rvHome.adapter = HomeRecyclerView(context!!,title)
        v.rvHome.addItemDecoration(DividerItemDecoration(activity,DividerItemDecoration.VERTICAL))

        return v
    }


}
