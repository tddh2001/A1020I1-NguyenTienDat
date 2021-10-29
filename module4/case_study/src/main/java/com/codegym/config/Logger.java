package com.codegym.config;

import com.codegym.model.Log;
import com.codegym.service.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Aspect
@Component
public class Logger {
    @Autowired
    LogService logService;
    @AfterReturning("execution(public * com.codegym.service.CustomerService.*(..))")
    public void logBlog(JoinPoint joinpoint){

        String name = joinpoint.getSignature().getName();
        Date date = new Date();
        Log followLog = new Log(name, date);

        logService.save(followLog);
    }
}
