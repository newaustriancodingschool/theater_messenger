package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ActorController;
import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.persistence.model.Actor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/editproject")
public class EditProjectController {

    private ActorController actorController;

    public EditProjectController(ActorController actorController) {
        this.actorController = actorController;
    }

    // Form object
    @ModelAttribute("newActor")
    Actor newActor() {
        return new Actor();
    }

    // Is connected to {actors} section in the editproject HTML file
    @ModelAttribute("actors")
    List<Actor> showActors() {
        return actorController.showAllActors();
    }

    // Form action
    @PostMapping
    String newActor(Actor actor) {
        actorController.addNewActor(actor);
        return "redirect:/editproject";
    }

    @GetMapping("{id}")
    String deleteActor(@PathVariable Long id) {
        actorController.removeActor(id);
        return "redirect:/editproject";
    }

    @GetMapping
    String page() {
        return "editproject";
    }

}
