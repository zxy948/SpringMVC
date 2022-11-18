package com.datatranmission.springController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserCtroller {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("save user");
//        return "success";
        return "{'user':'save'}";

    }

}

