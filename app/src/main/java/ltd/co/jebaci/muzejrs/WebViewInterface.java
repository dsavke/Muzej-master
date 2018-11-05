package ltd.co.jebaci.muzejrs;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebViewInterface {

    Context mContext;
    public static Language language = new Language();

    WebViewInterface(Context mContext) {
        this.mContext = mContext;
    }


    @JavascriptInterface
    public void performAction() {

        //Toast.makeText(mContext, "Radi srpski", Toast.LENGTH_SHORT).show();
        language.setSrpski(true);
        Intent intent = new Intent(mContext, Main2Activity.class);
        mContext.startActivity(intent);

    }

    @JavascriptInterface
    public void performAction1() {

        language.setSrpski(false);
        //Toast.makeText(mContext, "Radi engleski", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(mContext, Main2Activity.class);
        mContext.startActivity(intent);

    }


    @JavascriptInterface
    public void qrCodeStart() {

        //Toast.makeText(mContext, "Radi QRcode", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(mContext, Main3Activity.class);
        mContext.startActivity(intent);

    }

    @JavascriptInterface
    public void mapStart() {

        //Toast.makeText(mContext, "Radi MAP", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(mContext, Main5Activity.class);
        mContext.startActivity(intent);

    }

}
