package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve been from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call methods on the bean
        System.out.println(theCoach.getDailWorkout());
        //close the context
        context.close();
    }
}
