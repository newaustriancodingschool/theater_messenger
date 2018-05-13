package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.controller.SoundEngineer;
import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/selectproject")
public class SelectProjectController {

    private ProjectController projectController;
    private SoundEngineer soundEngineer;

    public SelectProjectController(ProjectController projectController, SoundEngineer soundEngineer) {
        this.projectController = projectController;
        this.soundEngineer = soundEngineer;
    }

    @GetMapping(params = {"id"})
    String page(@RequestParam("id") Long id, Model model) {
        model.addAttribute("project", projectController.findProject(id).get());
        model.addAttribute("actors", projectController.showAllActors(id));
        return "selectproject";
    }

    @RequestMapping(value = "actor", params = {"projectId", "actorId"}, method = GET)
    String selectActor(@RequestParam("projectId") Long projectId, @RequestParam("actorId") Long actorId, Model model) {
        Optional<Project> project = projectController.findProject(projectId);
        model.addAttribute("project", project.get());
        model.addAttribute("actors", projectController.showAllActors(projectId));
        Actor actor = projectController.selectActor(projectId, actorId);
        System.out.println(actor);
        return "redirect:/selectproject/?id=" + projectId;
    }
    


}
