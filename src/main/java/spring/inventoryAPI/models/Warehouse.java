package spring.inventoryAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author Joshua Lucas
 */

@Entity
@Table(name = "warehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long warehouse_id;
    private String name;
    private String address;

    @OneToMany
    @JoinColumn(name = "warehouse_parts_id")
    private Set<WarehouseParts> warehouseParts = new HashSet<>();
    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;
    public Warehouse(){};

    public Warehouse(String  name, String address){

        this.name = name;
        this.address = address;

        this.dateCreated = new Date();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Set<WarehouseParts> getWareHouseParts() {
        return this.warehouseParts;
    }

    public void addWarehousePart(WarehouseParts warehouseParts) {
        if(warehouseParts !=null){
            // warehouseParts.setWarehouse(this);
            this.warehouseParts.add(warehouseParts);
        }
    }

    public void setWareHouseParts(Set<WarehouseParts> WarehouseParts) {
        for (WarehouseParts warehouseParts: WarehouseParts
        ) {
            this.addWarehousePart(warehouseParts);

        }
    }

    public Long getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Long warehouse_id) {
        this.warehouse_id = warehouse_id;
    }
}
