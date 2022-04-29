package controller;

import entity.Customer;
import services.CustomerServices;
import services.CustomerServicesImpl;

public class CustomerController
{
    CustomerServicesImpl customerServices=new CustomerServicesImpl();
    public void getAllCustomer(){
        customerServices.getAllCustomer();
    }
    public void addCustomer(Customer customer){
        customerServices.addCustomer(customer);
    }
    public void searCustomer(Customer customer){
        customerServices.searchCustomer(customer);
    }
}
