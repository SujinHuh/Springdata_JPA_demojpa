package me.whiteship.demojpa.post;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostRepositoryTestConfig {

    @Bean
    public PostLisener postLisener(){
        return new PostLisener();
    }

}
