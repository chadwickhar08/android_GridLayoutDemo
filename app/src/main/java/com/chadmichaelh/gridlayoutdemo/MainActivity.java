package com.chadmichaelh.gridlayoutdemo;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void onClick(View view)
    {
        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.chadmichaelh.gridlayoutdemo");

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);

        mplayer.start();

        Log.i("button tapped", Integer.toString(resourceId));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
