package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private ProjectController projectController;

    public HomeController(ProjectController projectController) {
        this.projectController = projectController;
    }

    // Form object
    @ModelAttribute("newProject")
    Project newProject(){
        return new Project();
    }
    
    // Form action
    @PostMapping
    String newProject(Project project){
        projectController.addNewProject(project);
        return "redirect:/";
    }

    @GetMapping
    String page(){
        return "home";
    }
}