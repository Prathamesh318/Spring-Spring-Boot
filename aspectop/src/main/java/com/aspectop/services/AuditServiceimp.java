package com.aspectop.services;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuditServiceimp implements AuditService {

	
	Logger logger=Logger.getLogger(AuditServiceimp.class.getName());
	@Override
	@Around("execution(* com.aspectop.beans.Employee.showDetails())")
	public void AuditLogs(ProceedingJoinPoint jointPoint) throws Throwable {
		// TODO Auto-generated method stub
		//System.out.println("Hello I am a advice inside Aspect");
		
		Instant starttime=Instant.now();
		logger.info("--Audit Started"+jointPoint.getSignature().toString());
	
		
		jointPoint.proceed();
		
		Instant endTime=Instant.now();
		long duration=Duration.between(starttime, endTime).toMillis();
		logger.info("Finished at"+endTime);
		logger.info("Total time"+duration);
		logger.info("---Audit stop--"+jointPoint.getSignature().toString());	
	}
	@AfterThrowing(value="execution(* com.aspectop.beans.*.*(..))"
			,throwing="ex"
			)
	public void auditLogexception(JoinPoint joinpoint,Exception ex) {
		logger.log(Level.SEVERE,joinpoint.getSignature().toString(),"Exception happened in the code because of"+ex.getMessage());
		
	}

}
