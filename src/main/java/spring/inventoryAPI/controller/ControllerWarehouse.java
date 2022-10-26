package spring.inventoryAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.inventoryAPI.models.Warehouse;
import spring.inventoryAPI.repository.WarehouseRepository;

import java.util.List;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author joshualucas84
 */
@RestController
@RequestMapping("/warehouse")
public class ControllerWarehouse {
    //
    @Autowired
    WarehouseRepository warehouseRepository;

    @GetMapping("/getAll")
     public List<Warehouse> all(){
          return warehouseRepository.findAll();
    }

}
