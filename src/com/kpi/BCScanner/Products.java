package com.kpi.BCScanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by RASULBEK on 17.08.2015.
 */
public class Products extends Activity {
    EditText scanCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);
        scanCode = (EditText)findViewById(R.id.scancode);
        scanCode.setText(GlobalVars.ScanResult);
    }

    private void rescan(View v){
        finish();

    }

}
