package com.tugbacevizci.voltagram;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by tugbacevizci on 19/01/17.
 */
public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {

    private Context context;
    private List<Photo> photos;
    private int rowLayout;

    public PhotoAdapter(List<Photo> photos, int rowLayout, Context context) {
        this.photos = photos;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public PhotoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PhotoAdapter.ViewHolder holder, int position) {

        Photos photo = photos.get(position).photos;
        Picasso.with(context).load(photo.perpage).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            imageView = (ImageView) itemView.findViewById(R.id.photo_image_view);
        }
    }
}
