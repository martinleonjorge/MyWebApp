package com.example.mywebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=(WebView)findViewById(R.id.WebView);
        webView.loadUrl("https://www.semana.com/");
        webView.setWebViewClient(new WebViewClient(){
            public boolean shoulOverrideUrlLoading(WebView view, String url){
                return false;
            }
        });
    }
}
