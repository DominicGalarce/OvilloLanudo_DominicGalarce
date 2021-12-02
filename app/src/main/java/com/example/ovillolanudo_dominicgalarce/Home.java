package com.example.ovillolanudo_dominicgalarce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Home extends AppCompatActivity {
    VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


     /*   videoview = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=QVSoDMeMRy0");
        videoview.setMediaController(new MediaController(this));
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();

    */

        VideoView videoView = findViewById(R.id.video_View);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.chayanne;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

    public void informacion(View view){
        Intent i = new Intent(getBaseContext(), Informacion.class);
        startActivity(i);
    }

    public void insumos(View view){
        Intent i = new Intent(getBaseContext(), Insumos.class);
        startActivity(i);
    }

    public void agendar(View view){
        Intent i = new Intent(getBaseContext(), Agendar.class);
        startActivity(i);
    }
}