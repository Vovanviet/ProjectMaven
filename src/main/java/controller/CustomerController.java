package controller;

import dao.CustomerDaoImpl;
import entity.Customer;
import services.CustomerServices;
import services.CustomerServicesImpl;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class CustomerController
{
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)

    public void getAllCustomer(){
        CustomerDaoImpl customerDao=new CustomerDaoImpl();
        customerDao.getAllCustomer();
    }
    @POST
    @Path("/post")
    @Produces(MediaType.APPLICATION_JSON)
    public void addCustomer(Customer customer){
        CustomerDaoImpl customerDao=new CustomerDaoImpl();
        customerDao.addCustomer(customer);
    }
    @GET
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON)
    public void searCustomer(Customer customer){
        CustomerDaoImpl customerDao=new CustomerDaoImpl();
        customerDao.searchCustomer(customer);
    }
}
