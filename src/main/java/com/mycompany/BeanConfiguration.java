package com.mycompany;

import com.mycompany.jukebox.Song;
import com.mycompany.jukebox.implementation.JukeboxImpl;
import com.mycompany.jukebox.implementation.PlaylistEditorImpl;
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
    public JukeboxImpl jukeboxBean() {
        return new JukeboxImpl();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PlaylistEditorImpl playlistEditorBean() {
        final PlaylistEditorImpl playlistEditorImpl = new PlaylistEditorImpl();
        playlistEditorImpl.setJukeboxImpl(jukeboxBean());
        return playlistEditorImpl;
    }
}
