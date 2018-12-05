package com.example.mve_week2_01.model;

import com.example.mve_week2_01.bean.AutoBean;
import com.example.mve_week2_01.util.NetUtil;

public class ImodelImpl implements Imodel {
    private MyCallBack myCallBack;
    @Override
    public void requestData(String url, String params, final Class clazz, final MyCallBack myCallBack) {
        this.myCallBack = myCallBack;
            NetUtil.getIntance().getRequest(url, clazz, new NetUtil.CallBack() {
                @Override
                public void onSuccess(Object o) {
                    myCallBack.setData(o);
                }
            });

    }
}
