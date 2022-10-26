package spring.inventoryAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.inventoryAPI.models.Customer;
import spring.inventoryAPI.repository.CustomerRepository;

import java.util.List;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author joshualucas84
 */
@RestController
@RequestMapping("/customer")
public class ControllerCustomer {
    //
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/getAll")
    public List<Customer> all(){
         return customerRepository.findAll();
    }

}
