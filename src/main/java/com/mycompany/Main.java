/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.jukebox.PlaylistEditorInterface;
import com.mycompany.jukebox.implementation.PlaylistEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Aleksandr_Bobryshev
 */
public class Main {

    public final static ApplicationContext APPLICATION_CONTEXT =
            new AnnotationConfigApplicationContext(BeanConfiguration.class);

    public static void main(String... args) {
        System.out.println("Insert a coin!");

        PlaylistEditorInterface editor = APPLICATION_CONTEXT.getBean("playlistEditorBean", PlaylistEditor.class);

        //PlaylistEditorInterface editor = new PlaylistEditor();
        editor.setPlaylist(1, 2 , 3, 6);
        editor.printPlaylist();
    }
}
