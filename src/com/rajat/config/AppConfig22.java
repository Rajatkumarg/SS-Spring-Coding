package com.rajat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.rajat.beans22")
@PropertySource("classpath:/com/rajat/resources/properties22.properties")
public class AppConfig22 {

}
