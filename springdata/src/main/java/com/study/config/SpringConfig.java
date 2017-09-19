package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.util.Properties;

/**
 *
 * config
 *
 * 2017/9/19-22:48
 * 2017
 * Created by wuqiang on 2017/9/19.
 */
@Configuration
@ComponentScan(basePackages = "com.study")
public class SpringConfig {

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter=new HibernateJpaVendorAdapter();
        return hibernateJpaVendorAdapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean lcemb=new LocalContainerEntityManagerFactoryBean();
        lcemb.setPersistenceUnitName("defaultPersistenceUnit");
        lcemb.setPackagesToScan("com.study.domain");


        return lcemb;
    }
}
