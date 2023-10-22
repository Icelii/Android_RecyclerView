package com.example.android_recycler_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android_recycler_v2.adapter.TributosAdapter;
import com.example.android_recycler_v2.models.Distrito;
import com.example.android_recycler_v2.models.Tributos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Tributos> tributo = new ArrayList<>();
        tributo.add(new Tributos("Katniss Everdeen", 16, "Femenino","Sinsajo", new Distrito(12)));
        tributo.add(new Tributos("Peeta Mellark", 16, "Masculino","El panadero", new Distrito(12)));
        tributo.add(new Tributos("Haymitch Abernathy", 40, "Masculino","Sin alias", new Distrito(12)));
        tributo.add(new Tributos("Rue", 12, "Femenino","Sin alias", new Distrito(11)));
        tributo.add(new Tributos("Johanna Mason", 21, "Femenino","Sin alias", new Distrito(7)));
        tributo.add(new Tributos("Finnick Odair", 24, "Masculino","Sin alias", new Distrito(4)));
        tributo.add(new Tributos("Cato", 18, "Masculino","Sin alias", new Distrito(2)));
        tributo.add(new Tributos("Glimmer", 17, "Femenino","Sin alias", new Distrito(1)));

        TributosAdapter tri = new TributosAdapter(tributo);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rvTributos);
        rv.setAdapter(tri);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}