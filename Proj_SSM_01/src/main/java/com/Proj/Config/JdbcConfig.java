package com.Proj.Config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;



public class JdbcConfig {
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;

    /**
     * 第三方数据资源配置类
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource=new DruidDataSource();

        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        return dataSource;
    }

    /**
     * 事务管理
     * @param dataSource
     * @return
     */
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource){
         DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
         transactionManager.setDataSource(dataSource);

        return transactionManager;
    }
}

