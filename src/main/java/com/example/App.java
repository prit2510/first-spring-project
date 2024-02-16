package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("cont.xml");
        student student1=(student) context.getBean("student1");
        System.out.println(student1);
        // ((AbstractApplicationContext) context).close();
    }
}
