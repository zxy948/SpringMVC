package com.zhenghe.Ctrl;

import com.zhenghe.domain.Book;
import com.zhenghe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
@ResponseBody
public class BookCtrl {

    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return bookService.delete(id);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return  bookService.update(book);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable int id) {

        return bookService.getById(id);
    }


//
//    /**
//     * RequestBody:形参注解；
//     *      位于方法形参前
//     *      请求中 请求体 所包含的数据传递给请求参数
//     * @param book
//     */
//    @PostMapping()
//    public Book saveBook(@RequestBody Book book){
//        System.out.println("保存图书信息"+book);
//        return book;
//    }
//
//    @GetMapping()
//    public List<Book> getAll(){
//        System.out.println("查询全部图书");
//        List<Book> list=new ArrayList<>();
//
//        Book b1=new Book();
//        b1.setName("Book1");
//        b1.setId(1);
//        b1.setType("类型");
//        b1.setDescription("添加图书No.1");
//
//        list.add(b1);
//        System.out.println(list);
//        return list;
//    }
}

