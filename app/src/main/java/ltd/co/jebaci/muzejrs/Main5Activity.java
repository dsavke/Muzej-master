package ltd.co.jebaci.muzejrs;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main5Activity extends AppCompatActivity {

    private WebView web;
    private Magic magic;
    private Mapa mapa;

    @SuppressLint("SetJavaScriptEnabled")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        final boolean polje1 = pref.getBoolean("polje1", false);
        final boolean polje2 = pref.getBoolean("polje2", false);
        final boolean polje3 = pref.getBoolean("polje3", false);
        final boolean polje4 = pref.getBoolean("polje4", false);
        final boolean polje5 = pref.getBoolean("polje5", false);
        final boolean polje6 = pref.getBoolean("polje6", false);
        final boolean polje7 = pref.getBoolean("polje7", false);
        final boolean polje8 = pref.getBoolean("polje8", false);
        final boolean polje9 = pref.getBoolean("polje9", false);
        final boolean polje10 = pref.getBoolean("polje10", false);
        final boolean polje11 = pref.getBoolean("polje11", false);
        final boolean polje12 = pref.getBoolean("polje12", false);
        final boolean polje13 = pref.getBoolean("polje13", false);

        Intent intent = getIntent();

        web = findViewById(R.id.webview);
        web.setWebViewClient(new WebViewClient());

        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.getSettings().setDomStorageEnabled(true);
        web.addJavascriptInterface(new WebViewInterface(this), "Android");
        web.loadUrl("file:///android_asset/mapa.html");//treba ici za mapu

        web.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                //if(main4Activity.mapa.polja[0])
                //if(main4Activity.mapa.polje1 == 1)
                if (polje1) view.loadUrl("javascript: change();");
                if (polje2) view.loadUrl("javascript: change2();");
                if (polje3) view.loadUrl("javascript: change3();");
                if (polje4) view.loadUrl("javascript: change4();");
                if (polje5) view.loadUrl("javascript: change5();");
                if (polje6) view.loadUrl("javascript: change6();");
                if (polje7) view.loadUrl("javascript: change7();");
                if (polje8) view.loadUrl("javascript: change8();");
                if (polje9) view.loadUrl("javascript: change9();");
                if (polje10) view.loadUrl("javascript: change10();");
                if (polje11) view.loadUrl("javascript: change11();");
                if (polje12) view.loadUrl("javascript: change12();");
                if (polje13) view.loadUrl("javascript: change13();");


            }
        });
    }
}
