package com.zhenghe.service;


import com.zhenghe.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//@Transactional
public interface BookService {
    public boolean save(Book book);

    public boolean delete(int id);

    public boolean update(Book book);

    public List<Book> getAll();

    public Book getById(int id);
}
