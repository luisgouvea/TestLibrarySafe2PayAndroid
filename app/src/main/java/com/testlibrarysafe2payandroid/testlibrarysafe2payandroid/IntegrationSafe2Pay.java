package com.testlibrarysafe2payandroid.testlibrarysafe2payandroid;

import com.librarysafe2payapiandroid.librarysafe2payapi.manager.RequestManager;
import com.librarysafe2payapiandroid.librarysafe2payapi.models.singleSale.SingleSale;
import com.librarysafe2payapiandroid.librarysafe2payapi.models.util.ResponseAPI;
import com.librarysafe2payapiandroid.librarysafe2payapi.services.singleSale.add.SingleSaleAddCallback;

public class IntegrationSafe2Pay extends RequestManager implements SingleSaleAddCallback {

    private SingleSaleAddCallback singleSaleAddCallback = this;

    public IntegrationSafe2Pay() {

    }

    public void execute() {
        addSingleSale(singleSaleAddCallback, 12.3, 2);
    }

    @Override
    public void requestSingleSaleAddSuccess(SingleSale authenticationRequest) {

    }

    @Override
    public void requestSingleSaleAddFailed(ResponseAPI errorResponseAPI) {

    }
}
