package com.example.kidslearninggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ImageView;

public class Animales extends AppCompatActivity implements View.OnClickListener{

    ImageView jcerdo, jgallina, jperro, jvaca, jtigre, joveja, jgato, jloro, jcaballo, jconejo, jgallo, jburro ;

    Button salir_de_animalesj;

    private MediaPlayer
    au_cerdo, au_gallina, au_perro, au_vaca, au_tigre, au_oveja, au_gato, au_loro, au_caballo, au_conejo, au_gallo, au_burro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);

        au_cerdo = MediaPlayer.create(Animales.this,R.raw.cerdo);
        au_gallina = MediaPlayer.create(Animales.this,R.raw.gallina);
        au_perro = MediaPlayer.create(Animales.this,R.raw.perro);
        au_vaca = MediaPlayer.create(Animales.this,R.raw.vaca);
        au_tigre = MediaPlayer.create(Animales.this,R.raw.tigre);
        au_oveja = MediaPlayer.create(Animales.this,R.raw.oveja);
        au_gato = MediaPlayer.create(Animales.this,R.raw.gato);
        au_loro = MediaPlayer.create(Animales.this,R.raw.loro);
        au_caballo = MediaPlayer.create(Animales.this,R.raw.caballo);
        au_conejo = MediaPlayer.create(Animales.this,R.raw.conejo);
        au_gallo = MediaPlayer.create(Animales.this,R.raw.gallo);
        au_burro = MediaPlayer.create(Animales.this,R.raw.burro);


        jcerdo = (ImageView) findViewById(R.id.Cerdo);
        jcerdo.setOnClickListener(this);

        jgallina = (ImageView) findViewById(R.id.Gallina);
        jgallina.setOnClickListener(this);

        jperro = (ImageView) findViewById(R.id.Perro);
        jperro.setOnClickListener(this);

        jvaca = (ImageView) findViewById(R.id.Vaca);
        jvaca.setOnClickListener(this);

        jtigre = (ImageView) findViewById(R.id.Tigre);
        jtigre.setOnClickListener(this);

        joveja = (ImageView) findViewById(R.id.Oveja);
        joveja.setOnClickListener(this);

        jgato = (ImageView) findViewById(R.id.Gato);
        jgato.setOnClickListener(this);

        jloro = (ImageView) findViewById(R.id.Loro);
        jloro.setOnClickListener(this);

        jcaballo = (ImageView) findViewById(R.id.Caballo);
        jcaballo.setOnClickListener(this);

        jconejo = (ImageView) findViewById(R.id.Conejo);
        jconejo.setOnClickListener(this);

        jgallo = (ImageView) findViewById(R.id.Gallo);
        jgallo.setOnClickListener(this);

        jburro = (ImageView) findViewById(R.id.Burro);
        jburro.setOnClickListener(this);

        salir_de_animalesj = (Button)  findViewById(R.id.Regresar);
        salir_de_animalesj.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

            if (view.getId() == R.id.Cerdo) {
                au_cerdo.start();
            }
            if (view.getId() == R.id.Gallina){
                au_gallina.start();
            }
            if (view.getId() == R.id.Perro){
                au_perro.start();
            }
            if (view.getId() == R.id.Vaca){
                au_vaca.start();
            }
            if (view.getId() == R.id.Tigre){
                au_tigre.start();
            }
            if (view.getId() == R.id.Oveja){
                au_oveja.start();
            }
            if (view.getId() == R.id.Gato){
                au_gato.start();
            }
            if (view.getId() == R.id.Loro){
                au_loro.start();
            }
            if (view.getId() == R.id.Caballo){
                au_caballo.start();
            }
            if (view.getId() == R.id.Conejo){
                au_conejo.start();
            }
            if (view.getId() == R.id.Gallo){
                au_gallo.start();
            }
            if (view.getId() == R.id.Burro){
                au_burro.start();
            }
            if (view.getId() == R.id.Regresar){
                Intent intent = new Intent(Animales.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
    }
}




