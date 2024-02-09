package com.bdqn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.bdqn.controller","com.bdqn.config"})
@EnableWebMvc
public class SpringMvcConfig {

}
