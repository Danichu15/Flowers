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
    private boolean liked;

    protected void onCreate(Bundle savedInstanceState) {
        liked = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flower1);
        getSupportActionBar().hide();
        setTexts("Margarita",
                "Fácilmente las margaritas podrían ser elegidas como las flores más hermosas del mundo y a nadie le sorprendería. Y es que estas flores tienen un encanto casi sobrenatural, que hace que hace que cualquier persona que contemple la margarita se sienta cautivado al instante.",
                "Fácil",
                "Centro-Europa",
                "<2km");

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
