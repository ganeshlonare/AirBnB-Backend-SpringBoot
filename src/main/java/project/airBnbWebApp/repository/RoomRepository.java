package project.airBnbWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.airBnbWebApp.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room , Long> {
}
