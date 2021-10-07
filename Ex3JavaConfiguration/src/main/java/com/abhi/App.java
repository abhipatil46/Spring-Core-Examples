package com.abhi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.example.ApplicationConfig;
import com.abhi.example.Student;
import com.abhi.example.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//XML Configuration is Used
        ApplicationContext cx=new ClassPathXmlApplicationContext("springBeans.xml");
        Student s1=cx.getBean("student", Student.class);
        
        s1.getStudent(101, "Abhishek", 85);
        System.out.println(s1);
        
        
        //By using java Annotation Configuration
        AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(ApplicationConfig.class);
        	
        Student s2=cxt.getBean("student",Student.class);
        s2.getStudent(102, "Rahul", 90);
        System.out.println(s2);
        
        Teacher t1=cxt.getBean("teacher",Teacher.class);
        t1.addTeacher("Patil", 50000);
        System.out.println(t1);
        
    }
}
