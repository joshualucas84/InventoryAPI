package spring.inventoryAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.inventoryAPI.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
