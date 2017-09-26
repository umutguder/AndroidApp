package com.ses.bilumumum.bilumumum;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.maroon);

        Button buttonSound = (Button) findViewById(R.id.buttonSound);

        buttonSound.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }

}
