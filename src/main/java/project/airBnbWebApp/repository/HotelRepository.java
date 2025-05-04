package project.airBnbWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.airBnbWebApp.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel , Long> {
}
