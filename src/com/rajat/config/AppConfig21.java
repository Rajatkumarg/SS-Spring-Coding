package com.rajat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.rajat.beans21")
@PropertySource("classpath:/com/rajat/resources/properties21.properties")
public class AppConfig21 {

}
