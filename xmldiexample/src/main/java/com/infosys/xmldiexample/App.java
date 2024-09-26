package com.infosys.xmldiexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.xmldiexample.beans.Batch;
import com.infosys.xmldiexample.beans.Trainer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
      Trainer trainer1=context.getBean(Trainer.class);
      
      System.out.println(trainer1.getTrainerName());
      
      System.out.println(10*trainer1.getTrainerId());
      
      Batch batch10=context.getBean(Batch.class);
      
      batch10.showBatchDetails();
      
    }
}
