package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class @Controller
 * @author jguyet
 */
@Controller
public class NavigationController {
	
	/**
	 * On request to / call this method for search view
	 * @return
	 */
	@RequestMapping("/")
    public String home(){
        return "example";
    }
}
