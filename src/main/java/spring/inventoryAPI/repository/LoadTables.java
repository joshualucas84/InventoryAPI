package spring.inventoryAPI.repository;
//TODO would be rmoved for PROD just for testinf

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import spring.inventoryAPI.models.*;

import java.util.*;

@Component
public class LoadTables implements ApplicationRunner {

    private ManufacturerRepository manufacturerRepository;
    private ManufacturerModelRepository manufacturerModelRepository;
    private WarehouseRepository warehouseRepository;
    private PartsRepository partsRepository;
    private WarehousePartsRepository warehousePartsRepository;
    private CustomerRepository customerRepository;

    private StoreRepository storeRepository;



    @Autowired
    public LoadTables(ManufacturerRepository manufacturerRepository,
                      ManufacturerModelRepository manufacturerModelRepository,
                      WarehouseRepository warehouseRepository,
                      CustomerRepository customerRepository,
                      PartsRepository partsRepository,
                      StoreRepository storeRepository,
                      WarehousePartsRepository warehousePartsRepository) {

        this.manufacturerRepository = manufacturerRepository;
        this.manufacturerModelRepository = manufacturerModelRepository;
        this.warehouseRepository = warehouseRepository;
        this.customerRepository = customerRepository;
        this.partsRepository = partsRepository;
        this.storeRepository = storeRepository;
        this.warehousePartsRepository = warehousePartsRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Load manufacture table

        Manufacturer chevy = new Manufacturer("chevy");
        manufacturerRepository.save(chevy);
        ManufacturerModel chevyAlternator  = new ManufacturerModel(chevy,"alternator");
        manufacturerModelRepository.save(chevyAlternator);
        ManufacturerModel chevyBattery  = new ManufacturerModel(chevy,"battery");
        manufacturerModelRepository.save(chevyBattery);

        Manufacturer ford = new Manufacturer("ford");
        manufacturerRepository.save(ford);
        ManufacturerModel fordAlternator  = new ManufacturerModel(ford,"alternator");
        manufacturerModelRepository.save(fordAlternator);
        ManufacturerModel fordBattery  = new ManufacturerModel(ford,"battery");
        manufacturerModelRepository.save(fordBattery);



        Warehouse warehouse1= new Warehouse("Warehouse1", "Alabama");
        Warehouse warehouse2 =new Warehouse("Warehouse2", "Georgia");

        warehouseRepository.save( warehouse1 );
        warehouseRepository.save( warehouse2 );
        //load parts
        Parts part1 = new Parts("Altenator", chevy,chevyAlternator , false);
        Parts part2 =new Parts("Battery", chevy,chevyBattery, true);
        Parts part3 =new Parts("Altenator", ford,fordAlternator, true);
        Parts part4 =new Parts("Battery", ford,fordBattery, true);
        partsRepository.save( part1);
        partsRepository.save( part2);
        partsRepository.save(part3);
        partsRepository.save(part4);

        WarehouseParts warehouseParts = new WarehouseParts(warehouse1, part1);
        WarehouseParts warehouseParts1 = new WarehouseParts(warehouse1, part2);
        WarehouseParts warehouseParts2 = new WarehouseParts(warehouse1, part3);
        WarehouseParts warehouseParts3 = new WarehouseParts(warehouse1, part4);
        WarehouseParts warehouseParts4 = new WarehouseParts(warehouse2, part1);
        WarehouseParts warehouseParts5 = new WarehouseParts(warehouse2, part2);
        WarehouseParts warehouseParts6 = new WarehouseParts(warehouse2, part3);
        WarehouseParts warehouseParts7 = new WarehouseParts(warehouse2, part4);

         warehousePartsRepository.save(warehouseParts);
         warehousePartsRepository.save(warehouseParts1);
         warehousePartsRepository.save(warehouseParts2);
         warehousePartsRepository.save(warehouseParts3);
         warehousePartsRepository.save(warehouseParts4);
         warehousePartsRepository.save(warehouseParts5);
         warehousePartsRepository.save(warehouseParts6);
         warehousePartsRepository.save(warehouseParts7);

        // load WStore
        storeRepository.save( new Store("Store1", "Alabama"));
        storeRepository.save( new Store("Store2", "Georgia"));

        //load Customer's
        customerRepository.save( new Customer("Jason", "Alabama","1234","abc@you.com"));
        customerRepository.save( new Customer("Josh", "Alabama","5674","abc@you.com"));

    }
}
