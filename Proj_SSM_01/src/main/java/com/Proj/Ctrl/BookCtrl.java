package com.Proj.Ctrl;

import com.Proj.domain.Book;
import com.Proj.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//REST风格的Controller处理器
@RequestMapping("/books")
@ResponseBody
public class BookCtrl {

    @Autowired
    private BookService bookService;//此处报错并不影响程序运行；（因为定义的是接口类型）

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(
                flag ? Code.SAVE_OK : Code.SAVE_ERR,
                flag);
//        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR , flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR , flag);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList!=null ? Code.GET_OK : Code.GET_ERR;//判断图书是否读取成功
        String msg = bookList !=null ? "" : "数据查询失败，请重试";
//    int i=1/0;
        return new Result(code,bookList,msg);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable int id) {
        Book book = bookService.getById(id);
        Integer code = book!=null ? Code.GET_OK : Code.GET_ERR;//判断图书是否读取成功
        String msg = book !=null ? "" : "数据查询失败，请重试";

        return new Result(code,book,msg);
    }


//
//    /**
//     * RequestBody:形参注解；
//     *      位于方法形参前
//     *      请求中 请求体 所包含的数据传递给请求参数
//     *
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

