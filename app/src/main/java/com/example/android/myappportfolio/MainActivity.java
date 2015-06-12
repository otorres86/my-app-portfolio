package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    // Method that gets triggered when one of the app buttons gets clicked;
    // displays a message with the app name that will be launched
    public void DisplayProjectName(View button){
        int buttonId = button.getId();
        Context context = getApplicationContext();
        CharSequence message = " ";
        int duration = Toast.LENGTH_SHORT;

        switch(buttonId){
            case R.id.spotify_streamer_button:
                message = getString(R.string.spotify_streamer_message);
                break;
            case R.id.scores_app_button:
                message = getString(R.string.scores_app_message);
                break;
            case R.id.library_app_button:
                message = getString(R.string.library_app_message);
                break;
            case R.id.build_it_bigger_button:
                message = getString(R.string.build_it_bigger_message);
                break;
            case R.id.xyz_reader_button:
                message = getString(R.string.xyz_reader_message);
                break;
            case R.id.capstone_button:
                message = getString(R.string.capstone_message);
                break;
            default:
                break;
        }

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
