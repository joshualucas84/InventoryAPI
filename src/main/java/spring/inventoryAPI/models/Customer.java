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
@Table(name = "customer")
public class Customer {
    @Id
    private Long customer_id;
    private String name;
    private String address;
    private String phone;
    private String email;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;
    public Customer(){};
    public Customer(Long customer_id,String name, String address, String phone, String email){
        this.customer_id=customer_id;
        this.name =name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dateCreated= new Date();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {return address;}
    public void setAddress(String address) {  this.address = address;}
    public String getEmail() {return email;}
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
