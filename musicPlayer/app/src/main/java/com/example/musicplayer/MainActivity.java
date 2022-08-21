package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    boolean playing = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = (Button) findViewById(R.id.button_play);
        Button pause = (Button) findViewById(R.id.button_pause);
        Button stop = (Button) findViewById(R.id.button_stop);
        final MediaPlayer
                mp=MediaPlayer.create(getBaseContext(),R.raw.music);

        //for playng button
        play.setOnClickListener(new View.OnClickListener(){
                                            @Override
                                            public void onClick(View v){
                                                if(!playing){
                                                    mp.start();
                                                    playing=true;

                                                    ProgressDialog pds = new
                                                            ProgressDialog(MainActivity.this);
                                                    pds.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                                                    pds.setMessage("Playing song");
                                                    pds.setIndeterminate(true);
                                                    pds.setCancelable(true);
                                                    pds.show();
                                                }
                                            }
                                        });
        //fro pause button
        pause.setOnClickListener(new
                                         View.OnClickListener(){
                                             @Override
                                             public void onClick(View v){
                                                 if(playing){
                                                     mp.pause();
                                                     playing=false;
                                                 }
                                             }
                                         });

        //for stop button
        stop.setOnClickListener(new
                                        View.OnClickListener(){
                                            @Override
                                            public void onClick(View v) {
                                                if (playing) {
                                                    mp.stop();
                                                    playing = false;
                                                }
                                            }
                                        });
    }
}