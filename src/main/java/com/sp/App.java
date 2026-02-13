package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac =new ClassPathXmlApplicationContext("com/sp/hello.xml");

    	Student so1 = (Student) ac.getBean("s1");
        Student so2 = (Student) ac.getBean("s2");
    	System.out.println(so1);
        System.out.println(so2);

    }
}
