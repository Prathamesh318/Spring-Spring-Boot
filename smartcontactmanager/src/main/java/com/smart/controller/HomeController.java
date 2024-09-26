package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.Entities.Contact;
import com.smart.Entities.User;
import com.smart.dao.UserRepository;
import com.smart.helper.Message;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class HomeController {
		@Autowired
		UserRepository userRepository;

//		@ResponseBody
		@GetMapping("/")
		public String Home(Model m) {
			m.addAttribute("title","Home-Smart Contact Manager");
		
			return "home";
		}
		
		@GetMapping("/about")
		public String about(Model m) {
			m.addAttribute("title","About-Smart Contact Manager");
		
			return "about";
		}
		@RequestMapping("/signup")
		public  String signup(Model m) {
			
			m.addAttribute("title","SignUp-Smart Contact Manager");
			m.addAttribute("user", new User());			
			return "signup";
		}
		
		//this is a handler for registering user
		
		@PostMapping("/register")
		public String registerUser(@Valid @ModelAttribute("user") User user,BindingResult result1,
				@RequestParam(value="agreement",defaultValue = "false") Boolean agreement,
				Model model,
				HttpSession httpsession) {
			
		try {
			if(!agreement) {
				
				System.out.println("You have not agreed the terms and condition");
				throw new Exception("You have not agreed the terms and condition");
			}
			if(result1.hasErrors()) {
				
				System.out.println("Error"+result1.toString());
				model.addAttribute("user", user);
				return "signup";
			}
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			user.setImageUrl("default.png");
			User result=userRepository.save(user);
			System.out.println("Saved user"+result.toString());
			System.out.println("Agreement"+agreement);
			System.out.println("User"+user.toString());
		
			
			model.addAttribute("user",new User());
			httpsession.setAttribute("message",new Message("Successfully Registered","alert-success"));
			
			return "signup";
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("user",user);
			httpsession.setAttribute("message",new Message("Something went wrong"+e.getMessage(),"alert-danger"));
			return "signup";
		}
		}
		
}
