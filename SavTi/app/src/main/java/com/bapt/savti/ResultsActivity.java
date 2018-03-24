package com.bapt.savti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        // Instantiate the RequestQueue.
//        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="http://www.google.com";
    }
}
