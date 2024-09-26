package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Modal.Trainer;

@Controller
public class TrainerController {

	@GetMapping("/home")
	public String home() {
		
		return "Home";
	}
	
	@GetMapping("/")
	@ResponseBody
	public String main() {
		return "Welcome to home";
	}
	
	@GetMapping("/signup")
	public String SignupPage() {
		return "SignUp";
	}
	
	@PostMapping("/signupdetails")
	public void signupInfo(Trainer t) {
		System.out.println("Trainer Name:"+t.getTrainerName());
		System.out.println("Trainer Email:"+t.getTrainerEmail());
		System.out.println("Trainer Password:"+t.getTrainerPass());
		System.out.println("Trainer experience:"+t.getExp());
	}
	
	
}
