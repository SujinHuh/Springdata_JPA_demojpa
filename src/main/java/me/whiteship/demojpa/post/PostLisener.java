package me.whiteship.demojpa.post;

import org.springframework.context.ApplicationListener;
import sun.applet.AppletEvent;
import sun.applet.AppletListener;

public class PostLisener implements ApplicationListener<PostPublishedEvent> {

    @Override
    public void onApplicationEvent(PostPublishedEvent event) {

        System.out.println("===============");
        System.out.println(event.getPost().getTitle()+"is published!!");
        System.out.println("=============-=");
    }
}
