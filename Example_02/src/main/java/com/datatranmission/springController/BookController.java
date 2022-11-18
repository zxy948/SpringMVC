package com.datatranmission.springController;

import com.datatranmission.Domain.Book;
import com.datatranmission.Domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/book")
public class BookController {

//    @RequestMapping("/book/save")
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam("bookName") String name, String type)
//    public String save(String bookName,String type)
    {
        System.out.println("普通参数传递==>"+name);
        System.out.println("普通参数传递==>"+type);
//        return "success";
        return "{'book':'save'}";
    }

    /**
     * POJO类型传递
     * @param book
     * @return
     */
    @RequestMapping("/sell")
    @ResponseBody
    public String save(Book book){
        System.out.println("普通参数传递==>"+book);
        return "{'book':'sell'}";
    }

    /**
     * POJO嵌套引用
     * @param book
     * @return
     * 普通参数传递==>Book{bookName='book-name', user= User name= Mike、 age= 0 , type='book-type'}
     */
    @RequestMapping("/nesting")
    @ResponseBody
    public String nesting(Book book){
        System.out.println("普通参数传递==>"+book);
        return "{'book':'nesting'}";
    }

    /**
     * 数组类型传递
     * @param arr
     * @return
     */
    @RequestMapping("/arr")
    @ResponseBody
    public String arr(String[] arr){
        System.out.println("普通参数传递==>"+ Arrays.toString(arr));
        return "{'book':'arr'}";
    }

    /**
     * 集合类型传递:
     *  若不加@RequestParams则会将List当作POJO对象进行实例化
     * @ERROR 报错：java.lang.NoSuchMethodException: java.util.List.<init>()
     *
     * @param list
     *
     */
    @RequestMapping("/Listdata")
    @ResponseBody
    public String Listdata(@RequestParam List<String> list ){

        System.out.println("普通参数传递==>"+ list);

        return "{'book':'arr'}";
    }

    /**
     * 客户端输入内容为：
     *      key：usermap["hello"].name
     *      value：Jerry
     *
     *      key：usermap["hello"].age
     *      value：21
     * @param book
     */
    @RequestMapping("/Mapdata")
    @ResponseBody
    public void Mapdata(Book book){
        Map<String, User> usermap = book.getUsermap();
        System.out.println(usermap);

        Set<String> strings = usermap.keySet();
        for (String um:strings){
            User user = usermap.get(um);
            System.out.println(user.getName());
            System.out.println(user.getAge());
        }
    }


    //集合参数：json格式
    //1.开启json数据格式的自动转换，在配置类中开启@EnableWebMvc
    //2.使用@RequestBody注解将外部传递的json数组数据映射到形参的集合对象中作为数据
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("list common(json)参数传递 list ==> "+likes);
        return "{'module':'list common for json param'}";
    }

    //POJO参数：json格式
    //1.开启json数据格式的自动转换，在配置类中开启@EnableWebMvc
    //2.使用@RequestBody注解将外部传递的json数据映射到形参的实体类对象中，要求属性名称一一对应
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody Book book){
        System.out.println("pojo(json)参数传递 user ==> "+book);
        return "{'module':'pojo for json param'}";
    }

    //集合参数：json格式
    //1.开启json数据格式的自动转换，在配置类中开启@EnableWebMvc
    //2.使用@RequestBody注解将外部传递的json数组数据映射到形参的保存实体类对象的集合对象中，要求属性名称一一对应
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("list pojo(json)参数传递 list ==> "+list);
        return "{'module':'list pojo for json param'}";
    }

    //日期参数
    //使用@DateTimeFormat注解设置日期类型数据格式，默认格式yyyy/MM/dd
    @RequestMapping("/dataParam")
    @ResponseBody
    public String dataParam(Date date,
                            @DateTimeFormat(pattern="yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern="yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println("参数传递 date ==> "+date);
        System.out.println("参数传递 date1(yyyy-MM-dd) ==> "+date1);
        System.out.println("参数传递 date2(yyyy/MM/dd HH:mm:ss) ==> "+date2);
        return "{'module':'data param'}";
    }


}

