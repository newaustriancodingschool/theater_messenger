package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/engineer")
public class EngineerController {

    private ProjectController projectController;

    public EngineerController(ProjectController projectController) {
        this.projectController = projectController;
    }

    // Display the engineer page
    @GetMapping
    String page() {
        return "engineer";
    }

    // Create new project object
    @ModelAttribute("newProject")
    Project newProject() {
        return new Project();
    }

    // Add new project
    @PostMapping
    String newProject(Project project) {
        projectController.addNewProject(project);
        return "redirect:/engineer";
    }

    // Show existing projects
    @ModelAttribute("projects")
    List<Project> showProjects() {
        return projectController.showAllProjects();
    }
}
