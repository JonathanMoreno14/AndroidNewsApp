package com.example.jonathanmoreno.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class NewsAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<HashMap<String, String>> data;

    public NewsAdapter(Activity activity, ArrayList<HashMap<String, String>> data) {
        this.activity = activity;
        this.data = data;
    }

    public int getCount(){
        return data.size();
    }

    public Object getItem(int position){
        return position;

    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        NewsViewHolder holder = null;
        if (convertView == null) {
            holder = new NewsViewHolder();
            convertView = LayoutInflater.from(activity).inflate(
                    R.layout.list_item_row, parent, false);
            holder.galleryImage = (ImageView) convertView.findViewById(R.id.imageGallery);
            holder.author = (TextView) convertView.findViewById(R.id.authorTextView);
            holder.title = (TextView) convertView.findViewById(R.id.titleTextView);
            holder.details = (TextView) convertView.findViewById(R.id.detailsTextView);
            holder.time = (TextView) convertView.findViewById(R.id.timeTextView);
            convertView.setTag(holder);
        } else {
            holder = (NewsViewHolder) convertView.getTag();
        }
        holder.galleryImage.setId(position);
        holder.author.setId(position);
        holder.title.setId(position);
        holder.details.setId(position);
        holder.time.setId(position);

        HashMap<String, String> song = new HashMap<String, String>();
        song = data.get(position);

        try{
            holder.author.setText(song.get(MainActivity.KEY_AUTHOR));
            holder.title.setText(song.get(MainActivity.KEY_TITLE));
            holder.time.setText(song.get(MainActivity.KEY_PUBLISHEDAT));
            holder.details.setText(song.get(MainActivity.KEY_DESCRIPTION));

            if(song.get(MainActivity.KEY_URLTOIMAGE).toString().length() < 5)
            {
                holder.galleryImage.setVisibility(View.GONE);
            }else{
                Picasso.get() //activity
                        .load(song.get(MainActivity.KEY_URLTOIMAGE).toString())
                        .resize(300, 200)
                        .into(holder.galleryImage);
            }
        }catch(Exception e) {}
        return convertView;
    }
}

class NewsViewHolder {
    ImageView galleryImage;
    TextView author, title, details, time;
}




