package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import java.util.List;

public class SiteAdapter extends BaseAdapter {
    List<String> name;
    List<Integer> pics;

    public SiteAdapter(List<String> name, List<Integer> pics) {
        this.name = name;
        this.pics = pics;
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 1;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
            view = layoutInflater.inflate(R.layout.layout_siteitem, viewGroup, false);
        }
        TextView txtViewDesc = view.findViewById(R.id.txtViewDesc);
        txtViewDesc.setText(name.get(i));

        Drawable img = ResourcesCompat.getDrawable(viewGroup.getResources(), pics.get(i), viewGroup.getContext().getTheme());
        img.setBounds(0,0,200,200);

        txtViewDesc.setCompoundDrawables(img,null,null,null);
        txtViewDesc.setCompoundDrawablePadding(8);
        txtViewDesc.setGravity(Gravity.CENTER);
        return view;
    }
}
