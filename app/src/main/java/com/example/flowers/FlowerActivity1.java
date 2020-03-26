package com.example.flowers;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FlowerActivity1 extends AppCompatActivity {
    ColorPalette palette;

    private boolean liked;

    private int selectedPalette;

    protected void onCreate(Bundle savedInstanceState) {
        liked = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flower1);
        getSupportActionBar().hide();
        setTexts("Margarita",
                "Planta herbácea perenne, con hojas obovado-espatuladas o dentada-redondeadas. Escapos sin hojas de hasta 20 cm de altura. Las flores son blancas, a veces teñidas de púrpura; los flósculos, amarillos.\n" +
                        "Florece y fructifica de octubre a junio.",
                "Fácil",
                "Centro-Europa",
                "<2km");
        selectedPalette = getIntent().getIntExtra("palette",1);
        setColor(selectedPalette);

    }
    private void setColor(int palette){
        int selectedColor = this.palette.getParsedColor(palette);

        TextView auxView = findViewById(R.id.dataTitle);
        changeTextColor(auxView,selectedColor);

        auxView = findViewById(R.id.regionTitle);
        changeTextColor(auxView,selectedColor);

        auxView= findViewById(R.id.descriptionTitle);
        changeTextColor(auxView,selectedColor);

        auxView = findViewById(R.id.name);
        changeTextColor(auxView,selectedColor);

        auxView = findViewById(R.id.careTitle);
        changeTextColor(auxView,selectedColor);
    }

    private void changeTextColor(TextView view,int color){
        view.setTextColor(color);
    }

    private void setTexts(String name, String description,String difficulty,String region,String availability){
        TextView descriptionText = findViewById(R.id.description);
        TextView nameText = findViewById(R.id.name);
        TextView difficultyText = findViewById(R.id.difficulty);
        TextView availabilityText = findViewById(R.id.available);
        TextView regionText = findViewById(R.id.region);

        nameText.setText(name);
        descriptionText.setText(description);
        difficultyText.setText(difficulty);
        regionText.setText(region);
        availabilityText.setText(availability);

    }

    public void toggleLike(View view) {
        liked = !liked;
        ImageButton likeButton = findViewById(R.id.likeButton);
        if (liked){
            likeButton.setImageResource(R.drawable.like);
        }else{
            likeButton.setImageResource(R.drawable.nolike);
        }
    }

    public void goMenu(View view) {
        finish();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
