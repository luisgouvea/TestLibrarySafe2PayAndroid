package com.testlibrarysafe2payandroid.testlibrarysafe2payandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.librarysafe2payapiandroid.librarysafe2payapi.manager.Safe2PayConfig;
import com.librarysafe2payapiandroid.librarysafe2payapi.manager.singleSale.SingleSaleIntegration;
import com.librarysafe2payapiandroid.librarysafe2payapi.models.singleSale.SingleSale;
import com.librarysafe2payapiandroid.librarysafe2payapi.models.util.ResponseAPI;
import com.librarysafe2payapiandroid.librarysafe2payapi.services.singleSale.add.SingleSaleAddCallback;

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
    public void requestSingleSaleAddSuccess(SingleSale authenticationRequest) {

    }

    @Override
    public void requestSingleSaleAddFailed(ResponseAPI errorResponseAPI) {

    }
}
