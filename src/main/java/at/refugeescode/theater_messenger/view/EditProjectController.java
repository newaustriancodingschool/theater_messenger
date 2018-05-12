//package at.refugeescode.theater_messenger.view;
//
//import at.refugeescode.theater_messenger.controller.ActorController;
//import at.refugeescode.theater_messenger.controller.ProjectController;
//import at.refugeescode.theater_messenger.persistence.model.Actor;
//import at.refugeescode.theater_messenger.persistence.model.Project;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/engineer/project")
//public class EditProjectController {
//
//    private ActorController actorController;
//    private ProjectController projectController;
//
//    public EditProjectController(ActorController actorController, ProjectController projectController) {
//        this.actorController = actorController;
//        this.projectController = projectController;
//    }

    // Form object
//    @ModelAttribute("newActor")
//    Actor newActor() {
//        return new Actor();
//    }

    // Is connected to {actors} section in the editproject HTML file
//    @ModelAttribute("actors")
//    List<Actor> showActors() {
//        return actorController.showAllActors();
//    }

//    // Form action
//    @PostMapping
//    String newActor(Actor actor) {
//        actorController.addNewActor(actor);
//        return "redirect:/engineer/project/editproject";
//    }

//    @GetMapping("/{id}")
//    String page(@PathVariable Long id) {
//        actorController.removeActor(id);
//        return "redirect:/editproject";
//    }

//    @GetMapping("{id}")
//    String deleteProject(@PathVariable Long id) {
//        projectController.removeProject(id);
//        return "redirect:/editproject";
//    }
//
//
//    @GetMapping("/{id}")
//    String page(@PathVariable Long id, Model model) {
//        Optional<Project> project = projectController.findProject(id);
//        model.addAttribute("project", project.get());
//        return "editproject";
//    }
//
//}
