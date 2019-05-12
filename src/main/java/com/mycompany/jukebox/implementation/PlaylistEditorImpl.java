package com.mycompany.jukebox.implementation;

import com.mycompany.jukebox.PlaylistEditorInterface;
import com.mycompany.jukebox.Song;

import java.util.LinkedList;
import java.util.List;

public class PlaylistEditorImpl implements PlaylistEditorInterface {
    private JukeboxImpl jukeboxImpl;
    private List<Song> playlist = new LinkedList<>();

    public PlaylistEditorImpl() {
        jukeboxImpl = new JukeboxImpl();
        System.out.println("JukeboxImpl is ready...");
    }

    @Override
    public void setPlaylist(Integer...ids) {
        for(Integer i : ids) playlist.add(jukeboxImpl.chooseSongById(i));
    }

    public List<Song> getPlaylist() {
        return playlist;
    }

    @Override
    public void printPlaylist() {
        System.out.println("Your playlist for today: ");
        for (Song song : playlist) System.out.println(song.toString());
    }

    public void setJukeboxImpl(JukeboxImpl jukeboxImpl) {
        this.jukeboxImpl = jukeboxImpl;
    }

    public JukeboxImpl getJukeboxImpl() {
        return jukeboxImpl;
    }
}
