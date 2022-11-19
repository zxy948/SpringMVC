package com.zhenghe.service;

import com.zhenghe.Ctrl.Code;
import com.zhenghe.Dao.BookDao;
import com.zhenghe.domain.Book;
import com.zhenghe.exception.MydoException;
import com.zhenghe.exception.bnsException;
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
        if (id == 4){
            throw new bnsException(Code.SYS_ERR,"发生错误");
        }

        try {
            int i=1/0;
        } catch (Exception e) {
            throw new MydoException(Code.SYS_TIMEOUT_ERR,"服务器错误",e);
        }
        return bookDao.getById(id);
    }
}

