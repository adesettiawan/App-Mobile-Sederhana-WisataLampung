package com.example.listwisatalampung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.lang.ref.SoftReference;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFoto;
    TextView textJudulWisata, textDetail;
    private String title = "Informasi Wisata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFoto = findViewById(R.id.imageViewFoto);
        textJudulWisata = findViewById(R.id.textJudulWisata);
        textDetail = findViewById(R.id.textDetail);

        String fotowisata = getIntent().getStringExtra("foto");
        String nama = getIntent().getStringExtra("nama");
        String detail = getIntent().getStringExtra("detail");


        Glide.with(this).asBitmap().load(fotowisata).into(imageViewFoto);

        textJudulWisata.setText(nama);
        textDetail.setText(detail);

        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
