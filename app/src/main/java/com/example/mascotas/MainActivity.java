package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerViewMascotas;
    private Adaptador adapmascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerViewMascotas = (RecyclerView) findViewById(R.id.recyclerMascotas);
        recyclerViewMascotas.setLayoutManager(new LinearLayoutManager(this));

        adapmascotas = new Adaptador(obtmascotas());
        recyclerViewMascotas.setAdapter(adapmascotas);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.miCompose:
                Intent intent = new Intent(this, MascotasSaved.class);
                this.startActivity(intent);
                break;
            case R.id.miProfile:
                // another startActivity, this is for item with id "menu_item2"
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
    public List<MascotasModelo> obtmascotas(){
        List<MascotasModelo> mascota = new ArrayList<>();
        mascota.add(new MascotasModelo("peyito1",R.drawable.a1));
        mascota.add(new MascotasModelo("peyito1",R.drawable.a2));
        mascota.add(new MascotasModelo("peyito1",R.drawable.a3));
        mascota.add(new MascotasModelo("peyito1",R.drawable.a4));
        mascota.add(new MascotasModelo("peyito1",R.drawable.a5));
        return mascota;

    }


}
