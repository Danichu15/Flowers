package com.example.flowers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ScrollView;

import java.net.CookieHandler;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout desplegable;
    ConstraintLayout desplegableFiltos;
    private final int  ANCHO = 2147483647;
    private final int ALTO = 2147483647;
    private int indiceLista = 1;
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

        desplegable = (ConstraintLayout) findViewById(R.id.desplegable);
        desplegable.setVisibility(View.INVISIBLE);
        desplegable.setEnabled(false);

        desplegableFiltos = (ConstraintLayout) findViewById(R.id.filtros);
        desplegableFiltos.setVisibility(View.INVISIBLE);
        desplegableFiltos.setEnabled(false);
        desplegableFiltos.setMaxHeight(0);

    }

    public void desplegarMenu(View view){
        ImageButton menu = (ImageButton) findViewById(R.id.botonMenu);

        if(desplegable.getVisibility() == View.VISIBLE){
            desplegable.setVisibility(View.INVISIBLE);
            desplegable.setEnabled(false);

            menu.setImageResource(R.drawable.menu);
            menu.setBackgroundColor(Color.parseColor("#00ff94db"));
        }else{
            desplegable.setVisibility(View.VISIBLE);
            desplegable.setEnabled(true);

            menu.setImageResource(R.drawable.menuclick);
            menu.setBackgroundColor(Color.parseColor("#ff94db"));
        }
    }

    public void desplegarFiltros(View view){
        ImageButton filtros = (ImageButton) findViewById(R.id.botonFiltros);

        if(desplegableFiltos.getVisibility() == View.VISIBLE){
            desplegableFiltos.setVisibility(View.INVISIBLE);
            desplegableFiltos.setEnabled(false);
            desplegableFiltos.setMaxHeight(0);

            filtros.setImageResource(R.drawable.filtrosoff);
        }else{
            desplegableFiltos.setVisibility(View.VISIBLE);
            desplegableFiltos.setEnabled(true);
            desplegableFiltos.setMaxHeight(ALTO);

            filtros.setImageResource(R.drawable.filtroson);
        }
    }

    public void cambiarColor(View view){
        ImageButton botonColor = (ImageButton)findViewById(R.id.color);
        ConstraintLayout paquete1 = (ConstraintLayout)findViewById(R.id.paquete1);
        ConstraintLayout paquete2 = (ConstraintLayout)findViewById(R.id.paquete2);
        ConstraintLayout paquete3 = (ConstraintLayout)findViewById(R.id.paquete3);
        ConstraintLayout paquete4 = (ConstraintLayout)findViewById(R.id.paquete4);
        ConstraintLayout paquete5 = (ConstraintLayout)findViewById(R.id.paquete5);

        switch (indiceLista){
            case 0:
                botonColor.setImageResource(R.drawable.todos);
                indiceLista++;
                if(paquete1.getVisibility() == View.INVISIBLE){
                    paquete1.setVisibility(View.VISIBLE);
                    paquete1.setEnabled(true);
                    paquete1.setMaxHeight(ALTO);
                    paquete1.setMaxWidth(ANCHO);
                }
                if(paquete2.getVisibility() == View.INVISIBLE){
                    paquete2.setVisibility(View.VISIBLE);
                    paquete2.setEnabled(true);
                    paquete2.setMaxHeight(ALTO);
                    paquete2.setMaxWidth(ANCHO);
                }
                if(paquete3.getVisibility() == View.INVISIBLE){
                    paquete3.setVisibility(View.VISIBLE);
                    paquete3.setEnabled(true);
                    paquete3.setMaxHeight(ALTO);
                    paquete3.setMaxWidth(ANCHO);
                }
                if(paquete4.getVisibility() == View.INVISIBLE){
                    paquete4.setVisibility(View.VISIBLE);
                    paquete4.setEnabled(true);
                    paquete4.setMaxHeight(ALTO);
                    paquete4.setMaxWidth(ANCHO);
                }
                if(paquete5.getVisibility() == View.INVISIBLE){
                    paquete5.setVisibility(View.VISIBLE);
                    paquete5.setEnabled(true);
                    paquete5.setMaxHeight(ALTO);
                    paquete5.setMaxWidth(ANCHO);
                }
                break;
            case 1:
                botonColor.setImageResource(R.drawable.rojo);
                indiceLista++;
                if(paquete2.getVisibility() == View.INVISIBLE) {
                    paquete2.setVisibility(View.VISIBLE);
                    paquete2.setEnabled(true);
                    paquete2.setMaxHeight(ALTO);
                    paquete2.setMaxWidth(ANCHO);
                }
                if(paquete1.getVisibility() == View.VISIBLE){
                    paquete1.setVisibility(View.INVISIBLE);
                    paquete1.setEnabled(false);
                    paquete1.setMaxHeight(0);
                    paquete1.setMaxWidth(0);
                }
                if(paquete3.getVisibility() == View.VISIBLE){
                    paquete3.setVisibility(View.INVISIBLE);
                    paquete3.setEnabled(false);
                    paquete3.setMaxHeight(0);
                    paquete3.setMaxWidth(0);
                }
                if(paquete4.getVisibility() == View.VISIBLE){
                    paquete4.setVisibility(View.INVISIBLE);
                    paquete4.setEnabled(false);
                    paquete4.setMaxHeight(0);
                    paquete4.setMaxWidth(0);
                }
                if(paquete5.getVisibility() == View.VISIBLE){
                    paquete5.setVisibility(View.INVISIBLE);
                    paquete5.setEnabled(false);
                    paquete5.setMaxHeight(0);
                    paquete5.setMaxWidth(0);
                }
                break;
            case 2:
                botonColor.setImageResource(R.drawable.blanco);
                indiceLista++;
                if(paquete1.getVisibility() == View.INVISIBLE) {
                    paquete1.setVisibility(View.VISIBLE);
                    paquete1.setEnabled(true);
                    paquete1.setMaxHeight(ALTO);
                    paquete1.setMaxWidth(ANCHO);
                }
                if(paquete2.getVisibility() == View.VISIBLE){
                    paquete2.setVisibility(View.INVISIBLE);
                    paquete2.setEnabled(false);
                    paquete2.setMaxHeight(0);
                    paquete2.setMaxWidth(0);
                }
                if(paquete3.getVisibility() == View.VISIBLE){
                    paquete3.setVisibility(View.INVISIBLE);
                    paquete3.setEnabled(false);
                    paquete3.setMaxHeight(0);
                    paquete3.setMaxWidth(0);
                }
                if(paquete4.getVisibility() == View.VISIBLE){
                    paquete4.setVisibility(View.INVISIBLE);
                    paquete4.setEnabled(false);
                    paquete4.setMaxHeight(0);
                    paquete4.setMaxWidth(0);
                }
                if(paquete5.getVisibility() == View.VISIBLE){
                    paquete5.setVisibility(View.INVISIBLE);
                    paquete5.setEnabled(false);
                    paquete5.setMaxHeight(0);
                    paquete5.setMaxWidth(0);
                }
                break;
            case 3:
                botonColor.setImageResource(R.drawable.violeta);
                indiceLista++;
                if(paquete5.getVisibility() == View.INVISIBLE) {
                    paquete5.setVisibility(View.VISIBLE);
                    paquete5.setEnabled(true);
                    paquete5.setMaxHeight(ALTO);
                    paquete5.setMaxWidth(ANCHO);
                }
                if(paquete2.getVisibility() == View.VISIBLE){
                    paquete2.setVisibility(View.INVISIBLE);
                    paquete2.setEnabled(false);
                    paquete2.setMaxHeight(0);
                    paquete2.setMaxWidth(0);
                }
                if(paquete3.getVisibility() == View.VISIBLE){
                    paquete3.setVisibility(View.INVISIBLE);
                    paquete3.setEnabled(false);
                    paquete3.setMaxHeight(0);
                    paquete3.setMaxWidth(0);
                }
                if(paquete4.getVisibility() == View.VISIBLE){
                    paquete4.setVisibility(View.INVISIBLE);
                    paquete4.setEnabled(false);
                    paquete4.setMaxHeight(0);
                    paquete4.setMaxWidth(0);
                }
                if(paquete1.getVisibility() == View.VISIBLE){
                    paquete1.setVisibility(View.INVISIBLE);
                    paquete1.setEnabled(false);
                    paquete1.setMaxHeight(0);
                    paquete1.setMaxWidth(0);
                }
                break;
            case 4:
                botonColor.setImageResource(R.drawable.multicolor);
                indiceLista = 0;
                if(paquete3.getVisibility() == View.INVISIBLE) {
                    paquete3.setVisibility(View.VISIBLE);
                    paquete3.setEnabled(true);
                    paquete3.setMaxHeight(ALTO);
                    paquete3.setMaxWidth(ANCHO);
                }
                if(paquete4.getVisibility() == View.INVISIBLE) {
                    paquete4.setVisibility(View.VISIBLE);
                    paquete4.setEnabled(true);
                    paquete4.setMaxHeight(ALTO);
                    paquete4.setMaxWidth(ANCHO);
                }
                if(paquete2.getVisibility() == View.VISIBLE){
                    paquete2.setVisibility(View.INVISIBLE);
                    paquete2.setEnabled(false);
                    paquete2.setMaxHeight(0);
                    paquete2.setMaxWidth(0);
                }
                if(paquete1.getVisibility() == View.VISIBLE){
                    paquete1.setVisibility(View.INVISIBLE);
                    paquete1.setEnabled(false);
                    paquete1.setMaxHeight(0);
                    paquete1.setMaxWidth(0);
                }
                if(paquete5.getVisibility() == View.VISIBLE){
                    paquete5.setVisibility(View.INVISIBLE);
                    paquete5.setEnabled(false);
                    paquete5.setMaxHeight(0);
                    paquete5.setMaxWidth(0);
                }
                break;
        }
    }

    public void top(View veiew) throws InterruptedException {
        ImageButton topButton = (ImageButton) findViewById(R.id.botonInicio);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView2);

        scrollView.fullScroll(0);

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
    public void goFlower1(View view){
        finish();
        Intent intent = new Intent(this,FlowerActivity1.class);
        startActivity(intent);
    }
    public void goFlower2(View view){
        finish();
        Intent intent = new Intent(this,FlowerActivity2.class);
        startActivity(intent);
    }
    public void goFlower3(View view){
        finish();
        Intent intent = new Intent(this,FlowerActivity3.class);
        startActivity(intent);
    }
    public void goFlower4(View view){
        finish();
        Intent intent = new Intent(this,FlowerActivity4.class);
        startActivity(intent);
    }
    public void goFlower5(View view){
        finish();
        Intent intent = new Intent(this,FlowerActivity5.class);
        startActivity(intent);
    }

}
