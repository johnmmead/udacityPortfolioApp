package com.example.jmead.portfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    Button spotifyButton;
    Button scoresButton;
    Button libraryButton;
    Button buildButton;
    Button xyzButton;
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyButton = (Button) findViewById(R.id.spotifyButton);
        scoresButton = (Button) findViewById(R.id.scoresButton);
        libraryButton = (Button) findViewById(R.id.libraryButton);
        buildButton = (Button) findViewById(R.id.buildButton);
        xyzButton = (Button) findViewById(R.id.xyzButton);
        capstoneButton = (Button) findViewById(R.id.capstoneButton);
        spotifyButton.setOnClickListener(clickHandler);
        scoresButton.setOnClickListener(clickHandler);
        libraryButton.setOnClickListener(clickHandler);
        buildButton.setOnClickListener(clickHandler);
        xyzButton.setOnClickListener(clickHandler);
        capstoneButton.setOnClickListener(clickHandler);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private String buildTitleWithAppName(String appName){
        StringBuilder builder = new StringBuilder();
        builder.append("Launching the " );
        builder.append(appName);
        builder.append(" app");
        return builder.toString();
    }

    View.OnClickListener clickHandler = new View.OnClickListener() {
        public void onClick(View v) {
            v.playSoundEffect(SoundEffectConstants.CLICK);
            switch(v.getId()) {
                case R.id.spotifyButton:
                    // it was the first button
                    Toast.makeText(getApplicationContext(), buildTitleWithAppName("Spotify"),
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.scoresButton:
                    // it was the second button
                    Toast.makeText(getApplicationContext(), buildTitleWithAppName("Scores"),
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.libraryButton:
                    Toast.makeText(getApplicationContext(), buildTitleWithAppName("Library"),
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.buildButton:
                    // it was the second button
                    Toast.makeText(getApplicationContext(), buildTitleWithAppName("Build it Bigger"),
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.xyzButton:
                    // it was the second button
                    Toast.makeText(getApplicationContext(), buildTitleWithAppName("XYZ Reader"),
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.capstoneButton:
                    // it was the second button
                    Toast.makeText(getApplicationContext(), buildTitleWithAppName("Capstone"),
                            Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

}
