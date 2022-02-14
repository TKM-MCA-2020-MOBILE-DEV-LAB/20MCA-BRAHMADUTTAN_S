package com.example.gridview;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context context) {

        mContext = context;
    }

    @Override
    public int getCount() {

        return thumbImages.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(3,3,3,3);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }

    public Integer[] thumbImages = {
            R.drawable.logo_facebook,
            R.drawable.logo_insta,
            R.drawable.logo_amazon,
            R.drawable.logo_postgress,
            R.drawable.logo_android,
            R.drawable.logo_linkedin,
            R.drawable.logo_twitter,
            R.drawable.logo_youtube
    };
}
