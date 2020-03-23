package com.example.flowers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
    private boolean like1 = false;
    private boolean like2 = false;
    private boolean like3 = false;
    private boolean like4 = false;
    private boolean like5 = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        paquete1 = findViewById(R.id.paquete1);

    }

    public void añadirFlor(View view){

        ImageButton menu = (ImageButton) findViewById(R.id.botonMenu);

        if(paquete1.getVisibility() == View.VISIBLE){
            paquete1.setVisibility(View.INVISIBLE);
            paquete1.setEnabled(false);
            paquete1.setMaxHeight(0);
            paquete1.setMaxWidth(0);

            menu.setImageResource(R.drawable.menuclick);
            menu.setBackgroundColor(Color.parseColor("#ff94db"));
        }else{
            paquete1.setVisibility(View.VISIBLE);
            paquete1.setEnabled(true);
            paquete1.setMaxHeight(ALTO);
            paquete1.setMaxWidth(ANCHO);

            menu.setImageResource(R.drawable.menu);
            menu.setBackgroundColor(Color.parseColor("#00ff94db"));
        }
    }

    public void like1(View view){

        ImageButton like = (ImageButton) findViewById(R.id.botonMeGusta1);

        if(!this.like1){
            like.setImageResource(R.drawable.like);
            this.like1 = true;
        }else{
            like.setImageResource((R.drawable.nolike));
            this.like1 = false;
        }

    }

    public void like2(View view){

        ImageButton like = (ImageButton) findViewById(R.id.botonMeGusta2);

        if(!this.like2){
            like.setImageResource(R.drawable.like);
            this.like2 = true;
        }else{
            like.setImageResource((R.drawable.nolike));
            this.like2 = false;
        }

    }

    public void like3(View view){

        ImageButton like = (ImageButton) findViewById(R.id.botonMeGusta3);

        if(!this.like3){
            like.setImageResource(R.drawable.like);
            this.like3 = true;
        }else{
            like.setImageResource((R.drawable.nolike));
            this.like3 = false;
        }

    }

    public void like4(View view){

        ImageButton like = (ImageButton) findViewById(R.id.botonMeGusta4);

        if(!this.like4){
            like.setImageResource(R.drawable.like);
            this.like4 = true;
        }else{
            like.setImageResource((R.drawable.nolike));
            this.like4 = false;
        }

    }

    public void like5(View view){

        ImageButton like = (ImageButton) findViewById(R.id.botonMeGusta5);

        if(!this.like5){
            like.setImageResource(R.drawable.like);
            this.like5 = true;
        }else{
            like.setImageResource((R.drawable.nolike));
            this.like5 = false;
        }

    }

}
