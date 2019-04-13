package com.example.umasurakod.listoflist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewWebView extends AppCompatActivity {

    WebView  mywebView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        mywebView = (WebView)findViewById(R.id.web);

        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("Types");
        if(bundle != null){
            switch (data){
                case "Rosa Peace":
                    url = "https://en.wikipedia.org/wiki/Rosa_Peace";
                    break;
                case "Beach Rose":
                    url = "https://en.wikipedia.org/wiki/Rosa_rugosa";
                    break;
                case "Damask Rose":
                    url = "https://en.wikipedia.org/wiki/Rosa_%C3%97_damascena";
                    break;
                case "American Lotus":
                    url = "https://en.wikipedia.org/wiki/Nelumbo_lutea";
                    break;
                case "Angel Wings":
                    url = "https://en.wikipedia.org/wiki/Angel_wings";
                    break;
                case "Blue Star Lotus":
                    url = "https://en.wikipedia.org/wiki/Nymphaea_nouchali";
                    break;
                case "Easter Lily":
                    url = "https://en.wikipedia.org/wiki/Easter_Lily_(badge)";
                    break;
                case "Tiger Lily":
                    url = "https://en.wikipedia.org/wiki/Lilium_lancifolium";
                    break;
                case "Orange Lily":
                    url = "https://en.wikipedia.org/wiki/Lilium_bulbiferum";
                    break;
            }
            mywebView.getSettings().setJavaScriptEnabled(true);
            mywebView.loadUrl(url);
            mywebView.setWebViewClient(new WebViewClient());
        }

    }
}
