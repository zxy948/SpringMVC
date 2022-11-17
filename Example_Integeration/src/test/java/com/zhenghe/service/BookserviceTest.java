package com.zhenghe.service;

import com.zhenghe.Config.SpringConfig;
import com.zhenghe.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookserviceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testgetID(){
        Book byId = bookService.getById(1);
        System.out.println(byId);
    }




}

