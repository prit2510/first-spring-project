package com.example.refrencType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
    ApplicationContext context=new ClassPathXmlApplicationContext("com/example/refrencType/config.xml");
    A temp=context.getBean("aref",A.class);
    System.out.println(temp.getX());    
    System.out.println(temp.getOb().getY());    
    System.out.println(temp);
}
}
