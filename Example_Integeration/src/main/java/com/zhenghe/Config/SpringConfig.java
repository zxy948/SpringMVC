package com.zhenghe.Config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.zhenghe.service")   //扫描service层
@PropertySource("classpath:jdbc.properties")  //读取外部资源文件
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}

