package spring.inventoryAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.inventoryAPI.models.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
