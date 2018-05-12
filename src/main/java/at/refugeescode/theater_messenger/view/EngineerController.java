package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.controller.SoundEngineer;
import at.refugeescode.theater_messenger.persistence.model.Project;
import at.refugeescode.theater_messenger.persistence.repository.ProjectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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




//    @PostMapping(value = "/editproject",params = "projectId")
//    String editProject(@RequestParam Long projectId) {
//        projectController.findProject(projectId);
//        System.out.println(projectId);
//        return "redirect:/editproject";
//    }

//    Project project = new Project();
//
//    @ModelAttribute("p")
//    Project editParticipant(){
//        return  project;
//    }

//    @PostMapping("update")
//    String goedit(@RequestParam String id ){
//
//        Optional<Project> oldProject = projectRepository.findAll().stream()
//                .filter(project -> project.getId().toString().equalsIgnoreCase(id))
//                .findFirst();
//        project =oldProject.get();
//        return "redirect:/edit";
//    }
//
//    @GetMapping("/edit")
//    String page6(){
//        return "edit";
//    }


}
