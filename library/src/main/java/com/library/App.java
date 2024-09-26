package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.beans.Library;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        Library lib=context.getBean(Library.class);
        lib.showBooks();
    }
}
