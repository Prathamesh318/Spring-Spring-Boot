package com.aspectop.services;

import java.util.logging.Level;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.JoinPoint;

public interface AuditService {
	
	public void AuditLogs(ProceedingJoinPoint jointPoint) throws Throwable;
	public void auditLogexception(JoinPoint joinpoint,Exception ex) ;
		

}
