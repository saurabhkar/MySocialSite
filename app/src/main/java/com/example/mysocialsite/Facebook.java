package com.example.mysocialsite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Facebook extends AppCompatActivity {

    private WebView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

    facebook = (WebView) findViewById(R.id.facebook_webview);

        WebSettings webSettings = facebook.getSettings();
        webSettings.setJavaScriptEnabled(true);

        facebook.loadUrl("https://www.quora.com/");
        facebook.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(facebook.canGoBack())
        {
            facebook.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
