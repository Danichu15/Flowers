package com.example.flowers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ScrollView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageButton botonMenu;
    private ConstraintLayout paquete1;
    private final int  ANCHO = 2147483647;
    private final int ALTO = 2147483647;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        paquete1 = findViewById(R.id.paquete1);

    }

    public void añadirFlor(View view){

        if(paquete1.getVisibility() == View.VISIBLE){
            paquete1.setVisibility(View.INVISIBLE);
            paquete1.setEnabled(false);
            paquete1.setMaxHeight(0);
            paquete1.setMaxWidth(0);
        }else{
            paquete1.setVisibility(View.VISIBLE);
            paquete1.setEnabled(true);
            paquete1.setMaxHeight(ALTO);
            paquete1.setMaxWidth(ANCHO);
        }


    }

}
