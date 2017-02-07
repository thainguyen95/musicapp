package com.example.thain.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SongAdapter extends BaseAdapter {
    private static ArrayList<Song> mSongs;
    private static LayoutInflater mInflater;

    public SongAdapter(Context context, ArrayList<Song> songs) {   //context == MainActivity
        mSongs = songs;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int pos, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            view = mInflater.inflate(R.layout.song, parent, false); //truyen layout.song vao MainActivity
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        final Song song = mSongs.get(pos);
        holder.title.setText(song.getTitle());
        holder.artist.setText(song.getArtist());


        return view;
    }

    @Override
    public int getCount() {
        return mSongs.size();
    }

    @Override
    public Object getItem(int i) {
        return mSongs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder {
        @BindView(R.id.songTitle) TextView title;
        @BindView(R.id.songArtist) TextView artist;

        private ViewHolder(View v) {
            ButterKnife.bind(this, v);
        }
    }
}
