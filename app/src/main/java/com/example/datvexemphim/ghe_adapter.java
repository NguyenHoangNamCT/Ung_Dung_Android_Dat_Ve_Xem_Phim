package com.example.datvexemphim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ghe_adapter extends BaseAdapter {
    private Context context;
    private int layout;
    List<ghe_ngoi> gheNgoiList;

    public ghe_adapter(Context context, int layout, List<ghe_ngoi> gheNgoiList) {
        this.context = context;
        this.layout = layout;
        this.gheNgoiList = gheNgoiList;
    }



    @Override
    public int getCount() {
        return gheNgoiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtSoGhe;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder.imgHinh =  view.findViewById(R.id.imgHinhGhe);
            holder.txtSoGhe = view.findViewById(R.id.txtSoGhe);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }

        ghe_ngoi ghe = gheNgoiList.get(i);

        holder.imgHinh.setImageResource(ghe.getHinh());
        holder.txtSoGhe.setText("Ghế số: " + ghe.getSoGhe());

        return view;
    }
}
