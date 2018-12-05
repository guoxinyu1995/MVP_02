package com.example.mve_week2_01.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mve_week2_01.R;
import com.example.mve_week2_01.view.LoginActivity;
import com.example.mve_week2_01.view.MainActivity;

import java.lang.ref.WeakReference;

import cn.bingoogolapple.qrcode.zxing.QRCodeEncoder;

import static android.content.Context.MODE_PRIVATE;

public class CardFragment extends Fragment {

    private ImageView code_image;
    private Button quit;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.card_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        code_image = view.findViewById(R.id.code_image);
        quit = view.findViewById(R.id.quit);
        sp = getActivity().getSharedPreferences("User",MODE_PRIVATE);
        edit = sp.edit();
        ((LoginActivity)getActivity()).setfCallBack(new LoginActivity.CallBack() {
            @Override
            public void setChange(String str) {
                //生成二维码
                createQRCode(str);
            }
        });
        //点击退出登录
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MainActivity.class);
                edit.putBoolean("o_check",false);
                edit.commit();
                startActivity(intent);
                getActivity().finish();
            }
        });
    }
    //生成二维码
    private void createQRCode(String str) {
        QRTask qrTask = new QRTask(getActivity(),code_image);
        qrTask.execute(str);
    }
    //创建静态内部类处理文本框获取到的字符串，并生成二维码赋值与imageview展示
    public static class QRTask extends AsyncTask<String,Void,Bitmap> {
        //软引用类型
        private WeakReference<Context> mContext;
        private WeakReference<ImageView> mImageView;
        public QRTask(Context context, ImageView image) {
            mContext = new WeakReference<>(context);
            mImageView = new WeakReference<>(image);
        }
        @Override
        protected Bitmap doInBackground(String... strings) {
            String str = strings[0];
            if(TextUtils.isEmpty(str)){
                return null;
            }
            //软应用只能通过get()获取到相应的方法，返回要生成的二维码的尺寸大小
            int size = mContext.get().getResources().getDimensionPixelOffset(R.dimen.qr_code_size);
            //返回生成的二维码图片
            return QRCodeEncoder.syncEncodeQRCode(str,size);
        }
        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            //生成的二维码不为空就直接赋值与imageview上
            if (bitmap != null) {
                mImageView.get().setImageBitmap(bitmap);
            } else {
                Toast.makeText(mContext.get(), "生成失败", Toast.LENGTH_SHORT).show();
            }
        }
    }


}
