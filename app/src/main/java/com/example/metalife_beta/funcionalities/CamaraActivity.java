package com.example.metalife_beta.funcionalities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.metalife_beta.R;

public class CamaraActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_camara);

        button = findViewById(R.id.button101);
        button2 = findViewById(R.id.button102);
        button3 = findViewById(R.id.button103);
        button4 = findViewById(R.id.button104);

        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://clubroboticachurriana.com/"));
                startActivity(i);
            }

        });

        button2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("https://es.pornhub.com/"));
                startActivity(a);
            }

        });

        button3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent b = new Intent(Intent.ACTION_VIEW);
                b.setData(Uri.parse("https://www.instagram.com/clubroboticachurriana/"));
                startActivity(b);
            }

        });

        button4.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent c = new Intent(Intent.ACTION_VIEW);
                c.setData(Uri.parse("https://www.youtube.com/watch?v=rS3At0HY1x4"));
                startActivity(c);
            }
        });
    }
}