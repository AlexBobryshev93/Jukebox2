package com.mycompany.jukebox.implementation;

import com.mycompany.jukebox.JukeboxInterface;
import com.mycompany.jukebox.Song;

import java.util.HashMap;
import java.util.Map;

public class Jukebox implements JukeboxInterface {
    private Map<Integer, Song> songs = new HashMap<>();

    public Jukebox() {
        songs.put(1, new Song("Nirvana", "Smells Like Teen Spirit"));
        songs.put(2, new Song("Butyrka", "Smells Like Spring"));
        songs.put(3, new Song("Metallica", "Enter Sandman"));
        songs.put(4, new Song("Wu-Tang Clan", "C.R.E.A.M."));
        songs.put(5, new Song("Eric Clapton", "Layla"));
        songs.put(6, new Song());
        System.out.println("Song DB successfully created...");
    }

    @Override
    public Song chooseSongById(Integer id) {
        return songs.get(id);
    }
}
