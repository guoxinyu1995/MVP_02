package com.example.mvp_verification.view;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvp_verification.R;
import com.example.mvp_verification.presender.IpresenderImpl;
import com.example.mvp_verification.util.NonNull;

public class MainActivity extends AppCompatActivity implements Iview,View.OnClickListener {

    private IpresenderImpl ipresender;
    private EditText name;
    private EditText paw;
    private TextView text;
    private CheckBox checkBox;
    private Button button;
    private int n = 10;
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(n>0){
                n--;
                text.setText(n+"s");
                handler.sendEmptyMessageDelayed(0,1000);
            }else{
                n = 10;
                text.setText("发送验证码");
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ipresender = new IpresenderImpl(this);
        initView();
    }

    private void initView() {
        //获取资源id
        name = findViewById(R.id.name);
        paw = findViewById(R.id.paw);
        text = findViewById(R.id.text);
        checkBox = findViewById(R.id.checkbox);
        button = findViewById(R.id.but);
        //获取验证码
        text.setOnClickListener(this);
        //下一步
        button.setOnClickListener(this);
        //复选框
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox.setChecked(true);
                    button.setEnabled(true);
                }else{
                    checkBox.setChecked(false);
                    button.setEnabled(false);
                }
            }
        });
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if(s.length()==11){
                        text.setEnabled(true);
                    }else{
                        text.setEnabled(false);
                    }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void success(Object o) {
        int i = (int) o;
        paw.setText(i+"");
    }

    @Override
    public void error(String str) {

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.text:
                ipresender.startRequest(null,null);
                handler.sendEmptyMessageDelayed(0,1000);
                break;
            case R.id.but:
                //获取输入框的值
                String names = name.getText().toString().trim();
                String paws = paw.getText().toString().trim();
                if(NonNull.getInstance().isNonNull(names,paws)){
                    Toast.makeText(MainActivity.this,"账号和验证码正确",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"账号和验证码不能为空",Toast.LENGTH_SHORT).show();
                }
                break;
                default:
                    break;
        }
    }
}
