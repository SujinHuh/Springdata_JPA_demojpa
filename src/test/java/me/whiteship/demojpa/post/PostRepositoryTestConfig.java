package me.whiteship.demojpa.post;


import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostRepositoryTestConfig {

    @Bean
    public ApplicationListener<PostPublishedEvent> postLisener(){
        return event ->{
            System.out.println("===============");
            System.out.println(event.getPost().getTitle()+"is published!!");
            System.out.println("=============-=");
        };
    }

}
