package com.vodafone.com.BookzyBookShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BookzyBookShopApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return builder.sources(BookzyBookShopApplication.class);
    }		
	
	public static void main(String[] args) {
		SpringApplication.run(BookzyBookShopApplication.class, args);
	}
}
