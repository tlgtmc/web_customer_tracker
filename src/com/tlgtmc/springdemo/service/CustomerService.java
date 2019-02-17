package com.tlgtmc.springdemo.service;

import java.util.List;

import com.tlgtmc.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomerById(int theId);

	public List<Customer> searchCustomers(String theSearchName);
	

}
