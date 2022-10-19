package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listkuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listkuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData()
    {
        this.listkuliner = new ArrayList<>();
        listkuliner.add(new Kuliner("Pecel Lele",
                "Rp 18.000",
                "Lele yang digoreng dengan sambal tomat dan deilengkapi lalapaan kemangi dan mentimun.",
                R.drawable.menulele));

        listkuliner.add(new Kuliner("Nasi Goreng Mercon",
                "Rp 16.000",
                "Nasi yang digoreng dengan kecap, racikan sambal pedas dan pelengkap telur ceplok, suwiran daging ayam, dan kerupuk.",
                R.drawable.menunasgor));

        listkuliner.add(new Kuliner("Ayam Geprek Keju",
                "Rp 20.000",
                "Ayam goreng krispi yang diulek dengan sambal dan ditambahkan parutan keju",
                R.drawable.menugeprek));

        listkuliner.add(new Kuliner("Kari Ayam",
                "Rp 25.000",
                "Bumbu rempah-rempah seperti ketumbar, kunyit, merica, cabai, bubuk paprika, jintan, kayu manis, kapulaga, bunga lawang, kelabet, adas manis, daun salam koja, dan cengkih.",
                R.drawable.menukari));

        listkuliner.add(new Kuliner("Tahu Bulat",
                "Rp 10.000",
                "Tahu dengan isi kopong dengan cabai atau bumbu BBQ.",
                R.drawable.menutahu));

        listkuliner.add(new Kuliner("Salad Buah",
                "Rp 15.000",
                "Berisi buah segar, keju, mayonaise, saus chefqu dan jely",
                R.drawable.menusalad));
    }
}