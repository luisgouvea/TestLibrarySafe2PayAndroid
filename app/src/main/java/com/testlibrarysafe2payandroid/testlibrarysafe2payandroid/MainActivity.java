package com.testlibrarysafe2payandroid.testlibrarysafe2payandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.librarysafe2payapiandroid.librarysafe2payapi.ResponseAPIModel;
import com.librarysafe2payapiandroid.librarysafe2payapi.Safe2PayConfig;
import com.librarysafe2payapiandroid.librarysafe2payapi.SingleSaleAddCallback;
import com.librarysafe2payapiandroid.librarysafe2payapi.SingleSaleIntegration;
import com.librarysafe2payapiandroid.librarysafe2payapi.SingleSaleModel;

public class MainActivity extends AppCompatActivity implements SingleSaleAddCallback {

    private SingleSaleAddCallback singleSaleAddCallback = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Safe2PayConfig.setKey("48385783758438758375");

        SingleSaleIntegration.addSingleSale(singleSaleAddCallback, 12.3, 2);
    }

    @Override
    public void requestSingleSaleAddSuccess(SingleSaleModel authenticationRequest) {

    }

    @Override
    public void requestSingleSaleAddFailed(ResponseAPIModel errorResponseAPI) {

    }
}
