package com.crocodic.tugas1resepmakanan;

//Nama : Afif Faishal Najib
//Nim : A11.2014.08251
//PM4508

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<resep> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private resepAdapter rAdapter;

    public static int tanda = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        rAdapter = new resepAdapter(resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rAdapter);

        MenuClickRecyclerview.addTo(recyclerView).setOnItemClickListener(new MenuClickRecyclerview.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                tanda = position;
                Intent i = new Intent(MainActivity.this,ActDetail.class);
                startActivity(i);
            }
        });

        prepareresepData();
    }
    private void prepareresepData() {
        resep Resep1 = new resep("Nasi Goreng",
                "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, \n" +
                "biasanya ditambah kecap manis, bawang merah, bawang putih, dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk."
                , R.drawable.ns
                , "Ingredients :\n" +
                "2-3 piring nasi\n" +
                "2 buah telur\n" +
                "1 genggam kol iris\n" +
                "1 genggam sayuran hijau\n" +
                "Secukupnya garam, kecap asin, penyedap, merica bubuk\n" +
                "1 sdm margarin"
                , "Procedure :\n" +
                "Panaskan minyak dan margarin. Lalu masukkan telur. Acak2 telurnya\n" +
                "Masukkan sayuran. Aduk rata lalu beri kecap asin\n" +
                "Masak sampai sayuran agak layu\n" +
                "Masukkan nasi. Lalu bumbui dan aduk2. Tes rasa\n" +
                "Angkat dan sajikan.");
        resepList.add(Resep1);

        resep Resep2 = new resep("Ayam Goreng", "Ayam goreng adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. \n" +
                "Beberapa rumah makan siap saji secara khusus menghidangkan ayam goreng, misalnya Kentucky Fried Chicken.", R.drawable.ag, "Ingredients :\n" +
                "4 sayap ayam\n" +
                "1 sdm garam\n" +
                "2 kemiri\n" +
                "2 daun jeruk\n" +
                "1 cm kunyit\n" +
                "2 bawang putih", "Procedure :\n" +
                "Haluskan bawang putih, kemiri, kunyit dan garam\n" +
                "Rebus bumbu dan ayam serta daun jeruk, masak hingga ayam empuk\n" +
                "Setelah empuk diamkan kurleb 10 menit biar dingin\n" +
                "Goreng hingga kecoklatan lalu angkat, sajikan dengan sambal dan lalapan");
        resepList.add(Resep2);

        resep Resep3 = new resep("Opor Ayam", "Opor ayam merupakan masakan yang sangat dikenal di Indonesia.\n" +
                " Opor ayam diklaim berasal dari daerah berbudaya Jawa, khususnya Jawa Tengah dan Jawa Timur sebelah barat.\n" +
                " Meskipun demikian, masakan ini juga telah dikenal luas di daerah lain.", R.drawable.oa, "Ingredients :\n" +
                "1 ekor ayam(potong sesuai selera)\n" +
                "2 buah kentang (bisa skip)\n" +
                "3 gelas beling santan\n" +
                "secukupnya garam\n" +
                "secukupnya gula\n" +
                "minyak goreng untuk menumis\n" +
                "Bumbu Halus :\n" +
                "10 bawang merah\n" +
                "5 bawang putih\n" +
                "1 ruas lengkuas\n" +
                "1 ruas jahe\n" +
                "1 ruas kunyit\n" +
                "6 ketumbar\n" +
                "1 kemiri\n" +
                "daun-daun :\n" +
                "secukupnya salam,sereh,daun jeruk", "Procedure :\n" +
                "Tumis bumbu halus sampai wangi\n" +
                "Masukkan daun-daun\n" +
                "Masukkan ayam + kentang, aduk sampai bumbu merata ke ayam & kentang, aduk sampai ayam setengah matang\n" +
                "Masukkan santan, aduk continue sampai kentang & ayam matang.\n" +
                "Nikmati selagi hangat (bisa ditaburi bawang goreng sesuai selera)");
        resepList.add(Resep3);

        resep Resep4 = new resep("Sop Ayam", "Sup ayam adalah sup yang terbuat dari ayam, yang dicampur dengan berbagai bahan makanan lainnya.\n" +
                " Sup ayam klasik terdiri dari kaldu encer, yang dimasukkan potongan ayam atau sayuran; umumnya ditambahkan.", R.drawable.spa, "Ingredients :\n" +
                "500 gr ayam kampung (saya pilih dada dan paha atas)\n" +
                "Jeruk nipis\n" +
                "1 tangkai daun bawang\n" +
                "2 tangkai daun seledri\n" +
                "3 siung bawang putih\n" +
                "1 siung bawang merah\n" +
                "1/2 sdt merica bubuk\n" +
                "3 cm jahe\n" +
                "Garam, kaldu ayam, gula\n" +
                "Air untuk merebus", "Procedure :\n" +
                "Bersihkan ayam, beri perasan jeruk nipis, diamkan selama 15 menit\n" +
                "Bilas ayam dengan air bersih. Rebus ayam dalam air. Kemudian potong ayam sesuai selera. Simpan air rebusan untuk di masak kembali.\n" +
                "Haluskan bumbu, bawang putih, bawang merah dan merica. Tumis sampai harum.\n" +
                "Siapkan air rebusan ayam, masukan jahe yang di geprek, daun bawang utuh, seledri utuh, bumbu halus yang sudah d tumis dan ayam.\n" +
                "Beri garam, gula dan kaldu ayam, koreksi rasa. Kemudian beri potongan daun seledri dan taburi bawang goreng.\n" +
                "Sop ayam siap di hidangkan.");
        resepList.add(Resep4);

        resep Resep5 = new resep("Soto Ayam", "Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran.\n" +
                "Daging yang paling sering digunakan adalah daging sapi dan ayam, tetapi ada pula yang menggunakan daging babi atau kambing.", R.drawable.sta, "Ingredients :\n" +
                "1/2 kg ayam\n" +
                "jeruk nipis\n" +
                "bawang merah\n" +
                "bawang putih\n" +
                "kemiri\n" +
                "jahe\n" +
                "kunyit\n" +
                "seledri\n" +
                "daun bawang\n" +
                "sereh\n" +
                "daun salam\n" +
                "daun jeruk\n" +
                "tomat\n" +
                "lada\n" +
                "lengkuas", "Procedure :\n" +
                "Pertama cuci ayam hingga bersih dan beri irisan jeruk nipis agar tidak bau\n" +
                "Didihkan air di dlm panci lalu masukan ayam dan 2lembar daun salam\n" +
                "Tunggu hingga ayam empuk, angkat dan suwir2 ayam tsb.. sisihkan\n" +
                "Ulek semua bumbu kecuali sereh dan lengkuas cukup di geprek aja, siapkan wajan dan minyak. tumis bumbu sebentar hingga harum dan agak kecoklatan\n" +
                "Masukan bumbu yg sudah di tumis kedalam panci ayam.. masak hingga meresap\n" +
                "Tambahkan seledri,daun bawang lada,garam,tomat,dan penyedap secukupnya\n" +
                "Test rasa dan sajikan\n" +
                "Note : tambahkan soun atau bihun dan toge saat ingin dimakan");
        resepList.add(Resep5);


        rAdapter.notifyDataSetChanged();
    }
}
