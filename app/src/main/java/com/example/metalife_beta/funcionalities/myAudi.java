package com.example.metalife_beta.funcionalities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.metalife_beta.R;

public class myAudi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activities);

        // Método para abrir Salud Responde
        open_myAudi();
    }

    private void open_myAudi() {
        PackageManager pm = getPackageManager();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("de.myaudi.mobile.assistant", "de.myaudi.mobile.assistant.HomeActivity");

        // Verificar si la aplicación está instalada
        if (isAppInstalled("de.myaudi.mobile.assistant")) {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, "No se pudo abrir la aplicación myAudi", Toast.LENGTH_SHORT).show();
                // Redirigir al usuario a la Play Store
                openPlayStore();
            }
        } else {
            Toast.makeText(this, "La aplicación myAudi no está instalada, redirigiendo a la Play Store...", Toast.LENGTH_SHORT).show();
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
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=de.myaudi.mobile.assistant")));
        } catch (ActivityNotFoundException e) {
            // Si la aplicación de Play Store no está disponible, abrir el navegador
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=de.myaudi.mobile.assistant")));
        }
    }
}