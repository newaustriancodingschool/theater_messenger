package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.model.Project;
import at.refugeescode.theater_messenger.persistence.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectController {

    private ProjectRepository projectRepository;
    private Project project;

    public ProjectController(ProjectRepository projectRepository, Project project) {
        this.projectRepository = projectRepository;
        this.project = project;
    }

    public void addNewProject(Project project) {
        projectRepository.save(project);
    }
}
