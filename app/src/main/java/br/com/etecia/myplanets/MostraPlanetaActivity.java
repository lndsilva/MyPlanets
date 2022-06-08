package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MostraPlanetaActivity extends AppCompatActivity {
    ImageView imgMostraPlaneta;
    TextView txtMostraPlaneta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostra_planeta_layout);

        imgMostraPlaneta = findViewById(R.id.imgMostraPlaneta);
        txtMostraPlaneta = findViewById(R.id.txtMostraPlaneta);

        Intent intent = getIntent();

        String nomePlaneta = intent.getStringExtra("nomePlaneta");
        int imagemPlaneta = intent.getIntExtra("imagemPlaneta",0);

        txtMostraPlaneta.setText(nomePlaneta);
        imgMostraPlaneta.setImageResource(imagemPlaneta);


    }
}