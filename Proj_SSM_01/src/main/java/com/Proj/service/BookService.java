package com.Proj.service;
import com.Proj.domain.Book;

import java.util.List;
//@Transactional
public interface BookService {
    public boolean save(Book book);

    public boolean delete(int id);

    public boolean update(Book book);

    public List<Book> getAll();

    public Book getById(int id);
}
