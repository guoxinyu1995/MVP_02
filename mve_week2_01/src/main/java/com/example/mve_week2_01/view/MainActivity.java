package com.example.mve_week2_01.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mve_week2_01.R;
import com.example.mve_week2_01.bean.AutoBean;
import com.example.mve_week2_01.presender.IpresenderImpl;
import com.example.mve_week2_01.util.NonNull;

public class MainActivity extends AppCompatActivity implements Iview,View.OnClickListener{

    private EditText name;
    private EditText pass;
    private CheckBox remember;
    private CheckBox out;
    private Button comit;
    private SharedPreferences sp;
    private SharedPreferences.Editor edit;
    private String url = "http://www.xieast.com/api/user/login.php?username=%s&password=%s";
    private IpresenderImpl ipresender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定IpresenderImpl
        ipresender = new IpresenderImpl(this);
        //创建sp
        sp = getSharedPreferences("User",MODE_PRIVATE);
        //创建edit
        edit = sp.edit();
        initView();
    }
    //初始化view
    private void initView() {
        //获取资源id
        name = findViewById(R.id.ed_name);
        pass = findViewById(R.id.ed_pass);
        remember = findViewById(R.id.remember);
        out = findViewById(R.id.out);
        comit = findViewById(R.id.comit);
        //点击提交
        comit.setOnClickListener(this);
        //将记住密码状态值取出
        boolean r_check = sp.getBoolean("r_check", false);
        if(r_check){
            //取出值
            String names = sp.getString("names", null);
            String passs = sp.getString("passs", null);
            //设置值
            name.setText(names);
            pass.setText(passs);
            remember.setChecked(true);
        }
        //将自动状态值取出
        boolean o_check = sp.getBoolean("o_check", false);
        if(o_check){
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            String admin = sp.getString("admin", null);
            intent.putExtra("username",admin);
            startActivity(intent);
        }
        // 勾选自动登录同事勾选记住 密码
        out.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    remember.setChecked(true);
                }else{
                    remember.setChecked(false);
                }
            }
        });
    }

    @Override
    public void success(Object o) {
       AutoBean autoBean = (AutoBean) o;
       edit.putString("admin",autoBean.getData().getName());
       edit.commit();
        Toast.makeText(MainActivity.this,autoBean.getMsg(),Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        intent.putExtra("username",autoBean.getData().getName());
        startActivity(intent);
    }

    @Override
    public void error(String str) {
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.comit:
                //获取输入框的值
                String names = name.getText().toString();
                String passs = pass.getText().toString();
                //判断记住密码是否勾选
                if(remember.isChecked()){
                    //将值存入
                    edit.putString("names",names);
                    edit.putString("passs",passs);
                    //存入一个勾选状态
                    edit.putBoolean("r_check",true);
                    //提交
                    edit.commit();
                }else{
                    //清空
                    edit.clear();
                    //提交
                    edit.commit();
                }
                //非空
                if(NonNull.getInstance().isNonNull(names,passs)){
                    ipresender.startRequest(String.format(url,names,passs),null,AutoBean.class);
                }else{
                    Toast.makeText(MainActivity.this,"手机号和密码不能为空",Toast.LENGTH_SHORT).show();
                }
                //自动登录
                if(out.isChecked()){
                    //存入一个勾选状态
                    edit.putBoolean("o_check",true);
                    //提交
                    edit.commit();
                }
                break;
                default:
                    break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ipresender.onDetach();
    }
}
