package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.controller.SoundEngineer;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/engineer")
public class EngineerController {

    private ProjectController projectController;

    public EngineerController(ProjectController projectController) {
        this.projectController = projectController;
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

    @GetMapping("/editproject/{id}")
    String editProject(@RequestParam Long id) {
        projectController.findProject(id);
        return "redirect:/editproject";
    }


    // engineer is the name of HTML file
    @GetMapping
    String page() {
        return "engineer";
    }

}
