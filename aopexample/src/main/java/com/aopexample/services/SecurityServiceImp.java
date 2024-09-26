package com.aopexample.services;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class SecurityServiceImp implements SecurityServicee {
	
	
	Logger logger=Logger.getLogger(SecurityServiceImp.class.getName());
	@Override
	@Before("execution(* com.aopexample.beans.User.show())")
	public void validateUser(){
		// TODO Auto-generated method stub
		logger.info("User Validation is started in background");
		}
	
}
