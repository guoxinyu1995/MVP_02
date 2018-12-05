package com.example.mve_week2_01.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mve_week2_01.R;
import com.example.mve_week2_01.adaper.NewAdaper;
import com.example.mve_week2_01.bean.NewsBean;
import com.example.mve_week2_01.presender.IpresenderImpl;
import com.example.mve_week2_01.view.Iview;
import com.example.mve_week2_01.view.MainActivity;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

public class DataFragment extends Fragment implements Iview {

    private PullToRefreshListView listView;
    private IpresenderImpl ipresender;
    private NewAdaper adaper;
    private int mPage;
    private String url = "http://www.xieast.com/api/news/news.php";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.data_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPage = 1;
        ipresender = new IpresenderImpl(this);
        //获取资源id
        listView = view.findViewById(R.id.pull);
        //创建适配器
        adaper = new NewAdaper(getActivity());
        listView.setAdapter(adaper);
        listView.setMode(PullToRefreshBase.Mode.BOTH);
        listView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                mPage = 1;
                initData();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                initData();
            }
        });
        initData();
    }

    private void initData() {
        ipresender.startRequest(url, null, NewsBean.class);
    }
    //请求成功执行
    @Override
    public void success(Object o) {
        NewsBean bean = (NewsBean) o;
        Toast.makeText(getActivity(), bean.getMsg(), Toast.LENGTH_SHORT).show();
        if (mPage == 1) {
            adaper.setmData(bean.getData());
        } else {
            adaper.addmData(bean.getData());
        }
        mPage++;
        listView.onRefreshComplete();
    }
    //请求失败执行
    @Override
    public void error(String str) {
        Toast.makeText(getActivity(), str, Toast.LENGTH_SHORT).show();
    }
    //销毁
    @Override
    public void onDestroy() {
        super.onDestroy();
        ipresender.onDetach();
    }
}
