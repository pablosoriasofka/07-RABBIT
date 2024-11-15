package co.sofka.config;

import co.sofka.data.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCustomerRepository extends JpaRepository<CustomerEntity, Long> {

    CustomerEntity findByUsername(String username);
}
