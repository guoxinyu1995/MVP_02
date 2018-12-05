package com.example.mve_week2_01.presender;

import com.example.mve_week2_01.bean.AutoBean;
import com.example.mve_week2_01.bean.NewsBean;
import com.example.mve_week2_01.model.ImodelImpl;
import com.example.mve_week2_01.model.MyCallBack;
import com.example.mve_week2_01.view.Iview;
import com.example.mve_week2_01.view.MainActivity;

public class IpresenderImpl implements Ipresender {
    private Iview mIview;
    private ImodelImpl imodel;

    public IpresenderImpl(Iview iview) {
        mIview = iview;
        imodel = new ImodelImpl();
    }

    @Override
    public void startRequest(String url, String params, Class clazz) {
        imodel.requestData(url, null, clazz, new MyCallBack() {
            @Override
            public void setData(Object data) {
                if (data instanceof AutoBean){
                    AutoBean autoBean = (AutoBean) data;
                    if(autoBean==null || !autoBean.isSuccess()){
                        mIview.error(autoBean.getMsg());
                    }else{
                        mIview.success(autoBean);
                    }
                }else if(data instanceof NewsBean){
                    NewsBean newsBean = (NewsBean) data;
                    if(newsBean==null || !newsBean.isSuccess()){
                        mIview.error(newsBean.getMsg());
                    }else{
                        mIview.success(newsBean);
                    }
                }
            }
        });
    }
    //解除绑定
    public void onDetach(){
        if(imodel!=null){
            imodel = null;
        }
        if (mIview!=null){
            mIview = null;
        }
    }
}
