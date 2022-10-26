package spring.inventoryAPI.repository;

import io.swagger.models.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import spring.inventoryAPI.models.Parts;
import spring.inventoryAPI.models.Warehouse;

import java.util.List;

public interface PartsRepository extends JpaRepository<Parts, Long> {
List<Parts> findAllPartsByManufacturerModel(Long modelId);
//List<Parts> findModelName(Long warehouseId);

}
