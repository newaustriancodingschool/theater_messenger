package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.model.Project;
import at.refugeescode.theater_messenger.persistence.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectController {

    private ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void addNewProject(Project project) {
        System.out.println(project);
        projectRepository.save(project);
    }

    public List<Project> showAllProjects() {
        return projectRepository.findAll();
    }

    public void removeProject(Long id) {
        projectRepository.deleteById(id);
    }

    public Optional<Project> findProject(Long id) {
        return projectRepository.findById(id);
    }
}
