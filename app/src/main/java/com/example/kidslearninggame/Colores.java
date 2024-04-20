package com.example.kidslearninggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Colores extends AppCompatActivity implements View.OnClickListener{

    ImageView jnegro, jblanco, jgris, jrosado, jamarillo, jnaranja, jrojo, jmarron, jazul, jverde, jpurpura;

    Button salir_de_coloresj;

    private MediaPlayer

    au_negro, au_blanco, au_gris, au_rosado, au_amarillo, au_naranja, au_rojo, au_marron, au_azul, au_verde, au_purpura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);

        au_negro = MediaPlayer.create(Colores.this,R.raw.negro);
        au_blanco = MediaPlayer.create(Colores.this,R.raw.blanco);
        au_gris = MediaPlayer.create(Colores.this,R.raw.gris);
        au_rosado = MediaPlayer.create(Colores.this,R.raw.rosado);
        au_amarillo = MediaPlayer.create(Colores.this,R.raw.amarillo);
        au_naranja = MediaPlayer.create(Colores.this,R.raw.naranja);
        au_rojo = MediaPlayer.create(Colores.this,R.raw.rojo);
        au_marron = MediaPlayer.create(Colores.this,R.raw.marron);
        au_azul = MediaPlayer.create(Colores.this,R.raw.azul);
        au_verde = MediaPlayer.create(Colores.this,R.raw.verde);
        au_purpura = MediaPlayer.create(Colores.this,R.raw.morado);

        jnegro = (ImageView) findViewById(R.id.Negro);
        jnegro.setOnClickListener(this);

        jblanco = (ImageView) findViewById(R.id.Blanco);
        jblanco.setOnClickListener(this);

        jgris = (ImageView) findViewById(R.id.Gris);
        jgris.setOnClickListener(this);

        jrosado = (ImageView) findViewById(R.id.Rosado);
        jrosado.setOnClickListener(this);

        jamarillo = (ImageView) findViewById(R.id.Amarillo);
        jamarillo.setOnClickListener(this);

        jnaranja = (ImageView) findViewById(R.id.Naranja);
        jnaranja.setOnClickListener(this);

        jrojo = (ImageView) findViewById(R.id.Rojo);
        jrojo.setOnClickListener(this);

        jmarron = (ImageView) findViewById(R.id.Marron);
        jmarron.setOnClickListener(this);

        jazul = (ImageView) findViewById(R.id.Azul);
        jazul.setOnClickListener(this);

        jverde = (ImageView) findViewById(R.id.Verde);
        jverde.setOnClickListener(this);

        jpurpura = (ImageView) findViewById(R.id.Purpura);
        jpurpura.setOnClickListener(this);

        salir_de_coloresj = (Button)  findViewById(R.id.botonRegresarColores);
        salir_de_coloresj.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.Negro){
            au_negro.start();
        }
        if (view.getId() == R.id.Blanco){
            au_blanco.start();
        }
        if (view.getId() == R.id.Gris){
            au_gris.start();
        }
        if (view.getId() == R.id.Rosado){
            au_rosado.start();
        }
        if (view.getId() == R.id.Amarillo){
            au_amarillo.start();
        }
        if (view.getId() == R.id.Naranja){
            au_naranja.start();
        }
        if (view.getId() == R.id.Rojo){
            au_rojo.start();
        }
        if (view.getId() == R.id.Marron){
            au_marron.start();
        }
        if (view.getId() == R.id.Azul){
            au_azul.start();
        }
        if (view.getId() == R.id.Verde){
            au_verde.start();
        }
        if (view.getId() == R.id.Purpura){
            au_purpura.start();
        }
        if (view.getId() == R.id.botonRegresarColores) {
            Intent intent = new Intent(Colores.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

    }
}