package com.Proj.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.Proj.service")   //扫描service层
@PropertySource("classpath:jdbc.properties")  //读取外部资源文件
@Import({JdbcConfig.class, MybatisConfig.class})//导入配置类文件
@EnableTransactionManagement//事务
public class SpringConfig {
}

