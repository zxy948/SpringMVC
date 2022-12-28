package com.Interceptor.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.Interceptor")
@EnableWebMvc
public class SpringmvcConfig{
}

