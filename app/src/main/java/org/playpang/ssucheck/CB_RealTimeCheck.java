package org.playpang.ssucheck;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CB_RealTimeCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb__real_time_check);

        ActionBar bar = getSupportActionBar();
        bar.setTitle("실시간 출결 현황");
    }
}
