package com.codekul.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlaySng(View view) {

        //player = new MediaPlayer();

        player = MediaPlayer.create(this, R.raw.my);
        player.start();
    }

    public void onPauseSng(View view) {
        player.stop();
    }
}
