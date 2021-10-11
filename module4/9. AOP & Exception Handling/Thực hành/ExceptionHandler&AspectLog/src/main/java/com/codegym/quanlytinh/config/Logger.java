package com.codegym.quanlytinh.config;

import com.codegym.quanlytinh.exception.NotAvailableException;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Aspect
@Component
public class Logger {
    @AfterReturning("execution(public * com.codegym.quanlytinh.service.CustomerService.*(..))")
    public void logService(JoinPoint joinPoint){
//        String className  = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        Date date = new Date();
        System.err.println("Method is called: " + methodName+ " " + "at: "+date);
    }
}
