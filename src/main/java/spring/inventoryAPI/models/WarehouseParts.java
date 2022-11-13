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
@Table(name = "warehouse_parts")
public class WarehouseParts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long warehouse_parts_id;
    @OneToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
    @OneToOne
    @JoinColumn(name = "parts_id")
    private Parts parts;

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;
    public Warehouse getWarehouse() {
        return warehouse;
    }
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    public WarehouseParts(){};
    public WarehouseParts(Warehouse warehouse, Parts parts){
        this.warehouse = warehouse;
         this.parts = parts;
    }
}
