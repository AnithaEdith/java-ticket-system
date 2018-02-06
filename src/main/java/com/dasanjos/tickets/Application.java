package com.dasanjos.tickets;

import com.dasanjos.tickets.validator.TicketRequestValidator;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Properties;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


   /* @Bean
    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean registration = new ServletRegistrationBean(
                dispatcherServlet);
        registration.addUrlMappings("*.htm");
        registration.setLoadOnStartup(1);

        return registration;
    }*/

/*
    @Bean
    public static PropertyPlaceholderConfigurer placeHolderConfigurer() {
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer=new PropertyPlaceholderConfigurer();
        Properties properties=new Properties();
        properties.setProperty("users","org.apache.catalina.UserDatabase");
        propertyPlaceholderConfigurer.setProperties(properties);
        return new PropertyPlaceholderConfigurer();
    }
*/

    @Bean
    public TicketRequestValidator ticketRequestValidator(){
      return  new TicketRequestValidator();
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }
}