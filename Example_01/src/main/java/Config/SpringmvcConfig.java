package Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan("Controller")
//排除指定Controller类的方式1：
//@ComponentScan( value = "Controller",
//                excludeFilters = @ComponentScan.Filter( //排除过滤器
//                        type = FilterType.ANNOTATION,   //排除的方式：通过注解()
//                        classes = Controller.class      //排除的注解，注解的类型写在这里
//                )
//)
public class SpringmvcConfig {
}

