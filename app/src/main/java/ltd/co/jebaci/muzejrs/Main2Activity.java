package ltd.co.jebaci.muzejrs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        web = findViewById(R.id.webview);
        web.setWebViewClient(new WebViewClient());

        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.getSettings().setDomStorageEnabled(true);
        web.addJavascriptInterface(new WebViewInterface(this), "Android");
        web.loadUrl("file:///android_asset/index.html");

    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack())
        {
            web.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

}
