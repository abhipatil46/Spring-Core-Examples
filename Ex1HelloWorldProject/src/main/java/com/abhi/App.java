package com.abhi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.example.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cx= new ClassPathXmlApplicationContext("springBeans.xml");
    	
    	HelloWorld h12=(HelloWorld) cx.getBean("h1");
    	
    	h12.showMessage();
    }
}
