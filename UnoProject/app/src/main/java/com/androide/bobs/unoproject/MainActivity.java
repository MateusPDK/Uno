package com.androide.bobs.unoproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import objects.Jogo;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay;
    private Button btnQuit;

    ArrayList<Integer> songs = new ArrayList<>();

    MediaPlayer soundtrack = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = findViewById(R.id.btnPlay);
        btnQuit = findViewById(R.id.btnQuit);

        songs.add(R.raw.megaman);

        // criar metodo random que escolhe a musica de fundo

        soundtrack.stop();
        soundtrack = MediaPlayer.create(MainActivity.this, songs.get(0));
        soundtrack.start();
        soundtrack.setLooping(true);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GameActivity.class));
                Toast t = Toast.makeText(getApplicationContext(), "Start Game", Toast.LENGTH_LONG);
                t.show();
            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        new Jogo();
    }


}
