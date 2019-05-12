package com.mycompany;

import com.mycompany.jukebox.PlaylistEditorInterface;
import com.mycompany.jukebox.implementation.PlaylistEditorImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Aleksandr_Bobryshev
 */
public class Main {

    public final static ApplicationContext APPLICATION_CONTEXT =
            new AnnotationConfigApplicationContext(BeanConfiguration.class);

    public static void main(String... args) {
        PlaylistEditorInterface editor = APPLICATION_CONTEXT.getBean("playlistEditorBean", PlaylistEditorInterface.class);

        System.out.println("Insert a coin!");
        editor.setPlaylist(1, 4, 3, 6);
        editor.printPlaylist();
    }
/*
    public static void main2(String... args) {
        PlaylistEditorInterface editor = (PlaylistEditorInterface) APPLICATION_CONTEXT.getBean("playlistEditorBean2");

        System.out.println("Insert a coin!");
        editor.setPlaylist(5, 6);
        editor.printPlaylist();
    } */
}
