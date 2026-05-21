package com.pb.xiaomimarketbypass;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pb.bilibilimod.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int padding = dp(24);

        LinearLayout content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setGravity(Gravity.CENTER);
        content.setPadding(padding, padding, padding, padding);
        content.setBackgroundColor(Color.rgb(18, 18, 22));

        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.ic_launcher_foreground);
        LinearLayout.LayoutParams logoParams = new LinearLayout.LayoutParams(dp(112), dp(112));
        logoParams.bottomMargin = dp(18);
        content.addView(logo, logoParams);

        TextView title = new TextView(this);
        title.setGravity(Gravity.CENTER);
        title.setText(R.string.status_title);
        title.setTextColor(Color.WHITE);
        title.setTextSize(24);
        title.setTypeface(null, android.graphics.Typeface.BOLD);
        content.addView(title, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView status = new TextView(this);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, dp(12), 0, dp(22));
        status.setText(R.string.status_text);
        status.setTextColor(Color.rgb(210, 210, 218));
        status.setTextSize(15);
        content.addView(status, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView firstLaunchWarning = new TextView(this);
        firstLaunchWarning.setGravity(Gravity.CENTER);
        firstLaunchWarning.setPadding(dp(12), dp(10), dp(12), dp(18));
        firstLaunchWarning.setText(R.string.first_launch_warning);
        firstLaunchWarning.setTextColor(Color.rgb(255, 224, 174));
        firstLaunchWarning.setTextSize(14);
        content.addView(firstLaunchWarning, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView donateMessage = new TextView(this);
        donateMessage.setGravity(Gravity.CENTER);
        donateMessage.setPadding(0, 0, 0, dp(14));
        donateMessage.setText(R.string.donate_message);
        donateMessage.setTextColor(Color.rgb(235, 235, 242));
        donateMessage.setTextSize(14);
        content.addView(donateMessage, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        Button donate = new Button(this);
        donate.setText(R.string.donate_button);
        donate.setAllCaps(false);
        donate.setOnClickListener(v -> openDonatePage());
        content.addView(donate, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        setContentView(content);
    }

    private void openDonatePage() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.donate_url)));
        startActivity(intent);
    }

    private int dp(int value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }
}
