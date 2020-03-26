package com.example.flowers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout desplegable;
    ConstraintLayout desplegableFiltos;
    private final int  ANCHO = 2147483647;
    private final int ALTO = 2147483647;
    private int indiceListaColores = 1;
    private int indiceListaRegiones = 1;
    private int indiceListaDificultad = 1;
    private int indiceListaPaleta = 1;
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

            switch(indiceListaPaleta){
                case 0:
                    menu.setImageResource(R.drawable.menuosc);
                    break;
                case 1:
                    menu.setImageResource(R.drawable.menu);
                    break;
                case 2:
                    menu.setImageResource(R.drawable.menuazu);
                    break;
                case 3:
                    menu.setImageResource(R.drawable.menuver);
                    break;
                case 4:
                    menu.setImageResource(R.drawable.menuama);
                    break;
            }
            //menu.setBackgroundColor(Color.parseColor("#00ff94db"));
        }else{
            desplegable.setVisibility(View.VISIBLE);
            desplegable.setEnabled(true);

            menu.setImageResource(R.drawable.menuclick);
           //menu.setBackgroundColor(Color.parseColor("#ff94db"));
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

        switch (indiceListaColores){
            case 0:
                botonColor.setImageResource(R.drawable.todos);
                indiceListaColores++;
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
                indiceListaColores++;
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
                indiceListaColores++;
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
                indiceListaColores++;
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
                indiceListaColores = 0;
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

    public void cambiarRegion(View view){
        ImageButton botonRegion = (ImageButton)findViewById(R.id.region);
        ConstraintLayout paquete1 = (ConstraintLayout)findViewById(R.id.paquete1);
        ConstraintLayout paquete2 = (ConstraintLayout)findViewById(R.id.paquete2);
        ConstraintLayout paquete3 = (ConstraintLayout)findViewById(R.id.paquete3);
        ConstraintLayout paquete4 = (ConstraintLayout)findViewById(R.id.paquete4);
        ConstraintLayout paquete5 = (ConstraintLayout)findViewById(R.id.paquete5);

        switch (indiceListaRegiones){
            case 0:
                botonRegion.setImageResource(R.drawable.regiontodas);
                indiceListaRegiones++;
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
                botonRegion.setImageResource(R.drawable.regioneu);
                indiceListaRegiones++;
                if(paquete1.getVisibility() == View.INVISIBLE){
                    paquete1.setVisibility(View.VISIBLE);
                    paquete1.setEnabled(true);
                    paquete1.setMaxHeight(ALTO);
                    paquete1.setMaxWidth(ANCHO);
                }
                if(paquete4.getVisibility() == View.INVISIBLE){
                    paquete4.setVisibility(View.VISIBLE);
                    paquete4.setEnabled(true);
                    paquete4.setMaxHeight(ALTO);
                    paquete4.setMaxWidth(ANCHO);
                }
                if(paquete5.getVisibility() == View.VISIBLE){
                    paquete5.setVisibility(View.INVISIBLE);
                    paquete5.setEnabled(false);
                    paquete5.setMaxHeight(0);
                    paquete5.setMaxWidth(0);
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
                break;
            case 2:
                botonRegion.setImageResource(R.drawable.regionasia);
                indiceListaRegiones = 0;
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
                if(paquete5.getVisibility() == View.INVISIBLE){
                    paquete5.setVisibility(View.VISIBLE);
                    paquete5.setEnabled(true);
                    paquete5.setMaxHeight(ALTO);
                    paquete5.setMaxWidth(ANCHO);
                }
                if(paquete1.getVisibility() == View.VISIBLE){
                    paquete1.setVisibility(View.INVISIBLE);
                    paquete1.setEnabled(false);
                    paquete1.setMaxHeight(0);
                    paquete1.setMaxWidth(0);
                }
                if(paquete4.getVisibility() == View.VISIBLE){
                    paquete4.setVisibility(View.INVISIBLE);
                    paquete4.setEnabled(false);
                    paquete4.setMaxHeight(0);
                    paquete4.setMaxWidth(0);
                }
                break;
        }
    }

    public void cambiarDificultad(View view){
        ImageButton botonDificultad = (ImageButton)findViewById(R.id.dificultad);
        ConstraintLayout paquete1 = (ConstraintLayout)findViewById(R.id.paquete1);
        ConstraintLayout paquete2 = (ConstraintLayout)findViewById(R.id.paquete2);
        ConstraintLayout paquete3 = (ConstraintLayout)findViewById(R.id.paquete3);
        ConstraintLayout paquete4 = (ConstraintLayout)findViewById(R.id.paquete4);
        ConstraintLayout paquete5 = (ConstraintLayout)findViewById(R.id.paquete5);

        switch (indiceListaDificultad){
            case 0:
                botonDificultad.setImageResource(R.drawable.cuidadotodos);
                indiceListaDificultad++;
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
                botonDificultad.setImageResource(R.drawable.cuidadofacil);
                indiceListaDificultad++;
                if(paquete1.getVisibility() == View.INVISIBLE){
                    paquete1.setVisibility(View.VISIBLE);
                    paquete1.setEnabled(true);
                    paquete1.setMaxHeight(ALTO);
                    paquete1.setMaxWidth(ANCHO);
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
                if(paquete2.getVisibility() == View.VISIBLE){
                    paquete2.setVisibility(View.INVISIBLE);
                    paquete2.setEnabled(false);
                    paquete2.setMaxHeight(0);
                    paquete2.setMaxWidth(0);
                }
                if(paquete5.getVisibility() == View.VISIBLE){
                    paquete5.setVisibility(View.INVISIBLE);
                    paquete5.setEnabled(false);
                    paquete5.setMaxHeight(0);
                    paquete5.setMaxWidth(0);
                }
                break;
            case 2:
                botonDificultad.setImageResource(R.drawable.cuidadomedio);
                indiceListaDificultad++;
                if(paquete5.getVisibility() == View.INVISIBLE){
                    paquete5.setVisibility(View.VISIBLE);
                    paquete5.setEnabled(true);
                    paquete5.setMaxHeight(ALTO);
                    paquete5.setMaxWidth(ANCHO);
                }
                if(paquete1.getVisibility() == View.VISIBLE){
                    paquete1.setVisibility(View.INVISIBLE);
                    paquete1.setEnabled(false);
                    paquete1.setMaxHeight(0);
                    paquete1.setMaxWidth(0);
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
                break;
            case 3:
                botonDificultad.setImageResource(R.drawable.cuidadodifil);
                indiceListaDificultad = 0;
                if(paquete2.getVisibility() == View.INVISIBLE){
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
                if(paquete5.getVisibility() == View.VISIBLE){
                    paquete5.setVisibility(View.INVISIBLE);
                    paquete5.setEnabled(false);
                    paquete5.setMaxHeight(0);
                    paquete5.setMaxWidth(0);
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
                break;
        }
    }

    public void cambiarColores(View view){
        ImageButton botonColores = (ImageButton)findViewById(R.id.paleta);

        ConstraintLayout navBar = (ConstraintLayout)findViewById(R.id.navBar);
        ConstraintLayout bottomBar = (ConstraintLayout)findViewById(R.id.bottombar);
        ImageView nombre1 = (ImageView)findViewById(R.id.nombreFlor1);
        ImageView nombre2 = (ImageView)findViewById(R.id.nombreFlor2);
        ImageView nombre3 = (ImageView)findViewById(R.id.nombreFlor3);
        ImageView nombre4 = (ImageView)findViewById(R.id.nombreFlor4);
        ImageView nombre5 = (ImageView)findViewById(R.id.nombreFlor5);
        ImageButton menu = (ImageButton)findViewById(R.id.botonMenu);
        ImageView titulo = (ImageView)findViewById(R.id.imagenNombreApp);
        ConstraintLayout fondo = (ConstraintLayout)findViewById(R.id.constraintLayoutScroll);

        switch (indiceListaPaleta){
            case 0:
                botonColores.setImageResource(R.drawable.rosas);
                indiceListaPaleta++;

                navBar.setBackgroundResource(R.drawable.navbar);

                nombre1.setBackgroundResource(R.drawable.nombre1);
                nombre2.setBackgroundResource(R.drawable.nombre2);
                nombre3.setBackgroundResource(R.drawable.nombre3);
                nombre4.setBackgroundResource(R.drawable.nombre4);
                nombre5.setBackgroundResource(R.drawable.nombre5);

                //menu.setImageResource(R.drawable.menu);
                titulo.setImageResource(R.drawable.titulo);

                fondo.setBackgroundColor(Color.parseColor("#FFFFFF"));

                break;
            case 1:
                botonColores.setImageResource(R.drawable.azules);
                indiceListaPaleta++;

                navBar.setBackgroundResource(R.drawable.navbarazu);

                nombre1.setImageResource(R.drawable.nombre1azu);
                nombre2.setImageResource(R.drawable.nombre2azu);
                nombre3.setImageResource(R.drawable.nombre3azu);
                nombre4.setImageResource(R.drawable.nombre4azu);
                nombre5.setImageResource(R.drawable.nombre5azu);

                //menu.setImageResource(R.drawable.menuazu);
                titulo.setImageResource(R.drawable.tituloazu);

                fondo.setBackgroundColor(Color.parseColor("#FFFFFF"));

                break;
            case 2:
                botonColores.setImageResource(R.drawable.verdes);
                indiceListaPaleta++;

                navBar.setBackgroundResource(R.drawable.navbarver);

                nombre1.setImageResource(R.drawable.nombre1ver);
                nombre2.setImageResource(R.drawable.nombre2ver);
                nombre3.setImageResource(R.drawable.nombre3ver);
                nombre4.setImageResource(R.drawable.nombre4ver);
                nombre5.setImageResource(R.drawable.nombre5ver);

                //menu.setImageResource(R.drawable.menuver);
                titulo.setImageResource(R.drawable.titulover);

                fondo.setBackgroundColor(Color.parseColor("#FFFFFF"));

                break;
            case 3:
                botonColores.setImageResource(R.drawable.amarillos);
                indiceListaPaleta++;

                navBar.setBackgroundResource(R.drawable.navbarosc);

                nombre1.setImageResource(R.drawable.nombre1ama);
                nombre2.setImageResource(R.drawable.nombre2ama);
                nombre3.setImageResource(R.drawable.nombre3ama);
                nombre4.setImageResource(R.drawable.nombre4ama);
                nombre5.setImageResource(R.drawable.nombre5ama);

                //menu.setImageResource(R.drawable.menuama);
                titulo.setImageResource(R.drawable.tituloama);

                fondo.setBackgroundColor(Color.parseColor("#424242"));

                break;
            case 4:
                botonColores.setImageResource(R.drawable.oscuros);
                indiceListaPaleta = 0;

                navBar.setBackgroundResource(R.drawable.navbarosc);

                nombre1.setImageResource(R.drawable.nombre1osc);
                nombre2.setImageResource(R.drawable.nombre2osc);
                nombre3.setImageResource(R.drawable.nombre3osc);
                nombre4.setImageResource(R.drawable.nombre4osc);
                nombre5.setImageResource(R.drawable.nombre5osc);

                //menu.setImageResource(R.drawable.menuosc);
                titulo.setImageResource(R.drawable.tituloosc);

                fondo.setBackgroundColor(Color.parseColor("#424242"));

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

        Intent intent = new Intent(this,FlowerActivity1.class);
        intent.putExtra("palette",this.indiceListaPaleta);
        startActivity(intent);
        finish();
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
