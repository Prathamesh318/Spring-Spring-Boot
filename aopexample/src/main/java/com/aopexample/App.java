package com.aopexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopexample.beans.User;
import com.aopexample.config.Config;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
    	User u=context.getBean(User.class);
    	u.show();
    	
    }
}
