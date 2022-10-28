package spring.inventoryAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.inventoryAPI.models.WarehouseParts;

public interface WarehousePartsRepository extends JpaRepository<WarehouseParts, Long> {
}
