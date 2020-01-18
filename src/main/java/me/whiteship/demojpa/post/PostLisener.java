package me.whiteship.demojpa.post;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import sun.applet.AppletEvent;
import sun.applet.AppletListener;

public class PostLisener {

    @EventListener
    public void onApplicationEvent(PostPublishedEvent event) {

        System.out.println("===============");
        System.out.println(event.getPost().getTitle()+"is published!!");
        System.out.println("=============-=");
    }
}
