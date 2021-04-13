package com.example.recycleview;

import java.util.ArrayList;

public class Data {
    private static String[] title = new String[]{"Acer","Apple","Asus","Dell","HP","Lenovo","Microsoft","MSI","Samsung","Toshiba"};

    private static int[] thumbnail = new
            int[]{R.drawable.acer1,R.drawable.apple1,
            R.drawable.asus,R.drawable.dell,R.drawable.hp,R.drawable.lenovo,R.drawable.microsoft,R.drawable.msi,R.drawable.samsung,R.drawable.toshiba};

    private static String[] preview = new String[]{
            "Acer merupakan sebuah merek lima besar komputer pribadi dunia. Produk Acer antara lain adalah desktop, notebook, server, penyimpanan data, layar, peripheral, dan solusi e-bisnis untuk bisnis, pemerintah, pendidikan dan pengguna pribadi.Grup pan Acer mempekerjakan 39.000 orang di lebih dari 100 negara. Kantor pusatnya terletak di Kota Sijhih, Taipei County, Taiwan.",
            "Apple Inc. adalah perusahaan teknologi multinasional yang berpusat di Cupertino, California, yang merancang, mengembangkan, dan menjual barang elektronik konsumen, perangkat lunak komputer, dan layanan daring. Perangkat keras yang diproduksi Apple meliputi telepon pintar iPhone, komputer tablet iPad, komputer pribadi Mac, pemutar media portabel iPod.",
            "Asustek Computer Inc. ditulis dengan gaya huruf kapital ASUS, adalah sebuah perusahaan berbasis di Taiwan yang memproduksi komponen komputer seperti papan induk, kartu grafis, dan notebook. Asus belakangan ini mulai memproduksi PDA, Telepon genggam, monitor LCD, tablet dan produk komputer lainnya. Pesaing utamanya termasuk MSI, dan Gigabyte.",
            "Dell, Inc. (NASDAQ: DELL), adalah sebuah perusahaan berbasis di Round Rock, Texas, Amerika Serikat, memproduksi dan memasarkan perangkat keras komputer (kebanyakan klon IBM). Sebagian pasarnya berada di komputer pribadi, namun Dell juga menjual server, alat penyimpanan data, switch jaringan, dan kluster komputer untuk perusahaan.",
            "Hewlett-Packard Company NYSE: HPQ, dikenal umum sebagai HP, adalah salah satu perusahaan teknologi informasi terbesar dunia. Hewlett-Packard dibangun oleh dua orang yang bernama Bill Hewlett dan Dave Packard. Bermarkas besar di Palo Alto, California, Amerika Serikat, perusahaan ini memiliki keberadaan global dalam bidang komputasi, percetakan, dan gambaran digital.",
            "Lenovo Group Limited, sebelumnya dikenal dengan nama Legend Group, adalah produsen PC terbesar di Republik Rakyat Tiongkok. Pada 2004, Lenovo adalah produsen PC terbesar kedelapan di dunia. Lenovo juga menjual server, komputer genggam, perangkat pencitraan, dan telepon genggam.Lenovo juga menyediakan integrasi teknologi informasi dan jasa dukungan kepadanya.",
            "Microsoft Corporation (NASDAQ: MSFT) adalah sebuah perusahaan multinasional Amerika Serikat yang berkantor pusat di Redmond, Washington, Amerika Serikat yang mengembangkan, membuat, memberi lisensi, dan mendukung berbagai produk dan jasa terkait dengan komputer. Perusahaan ini didirikan oleh Bill Gates dan Paul Allen pada tanggal 4 April 1975.",
            "Micro-Star International merupakan sebuah perusahaan multinasional berasal dari Taiwan yang menghasilkan berbagai macam produk komputer, produk dan jasa yang relevan seperti laptop, desktop PC, motherboard, kartu grafis (GPU), dan sebagainya. Perusahaan ini didirikan pada tahun 1986. Berbasis di Distrik Zhonghei, Taipei, Taiwan.",
            "Samsung Group[3] adalah sebuah konglomerat multinasional yang berkantor pusat di Samsung Town, Seoul, Korea Selatan.[1] Perusahaan ini memiliki sejumlah anak usaha[1] yang mayoritas berbisnis dengan merek Samsung, dan perusahaan ini merupakan chaebol terbesar di Korea Selatan.Samsung didirikan oleh Lee Byung-chul pada tahun 1938 sebagai sebuah perusahaan perdagangan.",
            "Toshiba adalah perusahaan pemroduksi elektronik teknologi tinggi yang bermarkas di Tokyo, Jepang. Toshiba adalah perusahaan elektronik terbesar di dunia. Toshiba saat ini kebanyakan buatan RRC.Toshiba merupakan perusahaan komputer terbesar kelima di dunia, di bawah Hewlett-Packard dari AS, Dell dari AS, Acer dari Taiwan, dan Apple dari AS.",
    };

    public static ArrayList<Model> getListData(){
        Model Model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
           Model = new Model();
           Model.setLambangTeam(thumbnail[i]);
           Model.setNamaTeam(title[i]);
           Model.setPrivew(preview[i]);
            list.add(Model);
        }
        return list;
    }
}
