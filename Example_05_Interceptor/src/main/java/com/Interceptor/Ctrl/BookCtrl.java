package com.Interceptor.Ctrl;

import com.Interceptor.Dao.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@ResponseBody
public class BookCtrl {

    @PostMapping
    public String saveBook(Book book){
        System.out.println("savebooks");
        return "{ 'Book':'new book' }";
    }

    @GetMapping
    public String getAll(){
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }


}

