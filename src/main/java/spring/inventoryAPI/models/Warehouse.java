package spring.inventoryAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author Joshua Lucas
 */

@Entity
@Table(name = "warehouse")
public class Warehouse {
    @Id
    private Long warehouse_id;
    private String name;
    private String address;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "parts_id")
    private List<Parts> parts;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;
    public Warehouse(){};

    public Warehouse(Long warehouse_id ,String  name, String address){
        this.warehouse_id = warehouse_id;
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


    public List<Parts> getParts() {
        return parts;
    }

    public void setParts(List<Parts> parts) {
        this.parts = parts;
    }

    public Long getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Long warehouse_id) {
        this.warehouse_id = warehouse_id;
    }
}
