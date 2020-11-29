package com.xoste.leon.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Xoste
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo = applicationContext.getBean("demo", Demo.class);
        try {
            demo.demo1();
        } catch (Exception e) {
//            e.printStackTrace();
        }
        demo.demo2();
        demo.demo3();
    }
}
