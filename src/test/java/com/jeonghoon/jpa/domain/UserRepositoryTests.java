package com.jeonghoon.jpa.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * Created By Jeonghoon on 2018-10-17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EntityManager em;

    User user;

    @Before
    public void setup() {
        user = User.builder()
                .id("jeonghoon")
                .description("I am jeonghoon")
                .build();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void 기본_저장() {
        userRepository.save(user);
        user.setId("hoony");
        userRepository.save(user);

        User target = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        System.out.println(target.getId());
    }

    @Test
    @Transactional
    public void persist() {
        userRepository.save(user);
        user.setId("hoony");
        em.persist(user);
        em.flush();

        User target = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        System.out.println(target.getId());
    }
}
