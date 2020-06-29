package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;

import java.util.ArrayList;
import java.util.List;

public class MascotasSaved extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView reyclerSavedMascotas;
    private Adaptador adaptadorsaved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_saved);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        reyclerSavedMascotas = (RecyclerView) findViewById(R.id.recyclerMascotasSaved);
        reyclerSavedMascotas.setLayoutManager(new LinearLayoutManager(this));

        adaptadorsaved = new Adaptador(obtmascotas());
        reyclerSavedMascotas.setAdapter(adaptadorsaved);
        }


        public List<MascotasModelo> obtmascotas(){
            List<MascotasModelo> mascota = new ArrayList<>();
            mascota.add(new MascotasModelo("peyito1",R.drawable.a6));
            mascota.add(new MascotasModelo("peyito1",R.drawable.a7));
            mascota.add(new MascotasModelo("peyito1",R.drawable.a8));
            mascota.add(new MascotasModelo("peyito1",R.drawable.a9));
            return mascota;

        }




    }