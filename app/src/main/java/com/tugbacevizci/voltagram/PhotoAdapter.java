package com.tugbacevizci.voltagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by tugbacevizci on 19/01/17.
 */
public class PhotoAdapter extends ArrayAdapter<Photo> {

    private Context context;
    private List<Photo> arrayList = new ArrayList<Photo>();
    private ViewHolder viewHolder;

    public PhotoAdapter(Context context, List<Photo> list_items) {
        super(context, R.layout.list_item_photo, list_items);
        this.context = context;
        this.arrayList = list_items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if(view == null){

            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(R.layout.list_item_photo, parent,false);

            viewHolder = new ViewHolder();
            viewHolder.image = (ImageView)view.findViewById(R.id.photo_iv);
            view.setTag(viewHolder);

        }else{

            viewHolder = (ViewHolder) view.getTag();
        }
        return view;

    }

    private static class ViewHolder{

        ImageView image;
    }
}
