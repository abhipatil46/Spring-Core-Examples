package com.abhi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhi.e.ApplicationConfig;
import com.abhi.e.Cart;
import com.abhi.e.Customer;
import com.abhi.e.Product;

public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(ApplicationConfig.class);
       
       Product p1=ctx.getBean("product",Product.class);
       p1.setPname("Bat");
       p1.setPrice(3000);
       
       Product p2=ctx.getBean("product",Product.class);
       p2.setPname("Shose");
       p2.setPrice(800);
       
       Product p3=ctx.getBean("product",Product.class);
       p3.setPname("Helmet");
       p3.setPrice(1000);
       
       Customer c1=ctx.getBean("customer",Customer.class);
       c1.setCusname("Abhishek");
       c1.setCusid(101);
       c1.setCity("Sangli");
       
       Cart cart1=ctx.getBean("cart",Cart.class);
       cart1.setCardid(1);
       cart1.setCustomername(c1.getCusname());
       cart1.setProducts(new String[] {p1.getPname(),p2.getPname(),p3.getPname()});
       
       System.out.println(cart1);
    }
}
