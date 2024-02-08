package com.bananaapps.bananamusic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({RepoConfig.class, ServiceConfig.class})
@ComponentScan({"com.bananaapps.bananamusic.persistence.music","com.bananaapps.bananamusic.service.music"})
@PropertySource("classpath:config.properties")
public class SpringConfig {

}
