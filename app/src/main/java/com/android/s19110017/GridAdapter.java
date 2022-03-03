package com.android.s19110017;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {


    Context context;
    String[] name;
    int[] image;
    String[] price;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] name, int[] image, String[] price) {
        this.context = context;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null)
            view = inflater.inflate(R.layout.grid_item, null);

        ImageView imageView = view.findViewById(R.id.grid_image);
        TextView textView1 = view.findViewById(R.id.item_name);
        TextView textView2 = view.findViewById(R.id.price_name);

        imageView.setImageResource(image[i]);
        textView1.setText(name[i]);
        textView2.setText(price[i]);

        return view;
    }
}
