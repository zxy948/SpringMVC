package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/User")
public class userCtrl {

    @RequestMapping("/func")
    @ResponseBody
    public String func(){
        System.out.println("success");
        return "success";
//        return "{'info':'springmvc'}";

    }

}

