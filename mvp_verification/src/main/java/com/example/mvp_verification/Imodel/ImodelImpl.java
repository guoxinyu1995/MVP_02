package com.example.mvp_verification.Imodel;

import java.util.Random;

public class ImodelImpl implements Imodel {
    private MyCallaBack myCallaBack;
    @Override
    public void requestData(String prames, Class clazz, MyCallaBack myCallaBack) {
        this.myCallaBack = myCallaBack;
        /*Random random = new Random();
        int i = random.nextInt(999999);*/
        for (int i = 0; i <= 100; i++)
        {
            int flag = new Random().nextInt(999999);
            if (flag < 100000)
            {
                flag += 100000;
            }
            myCallaBack.setData(flag);
        }
    }

}
