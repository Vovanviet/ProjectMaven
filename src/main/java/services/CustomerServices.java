package services;

import entity.Customer;

import java.util.List;

public interface CustomerServices {
    List<Customer> getAllCustomer();
    void addCustomer(Customer customer);
    void searchCustomer(Customer customer);

}
