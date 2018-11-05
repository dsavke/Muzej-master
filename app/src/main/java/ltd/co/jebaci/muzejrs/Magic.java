package ltd.co.jebaci.muzejrs;


import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Magic {
    private WebView web;

    Magic(WebView web) {
        this.web = web;
    }

    public void work(final int qr) {

        web.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {

                switch (qr) {
                    case 0:
                        view.loadUrl("javascript: change();");
                        break;
                    case 1:
                        view.loadUrl("javascript: change2();");
                        break;
                    case 2:
                        view.loadUrl("javascript: change3();");
                        break;
                    case 3:
                        view.loadUrl("javascript: change4();");
                        break;
                    case 4:
                        view.loadUrl("javascript: change5();");
                        break;
                    case 5:
                        view.loadUrl("javascript: change6();");
                        break;
                    case 6:
                        view.loadUrl("javascript: change7();");
                        break;
                    case 7:
                        view.loadUrl("javascript: change8();");
                        break;
                    case 8:
                        view.loadUrl("javascript: change9();");
                        break;
                    case 9:
                        view.loadUrl("javascript: change10();");
                        break;
                    case 10:
                        view.loadUrl("javascript: change11();");
                        break;
                    case 11:
                        view.loadUrl("javascript: change12();");
                        break;
                    case 12:
                        view.loadUrl("javascript: change13();");
                        break;
                }

            }
        });
        //web.loadUrl("file:///android_asset/mapa.html");
    }

}
