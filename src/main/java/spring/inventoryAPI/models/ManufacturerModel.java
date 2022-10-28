package spring.inventoryAPI.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author Joshua Lucas
 */

@Entity
@Table(name = "manufacturer_model")
public class ManufacturerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long manufacturer_model_id;
    @OneToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
    private String name;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;
    public ManufacturerModel(){};
    public ManufacturerModel(Manufacturer manufacturer, String name){
        this.manufacturer = manufacturer;
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
