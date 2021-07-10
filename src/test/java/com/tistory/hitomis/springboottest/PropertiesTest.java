package com.tistory.hitomis.springboottest;

import com.tistory.hitomis.springboottest.controller.BoardController;
import com.tistory.hitomis.springboottest.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BoardController.class,
        properties = {"author.name=jojo",
                "author.email=hanmail",
                "author.age=22",
                "author.nation=korea"})
public class PropertiesTest {

    @Autowired
    Environment environment;

    @Test
    public void testMethod() {
        System.out.println(environment.getProperty("author.name"));
        System.out.println(environment.getProperty("author.email"));
        System.out.println(environment.getProperty("author.age"));
        System.out.println(environment.getProperty("author.nation"));

    }
}
