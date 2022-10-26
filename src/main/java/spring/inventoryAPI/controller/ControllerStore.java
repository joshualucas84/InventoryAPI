package spring.inventoryAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.inventoryAPI.models.Store;
import spring.inventoryAPI.repository.StoreRepository;

import java.util.List;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author joshualucas84
 */
@RestController
@RequestMapping("/store")
public class ControllerStore {
    //
    @Autowired
    StoreRepository StoreRepository;

     @GetMapping("/getAll")
     public List<Store> all(){
         return StoreRepository.findAll();
    }

}
