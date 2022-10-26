package spring.inventoryAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.inventoryAPI.models.Parts;
import spring.inventoryAPI.repository.PartsRepository;

import java.util.List;
import java.util.stream.Collectors;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author joshualucas84
 */
@RestController
@RequestMapping("/parts")
public class ControllerParts {
    //
    @Autowired
    PartsRepository partsRepository;


    @GetMapping("/getQuanityOfItemsByWarehouse/{id}")
    public List<Parts> getQuanityOfItemsByWarehouse(@PathVariable("id") long id){
       // if (!tutorialRepository.existsById(tutorialId)) {
        //    throw new ResourceNotFoundException("Not found Tutorial with id = " + tutorialId);
       // }

       //TODO filter byt warehouseID
        return  partsRepository.findAll();

    }


     @GetMapping("/getAll")
    public List<Parts> all(){
         return partsRepository.findAll();
    }

}
