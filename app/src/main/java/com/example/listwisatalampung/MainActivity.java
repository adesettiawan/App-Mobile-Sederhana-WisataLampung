package com.example.listwisatalampung;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoWisata = new ArrayList<>();
    private ArrayList<String> namaWisata = new ArrayList<>();
    private ArrayList<String> detailWisata = new ArrayList<>();
    private String title = "Wisata Lampung";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getData();

        setActionBarTitle(title);

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void prosesRecyclerViewAdapter(){

        final RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoWisata, namaWisata, detailWisata, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getData() {

        fotoWisata.add("https://pesona.travel/files/Uploads/Gigi%20Hiu3.jpeg");
        namaWisata.add("Pantai Gigi Hiu");
        detailWisata.add("Pantai Gigi Hiu adalah sebuah objek wisata berupa pantai berbatuan yang terletak di Kecamatan Kelumbayan, Kabupaten Tanggamus, Lampung, Indonesia. Daya tarik dari objek wisata ini berupa batu-batu karang yang menjulang tinggi di pinggir pantai. Berbeda dengan umumnya pantai yang menjadi terkenal karena hamparan pasir landai yang luas, Pantai gigi hiu justru tidak memiliki pasir. Kalaupun ada sangat sempit. Pantai ini menyambut pengunjung dengan hal yang berbeda. Pantai ini penuh dengan hamparan bebatuan artistik yang tersebar secara alami di sepanjang pesisir.\n" +
                "\n" +
                "Perairan sekitar pantai dipenuhi gugusan bebatuan karang yang menjulang hingga 10 meter. Pemandangan ini akan membuat pengunjung terpesona. Mengingatkan pada kondisi pantai di film animasi avatar, yang dipakai latihan pendekar pengendali bumi.");

        fotoWisata.add("https://cdn2.tstatic.net/lampung/foto/bank/images/grand-elty-krakatoa-1.jpg");
        namaWisata.add("Grand Elty Krakatoa");
        detailWisata.add("Grand Elty Krakatoa merupakan sebuah hotel dan resort yang dikelola perusahaan keluarga Bakrie yang menawarkan keindahan pemandangan pantai yang ia miliki. Pantai dengan pasir putih nan bersih dan laut yang tenang karena minim ombak, menjadi tempat yang asyik untuk membunuh penat. ");

        fotoWisata.add("https://www.indonesia-tourism.com/lampung/images/lembah_hijau.jpg");
        namaWisata.add("Taman Wisata Lembah Hijau");
        detailWisata.add("Taman Wisata Lembah Hijau adalah taman wisata keluarga berorentasi lingkungan, memadukan antara rekreasi, nuansa kesegaran alam nan hijau dan pengetahuan, taman wisata yang berlokasi di  Bandar Lampung yang menjadi ibukota Provinsi Lampung ini berdiri diatas kawasan lembah dengan luas 30 Ha di Jalan Raden Imba Kesuma Ratu Kelurahan Sukadana Ham Tanjung Karang Barat Bandar Lampung. Berbagai wahana sarana rekreasi keluarga menarik mulai dari Wahana Air, OutBound, Camping Ground, Wahana Permainan, hingga wahana rekreasi bernuansa pengetahuan alam sengaja kami persembahkan untuk memanjakan saat-saat santai bagi masyarakat pengunjung.");

        fotoWisata.add("https://www.nativeindonesia.com/wp-content/uploads/2017/03/Pulau-pahawang-1.jpg");
        namaWisata.add("Pulau Pahawang");
        detailWisata.add("Pulau Pahawang adalah desa dan pulau di kecamatan Marga Punduh, Kabupaten Pesawaran, Lampung, Indonesia.Pulau ini terletak lepas Teluk Punduh.Jalan Raya Bumi Sari Natar Gang Bima Ruko Orange memiliki sejuta pesona yang tidak kalah menarik dengan obyek lainnya. Saat ini Pulau ini mulai sering dimasukkan dalam setiap penawaran paket wisata yang ada di Lampung.");

        fotoWisata.add("https://www.nativeindonesia.com/wp-content/uploads/2019/08/Puncak-tirtayasa.jpg");
        namaWisata.add("Muncak Tirtayasa");
        detailWisata.add("Muncak Tirtayasa adalah sebuah objek wisata yang terletak di Pesawaran, Lampung. Destinasi Muncak Tirtayasa yang dahulu dikenal dengan nama Puncak Teropong Laut muncul sebagai destinasi wisata dengan konsep dataran tinggi. Sebuah destinasi yang mengandalkan keindahan panorama dengan sudut pandang luas yang sangat Instagramable.");

        fotoWisata.add("https://gambar.lampung.co/2018/04/Air-Terjun-Putri-Malu.jpg");
        namaWisata.add("Air Terjun Putri Malu");
        detailWisata.add("Air Terjun Putri Malu adalah air terjun dengan ketinggian kurang lebih 80 meter ini bagaikan surga tersembunyi di tengah hutan belantara Kabupaten Way Kanan.");

        fotoWisata.add("https://www.nativeindonesia.com/wp-content/uploads/2019/07/pantai-sari-ringgung.jpg");
        namaWisata.add("Pantai Sari Ringgung");
        detailWisata.add("Pantai Sari Ringgung merupakan salah satu objek wisata pantai favorit di Lampung. Beralamat di Kabupaten Pesawaran, Provinsi Lampung, Pantai Sari Ringgung memiliki jarak tempuh 14 Km atau ± 30 Menit dari pusat Kota Bandar Lampung. Jarak dari Kota Bandar Lampung ke Pantai Sari Ringgung sekitar 14 km, atau bisa ditempuh dengan kendaraan sekitar 30 menit.");

        fotoWisata.add("https://www.nativeindonesia.com/wp-content/uploads/2019/10/Menara-Siger.jpg");
        namaWisata.add("Menara Siger");
        detailWisata.add("Menara Siger adalah menara yang juga menjadi titik nol Sumatra Gubernur Lampung Sjachroedin Z.P. dalam peresmian Menara Siger pada 30 April 2008, ia menyatakan optimistis Menara Siger akan mendorong kemajuan Lampung. Peresmian ini ditandai dengan penekanan sirine, penandatanganan prasasti, serta penglepasan merpati bersama puluhan duta besar. Dengan iringan lagu Mars Lampung oleh Korps Musik (Korsik) Pemprov Lampung, Ny. Truly Sjachroedin menggunting rangkaian melati di pintu masuk bangunan menara enam lantai tersebut. Menara Siger kebanggaan masyarakat Lampung tersebut berada di atas bukit dengan ketinggian 110 meter di atas permukaan laut. Pembangunan menara sejak tahun 2005 menghabiskan biaya Rp15 miliar. Menara Siger adalah simbol Lampung. Ia bukan hanya menjadi ikon pariwisata, tetapi dapat menjadi ikon dalam segala hal: keagamaan, seni dan budaya, pendidikan.Anshori Djausal sebagai perancang mengungkapkan Menara Siger dapat memancing pengembangan kawasan pintu gerbang Pulau Sumatra. Pasca peresmian akan masuk investasi Rp100 miliar hingga Rp200 miliar. Dosen Fakultas Teknik Universitas Lampung ini menambahkan, dalam setahun sekitar 15 juta – 20 juta orang melintas di Pelabuhan Bakauheni. Hal tersebut merupakan sebuah potensi bagi promosi kepariwisataan dan potensi ekonomi.");

        fotoWisata.add("https://www.nativeindonesia.com/wp-content/uploads/2019/07/Teluk-Kiluan.jpg");
        namaWisata.add("Pantai Teluk Kiluan");
        detailWisata.add("Teluk Kiluan adalah objek wisata pantai yang terletak di Bumi Sari Natar, Kabupaten Tanggamus Provinsi Lampung dengan potensi wisata bahari, dan terkenal dengan banyaknya lumba-lumba, ikan paus disekitaran Teluk Kiluan. Teluk Kiluan juga terkenal dengan keindahan alam dan surga bagi para pemancing handal. Karena setiap tahun diadakan lomba memancing yang diikuti oleh para pemancing handal di seluruh Indonesia. Lokasinya berjarak 73 km dari Bandara Lampung dan dapat dicapai selama 3 jam menggunakan mobil.");

        fotoWisata.add("https://www.jejakpiknik.com/wp-content/uploads/2017/12/@ele_partner-630x380.jpg");
        namaWisata.add("Taman Nasional Way Kambas");
        detailWisata.add("Taman Nasional Way Kambas adalah taman nasional perlindungan gajah yang terletak di daerah Lampung tepatnya di Kecamatan Labuhan Ratu, Lampung Timur, Indonesia. Selain di Way Kambas, sekolah gajah (Pusat Latihan Gajah) juga bisa ditemui di Minas, Riau. Gajah Sumatra (Elephas maximus sumatranus) yang hidup di kawasan ini semakin berkurang jumlahnya. Taman Nasional Way Kambas berdiri pada tahun 1985 merupakan sekolah gajah pertama di Indonesia. Di Taman Nasional Way Kambas ini terdapat hewan yang hampir punah di antaranya Badak sumatera, Gajah Sumatra, Harimau sumatera, Mentok Rimba, Buaya sepit. Untuk tanaman banyak diketemukan Api-api, Pidada, Nipah, pandan. Di bagian pesisir Taman Nasional Way Kambas yang berawa juga sering ditemukan berbagai jenis burung antara lain Bangau Tongtong, Sempidan Biru, Kuau raja, Burung Pependang Timur, dan beberapa burung lainnya.");

        prosesRecyclerViewAdapter();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_user) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
