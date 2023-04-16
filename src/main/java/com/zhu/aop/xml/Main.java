package com.zhu.aop.xml;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: Main
 * @date: 2023/4/16 13:30
 * @author: zdp
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
        Calculator calculator = (Calculator) ctx.getBean("calculator");
        System.out.println(calculator.getClass().getName());
        int result = calculator.add(1, 2);
        System.out.println(result);

        result = calculator.div(1000, 0);
        System.out.println(result);
    }
}
