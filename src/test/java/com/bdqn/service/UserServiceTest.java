package com.bdqn.service;

import com.bdqn.config.SpringConfig;
import com.bdqn.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest extends TestCase {

    @Autowired
    private UserService userService;
    @Test
    public void testGetAll() {
        List<User> all = userService.getAll();
        System.out.println(all);
    }
}