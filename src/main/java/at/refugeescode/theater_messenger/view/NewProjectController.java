package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/newproject")
public class NewProjectController {

    private ProjectController projectController;

    public NewProjectController(ProjectController projectController) {
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
        return "redirect:/newproject";
    }
}
