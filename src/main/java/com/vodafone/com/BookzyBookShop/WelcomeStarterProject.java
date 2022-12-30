package com.vodafone.com.BookzyBookShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class WelcomeStarterProject {
	
	@GetMapping("/Starter")
	public String SpringStarter()
	{
        Date date = new Date();
		return "At the moment:" + date + " <h1>The library Bookzy works great.Test complete</h1>";
	}
}
