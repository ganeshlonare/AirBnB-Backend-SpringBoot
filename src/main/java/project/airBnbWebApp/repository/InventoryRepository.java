package project.airBnbWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.airBnbWebApp.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory , Long> {
}
