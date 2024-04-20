package com.example.kidslearninggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button aceptarj;
    RadioButton coloresj, animalesj, numerosj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numerosj =(RadioButton) findViewById(R.id.Numeros);
        coloresj =(RadioButton) findViewById(R.id.Colores);
        animalesj =(RadioButton) findViewById(R.id.Animales);

        aceptarj =(Button) findViewById(R.id.Aceptar); aceptarj.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (numerosj.isChecked()){
            Intent otro_formulario = new Intent(MainActivity.this, Numeros.class);
            startActivity(otro_formulario);
        }

        if (coloresj.isChecked()){
            Intent otro_formulario = new Intent(MainActivity.this, Colores.class);
            startActivity(otro_formulario);
        }
        if (animalesj.isChecked()){
            Intent otro_formulario = new Intent(MainActivity.this, Animales.class);
            startActivity(otro_formulario);
        }
    }
}