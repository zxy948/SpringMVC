package com.Proj.service;

import com.Proj.Ctrl.Code;
import com.Proj.Dao.BookDao;
import com.Proj.domain.Book;

import com.Proj.exception.MydoException;
import com.Proj.exception.bnsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService {
    @Autowired
    private BookDao bookDao;


    @Override
    public boolean save(Book book) {
        if (bookDao.save(book)!=0){
            return true;
        }else
            return false;
    }

    @Override
    public boolean delete(int id) {
        if (bookDao.delete(id)!=0){
            return true;
        }
        else return false;
    }

    @Override
    public boolean update(Book book) {
        if (bookDao.update(book)!=0){
            return  true;
        }
         else return false;
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



//        try {
////            int i=1/0;
//        } catch (Exception e) {
//            throw new MydoException(Code.SYS_TIMEOUT_ERR,"服务器错误",e);
//        }
        return bookDao.getById(id);
    }
}

