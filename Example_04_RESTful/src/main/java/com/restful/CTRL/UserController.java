package com.restful.CTRL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

//@Controller
//@ResponseBody
//以上两种简化形式如下
@RestController
@RequestMapping("/users")
public class UserController {
//    @RequestMapping(
//            value = "/users",
//            method = RequestMethod.POST
//    )简化形式如下
    @PostMapping
//    @ResponseBody
    public void save(){
        System.out.println("save...");
    }

//    @RequestMapping(method = RequestMethod.DELETE)    简化形式如下
    @DeleteMapping
//    @ResponseBody
    public void delete(){
        System.out.println("delete...");
    }

//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)     简化形式如下
    @GetMapping("/{id}")
//    @ResponseBody
    public void getById(@PathVariable Integer id){
        System.out.println("get id:"+id);

    }

}

