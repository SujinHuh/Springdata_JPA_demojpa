package me.whiteship.demojpa.post;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {
    
    @Autowired
    PostRepository postRepository;

    @Test
    public void crud() {

        Post post = new Post();
        post.setTitle("hibernate");

        assertThat(postRepository.contains(post)).isFalse();//객체상태: transient : JPA가 모르는 상태

        postRepository.save(post);

        assertThat(postRepository.contains(post)).isTrue();//객체상태: Persisten : JPA가 관리중인 상

        postRepository.delete(post);
        postRepository.flush();
    }
}