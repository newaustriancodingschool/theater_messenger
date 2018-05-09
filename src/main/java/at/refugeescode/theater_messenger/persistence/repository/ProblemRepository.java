package at.refugeescode.theater_messenger.persistence.repository;

import at.refugeescode.theater_messenger.persistence.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
}
