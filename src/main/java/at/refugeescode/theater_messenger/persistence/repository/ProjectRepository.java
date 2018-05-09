package at.refugeescode.theater_messenger.persistence.repository;

import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
