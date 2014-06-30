package com.moecode;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.ServletContext;

@Configuration
@ComponentScan("com.moecode.mvc")
@EnableWebMvc
public class AppConfig {

    @Autowired
    ServletContext servletContext;

    @Bean(name = "jspViewResolver")
    public ViewResolver getJspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(2);
        return resolver;
    }

    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.parameterName("mediaType").
                defaultContentType(MediaType.APPLICATION_JSON).
                mediaType("html", MediaType.TEXT_HTML).
                mediaType("json", MediaType.APPLICATION_JSON);
    }
}
