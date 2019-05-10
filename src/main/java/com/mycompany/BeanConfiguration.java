package com.mycompany;

import com.mycompany.jukebox.Song;
import com.mycompany.jukebox.implementation.Jukebox;
import com.mycompany.jukebox.implementation.PlaylistEditor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Song songBean() {
        return new Song();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Jukebox jukeboxBean() {
        return new Jukebox();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PlaylistEditor playlistEditorBean() {
        final PlaylistEditor playlistEditor = new PlaylistEditor();
        playlistEditor.setJukebox(jukeboxBean());
        return playlistEditor;
    }
}
