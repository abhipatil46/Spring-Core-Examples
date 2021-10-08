package com.abhi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.example.Employee;
import com.abhi.example.Maneger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c1=new ClassPathXmlApplicationContext("springBeans.xml");
        
//        Employee e1=c1.getBean("emp",Employee.class);
        Maneger m=c1.getBean("man",Maneger.class);
        System.out.println(m);
    }
}
