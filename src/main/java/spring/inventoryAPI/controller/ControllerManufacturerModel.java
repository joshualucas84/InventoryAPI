package spring.inventoryAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.inventoryAPI.models.ManufacturerModel;
import spring.inventoryAPI.repository.ManufacturerModelRepository;

import java.util.List;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author joshualucas84
 */
@RestController
@RequestMapping("/manufacturermodel")
public class ControllerManufacturerModel{
    //
    @Autowired
    ManufacturerModelRepository ManufacturerModelRepository;

    @GetMapping("/getAll")
    public List<ManufacturerModel> all(){
         return ManufacturerModelRepository.findAll();
    }

}
