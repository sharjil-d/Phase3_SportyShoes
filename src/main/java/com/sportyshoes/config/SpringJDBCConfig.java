package com.sportyshoes.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


	@Configuration
	@ComponentScan("com.sportyshoes")
	public class SpringJDBCConfig {
		@Bean
		public JdbcTemplate getJdbcTemplate() {
				DriverManagerDataSource dataSource=new DriverManagerDataSource();
				dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
				dataSource.setUrl("jdbc:mysql://localhost:3306/phase3Sportyshoes");
				dataSource.setUsername("root");
				dataSource.setPassword("Sanjay@007");
				JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
				return jdbcTemplate;
				
				
		}
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
		
		

	}