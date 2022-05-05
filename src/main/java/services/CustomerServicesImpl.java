package services;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServicesImpl implements CustomerServices{
    List<Customer>customers=new ArrayList<>();
    @Override
    public List<Customer> getAllCustomer() {
//       try {
//           if (customers.isEmpty()){
//               System.out.println("Not found");
//           }else {
//               customers.forEach(System.out::println);
//           }
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
//        return customers;
        CustomerDao customerDao=new CustomerDaoImpl();
        return customerDao.getAllCustomer();
    }

    @Override
    public void addCustomer (Customer customer) {
//        try {
//            customers.add(customer);
//            System.out.println(customers);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }

    @Override
    public void searchCustomer(Customer customer) {
//        try {
//            if(customers.isEmpty()){
//                System.out.println("EMPTY!!!");
//            }else {
//                customers.forEach(t -> {
//                    if ((customer.getName()).equals(t.getName())) {
//
//                        System.out.println(t);
//
//                    } else System.out.println("not found");
//                });
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
