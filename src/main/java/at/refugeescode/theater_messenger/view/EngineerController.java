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

    // engineer is the name of HTML file
    @GetMapping
    String page() {
        return "engineer";
    }

    // Form object
    @ModelAttribute("newProject")
    Project newProject() {
        return new Project();
    }

    // Form action
    @PostMapping
    String newProject(Project project) {
        projectController.addNewProject(project);
        return "redirect:/engineer";
    }

    @ModelAttribute("projects")
    List<Project> showProjects() {
        return projectController.showAllProjects();
    }
}
