package spring.inventoryAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.inventoryAPI.models.Manufacturer;

public interface ManufacturerRepository  extends JpaRepository<Manufacturer, Long> {
}
