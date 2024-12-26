package com.example.metalife_beta.funcionalities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.metalife_beta.R;

public class salud_responde extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activities);

        // Método para abrir Salud Responde
        openSaludResponde();
    }

    private void openSaludResponde() {
        PackageManager pm = getPackageManager();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("citamovil.saludresponde", "citamovil.saludresponde.HomeActivity");

        // Verificar si la aplicación está instalada
        if (isAppInstalled("citamovil.saludresponde")) {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, "No se pudo abrir la aplicación Salud Responde", Toast.LENGTH_SHORT).show();
                // Redirigir al usuario a la Play Store
                openPlayStore();
            }
        } else {
            Toast.makeText(this, "La aplicación Salud Responde no está instalada, redirigiendo a la Play Store...", Toast.LENGTH_SHORT).show();
            // Redirigir al usuario a la Play Store
            openPlayStore();
        }
    }

    private boolean isAppInstalled(String packageName) {
        PackageManager pm = getPackageManager();
        try {
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private void openPlayStore() {
        try {
            // Intenta abrir la aplicación de Play Store
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=citamovil.saludresponde")));
        } catch (ActivityNotFoundException e) {
            // Si la aplicación de Play Store no está disponible, abrir el navegador
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=citamovil.saludresponde")));
        }
    }
}