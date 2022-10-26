package spring.inventoryAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.inventoryAPI.models.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
