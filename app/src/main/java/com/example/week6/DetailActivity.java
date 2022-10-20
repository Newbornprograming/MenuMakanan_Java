package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imgViewMakanan;
    TextView txtViewJudul, txtViewisi, txtViewHarga;

    String namaMakanan, infoMakanan, hargaMakanan;
    int fotoMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtViewJudul = findViewById(R.id.txtViewJudul);
        txtViewisi = findViewById(R.id.txtViewisi);
        txtViewHarga = findViewById(R.id.txtViewHarga);
        imgViewMakanan = findViewById(R.id.imgViewMakanan);

        // foto makanan
        Bundle bundle =  getIntent().getExtras();
        fotoMakanan = bundle.getInt(String.valueOf("foto_makanan"));
        imgViewMakanan.setImageResource(fotoMakanan);

        getInputExtra();
    }

    private void getInputExtra(){
        namaMakanan = getIntent().getStringExtra("nama_makanan");
        infoMakanan = getIntent().getStringExtra("info_makanan");
        hargaMakanan= getIntent().getStringExtra("harga");

        setDataActivity(namaMakanan, infoMakanan, hargaMakanan);
    }

    private void setDataActivity(String namaMakanan, String infoMakanan, String hargaMakanan){
        txtViewJudul.setText(namaMakanan);
        txtViewisi.setText(infoMakanan);
        txtViewHarga.setText(hargaMakanan);
    }
}