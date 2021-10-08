package com.abhi.e;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {
	@Bean(name="customer")
	public Customer getCustomer() {
		return new Customer();
	}
	@Bean(name="product")
	@Scope("prototype")
	public Product getProduct() {
		return new Product();
	}
	@Bean(name="cart")
	public Cart getCart() {
		return new Cart();
	}
}
