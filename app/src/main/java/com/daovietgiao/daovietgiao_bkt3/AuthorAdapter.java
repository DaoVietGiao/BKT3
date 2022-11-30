package com.daovietgiao.daovietgiao_bkt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AuthorAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Author> authorList;

    public AuthorAdapter(Context context, int layout, List<Author> authorList) {
        this.context = context;
        this.layout = layout;
        this.authorList = authorList;
    }

    @Override
    public int getCount() {
        return authorList.size();
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
        ImageView imgThumb;
        TextView txtName, txtNamSinh, txtNamMat;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            //anh xa view
            holder.imgThumb = (ImageView) view.findViewById(R.id.imageviewThumb);
            holder.txtName = (TextView) view.findViewById(R.id.textviewName);
            holder.txtNamSinh = (TextView) view.findViewById(R.id.textviewNamSinh);
            holder.txtNamMat = (TextView) view.findViewById(R.id.textviewNamMat);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        //gan gia tri
        Author author = authorList.get(i);
        holder.imgThumb.setImageResource(author.getThumb());
        holder.txtName.setText(author.getName());
        holder.txtNamSinh.setText(author.getNamSinh());
        holder.txtNamMat.setText(author.getNamMat());

        return view;
    }
}
