package com.abhi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.example.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springBeans.xml");
        
        Car c1=ctx.getBean("car", Car.class);
        System.out.println(c1);
    }
}
