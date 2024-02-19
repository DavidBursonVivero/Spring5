package com.bananaapps.bananamusic.config;

import com.bananaapps.bananamusic.persistence.music.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Autowired
    SongRepository songrepo;
}
