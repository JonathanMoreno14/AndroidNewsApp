package com.example.jonathanmoreno.newsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class DetailsActivity extends AppCompatActivity {

    WebView webView;
    ProgressBar progressBarLoader;
    String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        progressBarLoader = (ProgressBar) findViewById(R.id.progressBar2);
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl(url);


        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if (progress == 100) {
                    progressBarLoader.setVisibility(View.GONE);
                } else {
                    progressBarLoader.setVisibility(View.VISIBLE);
                }
            }
        });



    }
}
