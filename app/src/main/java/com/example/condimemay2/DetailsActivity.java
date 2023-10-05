package com.example.condimemay2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        DatabseHelper dbHelper = new DatabseHelper(getApplicationContext());
        String details = dbHelper.getDetails();
        TextView detailsText = (TextView) findViewById(R.id.detailsText);
        detailsText.setText(details);
    }
}