package com.innovationnation.potshub;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class BlogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getActionBar() != null) {
            android.app.ActionBar a = getActionBar();
            a.setTitle("Social");
            a.setDisplayHomeAsUpEnabled(true);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Social");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            finish();
        }
        return true;
    }
}
