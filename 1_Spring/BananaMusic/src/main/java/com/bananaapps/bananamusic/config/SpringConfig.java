package com.bananaapps.bananamusic.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import({RepoConfig.class, ServiceConfig.class})
@ComponentScan({"com.bananaapps.bananamusic"})
@PropertySource("classpath:application.properties")
@EntityScan("com.bananaapps.bananamusic.domain")
@EnableJpaRepositories(basePackages = {"com.bananaapps.bananamusic.persistence"})
public class SpringConfig {

}
