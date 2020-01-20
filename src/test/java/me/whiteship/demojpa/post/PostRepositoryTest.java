package me.whiteship.demojpa.post;


import com.querydsl.core.types.Predicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.applet.AppletContext;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import(PostRepositoryTestConfig.class)
public class PostRepositoryTest {
    
    @Autowired
    PostRepository postRepository;

    @Test
    public void crud() {

        Post post = new Post();
        post.setTitle("hibernate");
        postRepository.save(post.publish());


        Predicate predicate = QPost.post.title.containsIgnoreCase("hibernate");
        Optional<Post> one = postRepository.findOne(predicate);

        assertThat(one).isEmpty();



    }
}