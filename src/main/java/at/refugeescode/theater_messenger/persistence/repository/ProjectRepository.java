package at.refugeescode.theater_messenger.persistence.repository;

import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
