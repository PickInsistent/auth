package com.sunrise.auth;

import com.sunrise.auth.dao.UserMapper;
import com.sunrise.auth.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LiZhanPing on 2017/8/27.
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class BaseJunit4Test {

    @Autowired
    private UserMapper userDao;

    @Test
    public void testMybatis(){
        User user = userDao.selectByPrimaryKey(1L);
        System.out.println("user = " + user.getName());
    }
}
