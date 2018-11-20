package fr.diginamic.formation.super_quizz.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import fr.diginamic.formation.super_quizz.R;


public class ResultatActivity extends AppCompatActivity {


    private ImageButton imageButtonResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        imageButtonResult = findViewById(R.id.imagebutton_resultat);
        String resultat = getIntent().getStringExtra("succes");
        if (resultat.equals("1")) {
            imageButtonResult.setImageResource(R.drawable.ic_validation);
        } else{
            imageButtonResult.setImageResource(R.drawable.ic_croix);
        }

    }

    public void backToMenu(View view) {
        finish();
    }
}