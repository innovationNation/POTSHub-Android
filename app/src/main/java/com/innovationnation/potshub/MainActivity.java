package com.innovationnation.potshub;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SharedPreferences.OnSharedPreferenceChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button trackButton = (Button) findViewById(R.id.track_button);
        //final Button forumButton = (Button) findViewById(R.id.forum_button);
        final Button blogButton = (Button) findViewById(R.id.blog_button);
        trackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              /*
              Intent i =new Intent(this, TrackActivity.class);
            startActivity(i);
               */
            }
        });
        //forumButton.setOnClickListener(new View.OnClickListener() {
            //public void onClick(View v) {
              /*
              Intent i =new Intent(this, ForumActivity.class);
            startActivity(i);
               */
            //}
        //});
        blogButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openBlogsPage(v);
            }
        });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        updateTextFields();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        prefs.registerOnSharedPreferenceChangeListener(this);
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
            Intent i = new Intent(this, PrefActivity.class);
            startActivity(i);
            return true;
        }
        updateTextFields();
        return super.onOptionsItemSelected(item);
    }

    public boolean updateTextFields() {
        try {
            TextView view = (TextView) findViewById(R.id.text_welcome);
            StringBuilder b = new StringBuilder();
            b.append("Welcome, ");
            SharedPreferences p = PreferenceManager.getDefaultSharedPreferences(this);

            b.append(p.getString("username", "NULL"));
            view.setText(b.toString());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences prefs, String key) {
        updateTextFields();
    }

    public void openBlogsPage(View view){
        Intent i = new Intent(this, BlogActivity.class);
        startActivity(i);
    }
}
