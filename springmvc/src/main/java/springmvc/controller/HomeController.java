package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is a view");
		
		model.addAttribute("name","prathamesh veer");
		
		List<String> friends=new ArrayList<String>();
		
		friends.add("Shruti");
		friends.add("Prathamesh");
		friends.add("Shantanuu");
		model.addAttribute("f", friends);
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is a view");
		
		return "about";
	}

	@RequestMapping("/help")
	public String help() {
		
		System.out.println("hello this is help");
		return "help";
	}
	@RequestMapping("/demo")
	public ModelAndView demo() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "Damon");
		modelAndView.setViewName("demo");
		return  modelAndView;
	}
}
