package com.example.mve_week2_01.adaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mve_week2_01.R;
import com.example.mve_week2_01.bean.NewsBean;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class NewAdaper extends BaseAdapter {
    private List<NewsBean.DataBean> mData;
    private Context mContext;

    public NewAdaper(Context mContext) {
        this.mContext = mContext;
        //初始化
        mData = new ArrayList<>();
    }
    public void setmData(List<NewsBean.DataBean> datas){
        mData.clear();
        if(datas!=null){
            mData.addAll(datas);
        }
        notifyDataSetChanged();
    }
    public void addmData(List<NewsBean.DataBean> datas){
        if(datas!=null){
            mData.addAll(datas);
        }
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public NewsBean.DataBean getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    private final int ITEM_COUNT = 2;

    @Override
    public int getViewTypeCount() {
        return ITEM_COUNT;
    }
    private final int IMAGEONE_TYPE = 0;
    private final int IMAGETHREE_TYPE = 1;

    @Override
    public int getItemViewType(int position) {
        return mData.get(position).hasImage()?IMAGETHREE_TYPE:IMAGEONE_TYPE;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(
                    getItemViewType(position)==IMAGETHREE_TYPE? R.layout.data_item_imagethree:R.layout.data_item_imageone
                    ,parent,false);
            holder = new ViewHolder(convertView);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.bind(getItem(position));
        return convertView;
    }
    class ViewHolder{
        TextView title;
        ImageView image1;
        ImageView image2;
        ImageView image3;

        public ViewHolder(View convertView) {
            title = convertView.findViewById(R.id.title);
           image1 = convertView.findViewById(R.id.imag1);
            image2 = convertView.findViewById(R.id.imag2);
            image3 = convertView.findViewById(R.id.imag3);
            convertView.setTag(this);
        }

        public void bind(NewsBean.DataBean item) {
            title.setText(item.getTitle());
            ImageLoader.getInstance().displayImage(item.getThumbnail_pic_s(),image1);
            if(image2!=null&&image3!=null){
                ImageLoader.getInstance().displayImage(item.getThumbnail_pic_s02(),image2);
                ImageLoader.getInstance().displayImage(item.getThumbnail_pic_s03(),image3);
            }
        }
    }
}
