package spring.inventoryAPI.repository;
//TODO would be rmoved for PROD just for testinf

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import spring.inventoryAPI.models.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Component
public class LoadTables implements ApplicationRunner {

    private ManufacturerRepository manufacturerRepository;
    private ManufacturerModelRepository manufacturerModelRepository;
    private WarehouseRepository warehouseRepository;
    private CustomerRepository customerRepository;
    private PartsRepository partsRepository;
    private StoreRepository storeRepository;



    @Autowired
    public LoadTables(ManufacturerRepository manufacturerRepository,
                      ManufacturerModelRepository manufacturerModelRepository,
                      WarehouseRepository warehouseRepository,
                      CustomerRepository customerRepository,
                      PartsRepository partsRepository,
                      StoreRepository storeRepository) {

        this.manufacturerRepository = manufacturerRepository;
        this.manufacturerModelRepository = manufacturerModelRepository;
        this.warehouseRepository = warehouseRepository;
        this.customerRepository = customerRepository;
        this.partsRepository = partsRepository;
        this.storeRepository = storeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Load manufacture table

        Manufacturer chevy = new Manufacturer(1L,"chevy");
        manufacturerRepository.save(chevy);
        ManufacturerModel chevyAlternator  = new ManufacturerModel(1L,chevy,"alternator");
        manufacturerModelRepository.save(chevyAlternator);
        ManufacturerModel chevyBattery  = new ManufacturerModel(2L,chevy,"battery");
        manufacturerModelRepository.save(chevyBattery);

        Manufacturer ford = new Manufacturer(2L,"ford");
        manufacturerRepository.save(ford);
        ManufacturerModel fordAlternator  = new ManufacturerModel(3L,ford,"alternator");
        manufacturerModelRepository.save(fordAlternator);
        ManufacturerModel fordBattery  = new ManufacturerModel(4L,ford,"battery");
        manufacturerModelRepository.save(fordBattery);

        Warehouse warehouse1= new Warehouse(1L,"Warehouse1", "Alabama");
        Warehouse warehouse2 =new Warehouse(2L,"Warehouse2", "Georgia");

        warehouseRepository.save( warehouse1 );
        warehouseRepository.save( warehouse2 );

        //load parts
        Parts part1 = new Parts(1L,"Altenator", chevy,chevyAlternator , warehouse1 ,false);
        Parts part2 =new Parts(2L,"Battery", chevy,chevyBattery, warehouse2,true);
        Parts part3 =new Parts(3L,"Altenator", ford,fordAlternator, warehouse1,true);
        Parts part4 =new Parts(4L,"Battery", ford,fordBattery, warehouse2,true);

         List<Parts> partsList = new ArrayList<>();
        partsList.add(part1);
        partsList.add(part2);
        partsList.add(part3);
        partsList.add(part4);
        warehouse1.setParts(partsList);
        warehouse2.setParts(partsList);
        part1.setWarehouse(warehouse1);
        part2.setWarehouse(warehouse2);
        part3.setWarehouse(warehouse1);
        part4.setWarehouse(warehouse2);
        partsRepository.save( part1 );
        partsRepository.save( part2 );



        // load WStore
        storeRepository.save( new Store(1L,"Store1", "Alabama"));
        storeRepository.save( new Store(2L,"Store2", "Georgia"));

        //load Customer's
        customerRepository.save( new Customer(1L,"Jason", "Alabama","1234","abc@you.com"));
        customerRepository.save( new Customer(2L,"Josh", "Alabama","5674","abc@you.com"));

    }
}
