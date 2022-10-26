package spring.inventoryAPI.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author Joshua Lucas
 */

@Entity
@Table(name = "store")
public class Store {
    @Id
    private Long store_id;
    private String name;
    private String address;
    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;
    public Store(){};

    public Store( Long store_id,String name, String address){
       this.store_id=store_id;
        this.name =name;
        this.address= address;
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


}
