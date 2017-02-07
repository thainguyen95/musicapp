package com.example.thain.musicapp;

import java.util.ArrayList;

public class Events {
    public static class SongChanged {
        private static Song mSong;

        SongChanged(Song song) {
            mSong = song;
        }

        public Song getSong() {
            return mSong;
        }
    }

    public static class SongStateChanged {
        private static boolean mIsPlaying;

        SongStateChanged(boolean isPlaying) {
            mIsPlaying = isPlaying;
        }

        public boolean getIsPlaying() {
            return mIsPlaying;
        }
    }

    public static class PlaylistUpdated {
        private static ArrayList<Song> mSongs;

        PlaylistUpdated(ArrayList<Song> songs) {
            mSongs = songs;
        }

        public ArrayList<Song> getSongs() {
            return mSongs;
        }
    }

    public static class ProgressUpdated {
        private static int mProgress;

        ProgressUpdated(int progress) {
            mProgress = progress;
        }

        public int getProgress() {
            return mProgress;
        }
    }
}
