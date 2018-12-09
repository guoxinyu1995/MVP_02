package com.example.mvp_verification.presender;

import com.example.mvp_verification.Imodel.ImodelImpl;
import com.example.mvp_verification.Imodel.MyCallaBack;
import com.example.mvp_verification.view.Iview;
import com.example.mvp_verification.view.MainActivity;

public class IpresenderImpl implements Ipresender {
    private Iview mIview;
    private final ImodelImpl imodel;

    public IpresenderImpl(Iview iview) {
        mIview = iview;
        imodel = new ImodelImpl();
    }

    @Override
    public void startRequest(String pames, Class clazz) {
        imodel.requestData(null, null, new MyCallaBack() {
            @Override
            public void setData(Object data) {
                mIview.success(data);
            }
        });
    }
}
