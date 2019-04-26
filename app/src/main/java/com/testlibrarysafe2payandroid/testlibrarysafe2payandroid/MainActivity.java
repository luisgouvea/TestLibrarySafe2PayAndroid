package com.testlibrarysafe2payandroid.testlibrarysafe2payandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntegrationSafe2Pay integrationSafe2Pay = new IntegrationSafe2Pay();
        integrationSafe2Pay.execute();
    }
}
