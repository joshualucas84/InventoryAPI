package spring.inventoryAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.inventoryAPI.models.ManufacturerModel;

public interface ManufacturerModelRepository extends JpaRepository<ManufacturerModel, Long> {

}
