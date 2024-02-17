package com.example.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("com/example/collections/collectionconfig.xml");
        emp emp1=(emp) context.getBean("emp1");
        System.out.println(emp1.grtName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getaddresses());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getProps());
    }
}
