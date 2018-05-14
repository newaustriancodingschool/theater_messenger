package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Project;
import at.refugeescode.theater_messenger.persistence.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProjectController {

    private ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void addNewProject(Project project) {
        projectRepository.save(project);
    }

    public List<Project> showAllProjects() {
        return projectRepository.findAll();
    }


    public Optional<Project> findProject(Long id) {
        return projectRepository.findById(id);
    }

    public Set<Actor> showAllActors(Long id) {
        Optional<Project> oProject = projectRepository.findAll().stream()
                .filter(project -> project.getId().equals(id))
                .findFirst();
        if (!oProject.isPresent()) {
            return new HashSet<>();
        }
        return oProject.get().getActors();
    }

    public List<Actor> findActorsSortByMicNumber(Long projectId) {
        return showAllActors(projectId).stream()
                .sorted(Comparator.comparing(actor -> actor.getMicNumber()))
                .collect(Collectors.toList());
    }

    public void addNewActor(Long projectId, Actor actor) {
        Project actualProject = projectRepository.findById(projectId).get();
        Set<Actor> actors = actualProject.getActors();
        actors.add(actor);
        actualProject.setActors(actors);
        projectRepository.save(actualProject);
    }

    public void deleteActor(Long projectId, Long actorId) {
        Project project = projectRepository.findById(projectId).get();
        project.setActors(project.getActors().stream()
                .filter(actor -> !actor.getId().equals(actorId))
                .collect(Collectors.toSet())
        );
        projectRepository.save(project);
    }

    public void deleteProject(Long projectId) {
        projectRepository.deleteById(projectId);
    }

    public Actor findActorBy(Long projectId, Long actorId) {
        Project project = projectRepository.findById(projectId).get();
        return project.getActors().stream()
                .filter(actor -> actor.getId().equals(actorId))
                .findFirst()
                .get();
    }

}
