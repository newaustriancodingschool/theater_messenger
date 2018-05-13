package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Project;
import at.refugeescode.theater_messenger.persistence.repository.ProjectRepository;
import org.apache.el.stream.Stream;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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

    public Set<Actor> showAllActors() {
        return projectRepository.findAll().stream()
                .findFirst().get().getActors();
//                .filter(project -> project.getId().equals(id)).findFirst().get().getActors();
    }


//    public void addNewActor(Actor actor) {
////        Optional<Project> actualProject = projectRepository.findById(projectId);
////        project.setActors();
//        projectRepository.save(project);
//
//    }
}
