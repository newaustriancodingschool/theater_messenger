package at.refugeescode.theater_messenger.persistence.repository;

import at.refugeescode.theater_messenger.persistence.model.Problem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProblemRepository extends MongoRepository<Problem, String> {
}
