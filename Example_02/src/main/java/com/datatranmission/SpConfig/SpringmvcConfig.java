package com.datatranmission.SpConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.datatranmission.springController")
@EnableWebMvc
public class SpringmvcConfig {
}

