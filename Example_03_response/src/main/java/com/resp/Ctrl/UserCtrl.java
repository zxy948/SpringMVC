package com.resp.Ctrl;

import com.resp.Dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/User")
public class UserCtrl {

    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "index.jsp";
    }

    /**
     * @ResponseBody
     *  表名在方法或类上
     *  设置当前控制器返回值作为响应体，
     *
     *  类：该类所有方法都有该注解的功能
     *      属性：pattern 指定日期时间格式字符串
     *  方法：
     *      方法返回值喂字符串，会将其作为文本内容直接相应给前端
     *      方法返回值为对象，会将对象转换成JSON响应给前端
     *
     *  类型转换：通过OCnvert接口实现，所有Convert功能还可以实现：
     *      1.对象 -> JSON （POJO-> Json）
     *      2.集合 -> Json  (Collection -> Json)
     */

    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回传文本数据");
        return "response text";
    }

    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");

        User user=new User();
        user.setName("username");
        user.setAge(25);
        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json对象数据");

        User user=new User();
        user.setName("username");
        user.setAge(25);

        User user1 = new User();
        user1.setName("Mike");
        user1.setAge(85);

        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user1);

        return list;
    }

}

