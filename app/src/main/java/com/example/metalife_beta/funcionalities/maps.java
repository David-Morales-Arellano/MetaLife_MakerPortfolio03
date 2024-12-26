package com.example.metalife_beta.funcionalities;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.metalife_beta.R;


public class maps extends AppCompatActivity {

    private WebView myWebView;
    private WebSettings myWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_layout);

        myWebView = findViewById(R.id.web1);
        myWebSettings = myWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        myWebSettings.getDomStorageEnabled();
        myWebView.loadUrl("https://www.google.com/maps");
        myWebView.setWebViewClient(new WebViewClient());

    }
}