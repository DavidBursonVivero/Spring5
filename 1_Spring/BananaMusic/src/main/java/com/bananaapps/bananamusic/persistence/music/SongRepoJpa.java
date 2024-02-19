package com.bananaapps.bananamusic.persistence.music;

import com.bananaapps.bananamusic.domain.music.Song;
import com.bananaapps.bananamusic.domain.music.SongCategory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

public class SongRepoJpa implements SongRepository{

    @PersistenceContext
    private EntityManager em;
    @Override
    public Song findOne(Long id) {
        return null;
    }

    @Override
    public Collection<Song> findAll() {
        return null;
    }

    @Override
    public Collection<Song> findByArtistContainingOrTitleContainingAllIgnoreCase(String artist, String title) {
        return null;
    }

    @Override
    public Collection<Song> findBySongCategory(SongCategory category) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Song save(Song song) {
        return null;
    }

    @Override
    public void delete(Song song) {

    }
}
