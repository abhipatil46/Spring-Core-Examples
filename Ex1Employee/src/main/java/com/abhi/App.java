package com.abhi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.exmple.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cx= new ClassPathXmlApplicationContext("springBean.xml");
       
       Employee e1=cx.getBean("emp",Employee.class);
       e1.addEmployee(101, "Abhishek", 50000);
       e1.showEmployee();
       
       
    }
}
