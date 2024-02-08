package com.bananaapps.bananamusic.config;

import com.bananaapps.bananamusic.persistence.music.SongRepository;
import com.bananaapps.bananamusic.service.music.ShoppingCartImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    /*@Autowired
    SongRepository sRepo;*/

   /* @Bean
    public ShoppingCartImpl getShoppingCart(SongRepository songRepo){
        return new ShoppingCartImpl(songRepo);
    }*/
}
