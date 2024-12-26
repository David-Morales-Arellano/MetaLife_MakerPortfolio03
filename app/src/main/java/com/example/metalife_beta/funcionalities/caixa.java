package com.example.metalife_beta.funcionalities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.metalife_beta.R;

public class caixa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caixa_layout);

        // Método para abrir IG
        openIG();
    }

    private void openIG() {

        Uri uri = Uri.parse("http://instagram.com/_u/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.instagram.android");

        startActivity(intent);

    }
}