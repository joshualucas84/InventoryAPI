package spring.inventoryAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.inventoryAPI.models.Manufacturer;
import spring.inventoryAPI.repository.ManufacturerRepository;

import java.util.List;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author joshualucas84
 */
@RestController
@RequestMapping("/manufacturer")
public class ControllerManufacturer {
    //
    @Autowired
    ManufacturerRepository manufacturerRepository;

    @GetMapping("/getAll")
    public List<Manufacturer> all(){
         return manufacturerRepository.findAll();
    }

}
