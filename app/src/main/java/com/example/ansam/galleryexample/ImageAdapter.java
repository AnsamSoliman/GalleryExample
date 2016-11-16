package com.example.ansam.galleryexample;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import java.util.zip.Inflater;

/**
 * Created by ansam on 11/16/2016.
 */

public class ImageAdapter extends BaseAdapter {
    private  Context c;
    private int[]images;
    public ImageAdapter(Context c,int[]images){
        this.c=c;
        this.images=images;


    }
    @Override
    public int getCount() {
        return images.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView image=new ImageView(c);
        image.setImageResource(images[position]);
        image.setLayoutParams(new Gallery.LayoutParams(100, 100));
       // image.setBackgroundResource(itemBackground);
        return image;

    }
}
