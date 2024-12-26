package com.example.metalife_beta.funcionalities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.metalife_beta.R;

public class mensajeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensajeria_layout);

        // Método para abrir WhatsApp
        openWhatsApp();
    }

    private void openWhatsApp() {

        PackageManager pm = getPackageManager();

            // Si está instalado, abrir el menú principal de WhatsApp
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setClassName("com.whatsapp", "com.whatsapp.HomeActivity");
            startActivity(intent);

    }
}
