package at.refugeescode.theater_messenger.persistence.repository;

import at.refugeescode.theater_messenger.persistence.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long>{
}
