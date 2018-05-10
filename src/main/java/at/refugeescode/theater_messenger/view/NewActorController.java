package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ActorController;
import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/newactor")
public class NewActorController {

    private ActorController actorController;

    public NewActorController(ActorController actorController) {
        this.actorController = actorController;
    }

    // Form object
    @ModelAttribute("newActor")
    Actor newActor(){
        return new Actor();
    }

    // Form action
    @PostMapping
    String newActor(Actor actor){
        actorController.addNewActor(actor);
        return "redirect:/newactor";
    }

    @GetMapping
    String page(){
        return "newactor";
    }
}
