package com.bdqn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// @Configuration 用于标记一个类作为 Spring IoC 容器的配置类
@Configuration
@ComponentScan({"com.bdqn.service"})
// @PropertySource 读取properties文件，也能读取xml文件
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
// 事务
@EnableTransactionManagement
public class SpringConfig {
}
