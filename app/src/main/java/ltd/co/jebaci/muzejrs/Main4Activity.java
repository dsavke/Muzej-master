package ltd.co.jebaci.muzejrs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    private WebView web;
    public static Mapa mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //Intent intent = getIntent();


        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();


        mapa = new Mapa();
        Bundle extras = getIntent().getExtras();
        //WebViewInterface wi = new WebViewInterface(this);
        web = findViewById(R.id.webview);
        web.setWebViewClient(new WebViewClient());

        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.getSettings().setDomStorageEnabled(true);
        web.addJavascriptInterface(new WebViewInterface(this), "Android");

        if (extras != null) {
            String value = extras.getString("key");
            switch (value){
                case "1":
                    if(WebViewInterface.language.isSrpski())
                    web.loadUrl("file:///android_asset/straniceSrb/qr1.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr1.html");

                    editor.putBoolean("polje1", true);


                    mapa.polje1 = 1;
                    mapa.obiljeziPolje(0);

                    break;
                case "2":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr2.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr2.html");


                    editor.putBoolean("polje2", true);

                    mapa.obiljeziPolje(1);

                    break;
                case "3":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr3.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr3.html");

                    editor.putBoolean("polje3", true);
                    mapa.obiljeziPolje(2);

                    break;
                case "4":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr4.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr4.html");

                    editor.putBoolean("polje4", true);

                    mapa.obiljeziPolje(3);

                    break;
                case "5":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr5.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr5.html");

                    editor.putBoolean("polje5", true);

                    mapa.obiljeziPolje(4);

                    break;
                case "6":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr6.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr6.html");

                    editor.putBoolean("polje6", true);

                    mapa.obiljeziPolje(5);

                    break;
                case "7":
                    if(WebViewInterface.language.isSrpski()) {
                        web.loadUrl("file:///android_asset/straniceSrb/qr7.html");
                    }
                    else web.loadUrl("file:///android_asset/straniceEng/qr7.html");
                    editor.putBoolean("polje7", true);
                    mapa.obiljeziPolje(6);

                    break;
                case "8":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr8.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr8.html");
                    editor.putBoolean("polje8", true);
                    mapa.obiljeziPolje(7);

                    break;
                case "9":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr9.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr9.html");
                    editor.putBoolean("polje9", true);
                    mapa.obiljeziPolje(8);

                    break;
                case "10":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr10.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr10.html");
                    editor.putBoolean("polje10", true);
                    mapa.obiljeziPolje(9);

                    break;
                case "11":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr11.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr11.html");
                    editor.putBoolean("polje11", true);
                    mapa.obiljeziPolje(10);

                    break;
                case "12":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr12.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr12.html");
                    editor.putBoolean("polje12", true);
                    mapa.obiljeziPolje(11);

                    break;
                case "13":
                    if(WebViewInterface.language.isSrpski())
                        web.loadUrl("file:///android_asset/straniceSrb/qr13.html");
                    else web.loadUrl("file:///android_asset/straniceEng/qr13.html");
                    editor.putBoolean("polje13", true);
                    mapa.obiljeziPolje(12);

                    break;
            }
            editor.commit();
        }

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
