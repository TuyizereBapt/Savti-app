package com.bapt.savti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSearch=(Button)findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//            Intent i=new Intent(this, ResultsActivity.class);
//            i.putExtra(DetailsActivity.EXTRA_COUNTRY, c);
            startActivity(new Intent(this, ResultsActivity.class));
    }
}
