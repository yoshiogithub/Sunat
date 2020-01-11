package com.isil.sunat.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.isil.sunat.R;
import com.isil.sunat.entidades.Tributante;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tributante.igv = 0.19;
        //Tributante.ModificarIGV(0.21);

        Tributante t1 = new Tributante(1001, "Juan",
                "Perez", 100000);
        Tributante t2 = new Tributante(1001, "María",
                "Reyes", 206750);

        TextView textoRes = findViewById(R.id.tvRes);
        textoRes.setText(t1.MostrarInfo()+"\n\n"+
        t2.MostrarInfo());
    }
}
