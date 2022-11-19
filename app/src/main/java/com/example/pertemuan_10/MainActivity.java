package com.example.pertemuan_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Samsung Galaxy Fold 4");
        }

        Button btnCall = findViewById(R.id.call_cs);
        btnCall.setOnClickListener(this);

        Button btnBeli = findViewById(R.id.beli);
        btnBeli.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.call_cs:
                String phoneNumber = "081310476325";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.beli:
                Intent beliIntent = new Intent(MainActivity.this, BeliActivity.class);
                startActivity(beliIntent);
                break;
        }
    }
}