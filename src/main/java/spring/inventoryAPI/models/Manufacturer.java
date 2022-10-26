package spring.inventoryAPI.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author Joshua Lucas
 */

@Entity
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
   // @GeneratedValue(strategy=GenerationType.AUTO)
    private Long manufacturer_id;
    private String name;
    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;

    public Manufacturer(){};

    public Manufacturer(Long manufacturer_id,String name){
        this.manufacturer_id = manufacturer_id;
        this.name = name;
        this.dateCreated= new Date();
    }



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
