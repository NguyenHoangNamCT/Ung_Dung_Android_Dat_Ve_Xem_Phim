package com.example.datvexemphim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class phim_adapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private List<Phim> phimList;

    public phim_adapter(Context context, int layout, List<Phim> phimList) {
        this.context = context;
        this.layout = layout;
        this.phimList = phimList;
    }

    @Override
    public int getCount() {
        return phimList.size();
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
        TextView txtTieuDe, txtTheHoai;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            //ánh xạ
            holder = new ViewHolder();
            holder.txtTieuDe = view.findViewById(R.id.txtTieuDe);
            holder.txtTheHoai = view.findViewById(R.id.txtTheLoai);
            holder.imgHinh = view.findViewById(R.id.imgHinhPhim);
            view.setTag(holder);
        }
        else
            holder = (ViewHolder) view.getTag();
        Phim phim = phimList.get(i);
        holder.txtTieuDe.setText(phim.getTenPhim());
        holder.txtTheHoai.setText(phim.getTheLoai());
        holder.imgHinh.setImageResource(phim.getHinh());
        return view;
    }
}
