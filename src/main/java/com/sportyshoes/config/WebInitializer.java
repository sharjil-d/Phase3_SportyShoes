package com.sportyshoes.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(SpringJDBCConfig.class);;
		context.setServletContext(servletContext);
		ServletRegistration.Dynamic dispatcher=servletContext.addServlet("DispatcherServlet",new DispatcherServlet(context));
		//any non zero value makes that dispatcher to load at that time to start
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
	

}
