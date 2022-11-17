package com.zhenghe.service;

import com.zhenghe.Dao.BookDao;
import com.zhenghe.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService{
    @Autowired
    private BookDao bookDao;


    @Override
    public boolean save(Book book) {
        bookDao.save(book);

        return true;
    }

    @Override
    public boolean delete(int id) {
        bookDao.delete(id);

        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);

        return  true;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book getById(int id) {

        return bookDao.getById(id);
    }
}

