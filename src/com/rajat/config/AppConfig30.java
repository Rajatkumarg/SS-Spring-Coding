package com.rajat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

import com.rajat.beans29.Employee;
import com.rajat.beans30.FileDataSource;
import com.rajat.beans30.MySQLDataSource;


@Configuration
@ComponentScan("com.rajat.beans30")
public class AppConfig30 {
	
	@Bean
	public FileDataSource fileSource() {
		return new FileDataSource();
	}
	
	@Bean
	@Primary
	public MySQLDataSource mysqlSource() {
		return new MySQLDataSource();
	}
}
