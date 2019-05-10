package com.mycompany.jukebox;

public class Song {
    private String performer;
    private String name;

    public Song(String performer, String name) {
        this.performer = performer;
        this.name = name;
    }

    public Song() {
        this.performer = "unknown";
        this.name = "unknown";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getPerformer() {
        return performer;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return performer + " - " + name;
    }
}
