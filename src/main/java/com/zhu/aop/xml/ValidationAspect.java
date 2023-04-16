package com.zhu.aop.xml;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class ValidationAspect {

    public void validateArgs(JoinPoint joinPoint) {
        System.out.println("-->validate:" + Arrays.asList(joinPoint.getArgs()));
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        if ((int) args[1] == 0) {
            System.out.println("The method" + methodName + "的除数为0");
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
    }
}