package com.vodafone.com.BookzyBookShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BookzyBookShopApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BookzyBookShopApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BookzyBookShopApplication.class);
    }	

}
