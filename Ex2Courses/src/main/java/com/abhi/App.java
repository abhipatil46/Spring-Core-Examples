package com.abhi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.example.Courses;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cx= new ClassPathXmlApplicationContext("springBeans.xml");
       
       Courses c1=cx.getBean("course", Courses.class);
       c1.addCourse(101, "Java", 6, "Java Certification");
       System.out.println(c1);
       
       ((AbstractApplicationContext)cx).close();
       
    }
}
