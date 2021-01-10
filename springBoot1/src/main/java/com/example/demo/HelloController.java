package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@RequestMapping("hello")
	public String Hello() {
		return "Hello SpringBoot!";
	}
	
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","hello freemarker");
        return "index";
    }


}
