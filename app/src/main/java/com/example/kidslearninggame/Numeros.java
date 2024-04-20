package com.example.kidslearninggame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Numeros extends AppCompatActivity implements View.OnClickListener {

    ImageView juno, jdos, jtres, jcuatro, jcinco, jseis, jsiete, jocho, jnueve, jdiez;

    Button salir_de_numerosj;

    private MediaPlayer

    au_uno, au_dos, au_tres, au_cuatro, au_cinco, au_seis, au_siete, au_ocho, au_nueve, au_diez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        au_uno = MediaPlayer.create(Numeros.this,R.raw.uno);
        au_dos = MediaPlayer.create(Numeros.this,R.raw.dos);
        au_tres = MediaPlayer.create(Numeros.this,R.raw.tres);
        au_cuatro = MediaPlayer.create(Numeros.this,R.raw.cuatro);
        au_cinco = MediaPlayer.create(Numeros.this,R.raw.cinco);
        au_seis = MediaPlayer.create(Numeros.this,R.raw.seis);
        au_siete = MediaPlayer.create(Numeros.this,R.raw.siete);
        au_ocho = MediaPlayer.create(Numeros.this,R.raw.ocho);
        au_nueve = MediaPlayer.create(Numeros.this,R.raw.nueve);
        au_diez = MediaPlayer.create(Numeros.this,R.raw.diez);

        juno = (ImageView) findViewById(R.id.Uno);
        juno.setOnClickListener(this);

        jdos = (ImageView) findViewById(R.id.Dos);
        jdos.setOnClickListener(this);

        jtres = (ImageView) findViewById(R.id.Tres);
        jtres.setOnClickListener(this);

        jcuatro = (ImageView) findViewById(R.id.Cuatro);
        jcuatro.setOnClickListener(this);

        jcinco = (ImageView) findViewById(R.id.Cinco);
        jcinco.setOnClickListener(this);

        jseis = (ImageView) findViewById(R.id.Seis);
        jseis.setOnClickListener(this);

        jsiete = (ImageView) findViewById(R.id.Siete);
        jsiete.setOnClickListener(this);

        jocho = (ImageView) findViewById(R.id.Ocho);
        jocho.setOnClickListener(this);

        jnueve = (ImageView) findViewById(R.id.Nueve);
        jnueve.setOnClickListener(this);

        jdiez = (ImageView) findViewById(R.id.Diez);
        jdiez.setOnClickListener(this);

        salir_de_numerosj = (Button)  findViewById(R.id.botonRegresarNumeros);
        salir_de_numerosj.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.Uno) {
            au_uno.start();
        }
        if (view.getId() == R.id.Dos){
            au_dos.start();
        }
        if (view.getId() == R.id.Tres){
            au_tres.start();
        }
        if (view.getId() == R.id.Cuatro){
            au_cuatro.start();
        }
        if (view.getId() == R.id.Cinco){
            au_cinco.start();
        }
        if (view.getId() == R.id.Seis){
            au_seis.start();
        }
        if (view.getId() == R.id.Siete){
            au_siete.start();
        }
        if (view.getId() == R.id.Ocho){
            au_ocho.start();
        }
        if (view.getId() == R.id.Nueve){
            au_nueve.start();
        }
        if (view.getId() == R.id.Diez){
            au_diez.start();
        }
        if (view.getId() == R.id.botonRegresarNumeros) {
            Intent intent = new Intent(Numeros.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}