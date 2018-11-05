package ltd.co.jebaci.muzejrs;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static android.Manifest.permission.CAMERA;

public class Main3Activity extends AppCompatActivity implements ZXingScannerView.ResultHandler{

    private static final int REQUEST_CAMERA = 1;

    private ZXingScannerView scannerView;

    private static int camId = Camera.CameraInfo.CAMERA_FACING_BACK;

    private Mapa mapa;

    //private Main5Activity main5Activity = new Main5Activity();

    //private Magic magic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        scannerView = new ZXingScannerView(this);

        setContentView(scannerView);

        int currentApiVersion = Build.VERSION.SDK_INT;


        if(currentApiVersion >=  Build.VERSION_CODES.M)
        {

            if(checkPermission())
            {

            }
            else
            {

                requestPermission();
            }
        }
    }

    private boolean checkPermission()
    {
        return (ContextCompat.checkSelfPermission(getApplicationContext(), CAMERA) == PackageManager.PERMISSION_GRANTED);
    }

    private void requestPermission()
    {
        ActivityCompat.requestPermissions(this, new String[]{CAMERA}, REQUEST_CAMERA);
    }

    @Override
    public void onResume() {
        super.onResume();

        int currentapiVersion = android.os.Build.VERSION.SDK_INT;
        if (currentapiVersion >= android.os.Build.VERSION_CODES.M) {
            if (checkPermission()) {
                if(scannerView == null) {
                    scannerView = new ZXingScannerView(this);
                    setContentView(scannerView);
                }
                scannerView.setResultHandler(this);
                scannerView.startCamera();
            } else {
                requestPermission();
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        scannerView.stopCamera();
    }

    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CAMERA:
                if (grantResults.length > 0) {

                    boolean cameraAccepted = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                    if (cameraAccepted){

                    }else {

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            if (shouldShowRequestPermissionRationale(CAMERA)) {
                                showMessageOKCancel("Trebas dozvoliti pristup permisijama",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                                    requestPermissions(new String[]{CAMERA},
                                                            REQUEST_CAMERA);
                                                }
                                            }
                                        });
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }

    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {
        new android.support.v7.app.AlertDialog.Builder(Main3Activity.this)
                .setMessage(message)
                .setPositiveButton("OK", okListener)
                .setNegativeButton("Cancel", null)
                .create()
                .show();
    }

    /*public Magic getMagic() {
        return magic;
    }
*/

    public Mapa getMapa() {
        return mapa;
    }

    //Intent intent = new Intent(Main3Activity.this, MainActivity.class);//ispis
    @Override
    public void handleResult(Result result) {
        final String myResult = result.getText();

        switch (myResult){
            case "QR1":
                //mapa.obiljeziPolje(0);
                //magic = new Magic(main5Activity.getWeb(), 1);
                //magic.work();
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "1");
                startActivity(intent);
                break;
            case "QR2":
                //mapa.obiljeziPolje(1);
                //magic = new Magic(main5Activity.getWeb(), 2);
                //magic.work();
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "2");
                startActivity(intent);
                break;
            case "QR3":
                //mapa.obiljeziPolje(2);
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "3");
                startActivity(intent);
                break;
            case "QR4":
                //mapa.obiljeziPolje(3);
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "4");
                startActivity(intent);
                break;
            case "QR5":
                //mapa.obiljeziPolje(4);
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "5");
                startActivity(intent);
                break;
            case "QR6":
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "6");
                startActivity(intent);
                break;
            case "QR7":
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "7");
                startActivity(intent);
                break;
            case "QR8":
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "8");
                startActivity(intent);
                break;
            case "QR9":
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "9");
                startActivity(intent);
                break;
            case "QR10":
                //mapa.obiljeziPolje(9);
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "10");
                startActivity(intent);
                break;
            case "QR11":
                //mapa.obiljeziPolje(10);
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "11");
                startActivity(intent);
                break;
            case "QR12":
                //mapa.obiljeziPolje(11);
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "12");
                startActivity(intent);
                break;
            case "QR13":
                //mapa.obiljeziPolje(12);
                intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra("key", "13");
                startActivity(intent);
                break;
            default:
                scannerView.setResultHandler(this);
                scannerView.startCamera();
                break;

        }
    }
}
