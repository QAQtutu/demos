package com.qaqtutu.jpah2;

import com.qaqtutu.jpah2.entity.User;
import com.qaqtutu.jpah2.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaH2ApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
        User user = new User();
        user.setName("admin");

        userRepository.save(user);

        System.out.println(userRepository.findAll());

    }

}
