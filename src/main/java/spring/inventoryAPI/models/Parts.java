package spring.inventoryAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * @Created 10/24/22
 * @project SpringMVC
 * @Author Joshua Lucas
 */

@Entity
@Table(name = "parts")
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parts_id;
    private String name;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private Manufacturer manufacturer;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manufacturer_model_id", nullable = false)
    private ManufacturerModel manufacturerModel;
    private boolean isAvailable;

    public Parts(){};
    public Parts(  String name,
                  Manufacturer manufacturer,
                  ManufacturerModel manufacturerModel,
                  boolean available){

        this.name =name;
        this.manufacturer = manufacturer;
        this.manufacturerModel = manufacturerModel;
        this.isAvailable = available;
        this.dateCreated = new Date();
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ManufacturerModel getManufacturerModel() {
        return manufacturerModel;
    }

    public void setManufacturerModel(ManufacturerModel manufacturerModel) {
        this.manufacturerModel = manufacturerModel;
    }
}
