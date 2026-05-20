package com.pb.xiaomimarketbypass;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import com.pb.bilibilimod.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(32, 32, 32, 32);
        textView.setText(R.string.status_text);
        setContentView(textView);
    }
}
