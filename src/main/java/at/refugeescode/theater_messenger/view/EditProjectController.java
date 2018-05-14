package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/editproject")
public class EditProjectController {

    private ProjectController projectController;

    public EditProjectController(ProjectController projectController) {
        this.projectController = projectController;
    }

    @GetMapping(params = {"projectId"})
    String page(@RequestParam("projectId") Long id, Model model) {
        model.addAttribute("project", projectController.findProject(id).get());
        model.addAttribute("actors", projectController.showAllActors(id));
        return "editproject";
    }

    @ModelAttribute("newActor")
    Actor newActor() {
        return new Actor();
    }

    @PostMapping("/{projectId}")
    String newActor(@PathVariable Long projectId, Actor actor) {
        projectController.addNewActor(projectId, actor);
        return "redirect:/editproject/?projectId=" + projectId;
    }

    @RequestMapping(value = "actor", params = {"projectId", "actorId"}, method = GET)
    String deleteActor(@RequestParam("projectId") Long projectId, @RequestParam("actorId") Long actorId, Model model) {
        Optional<Project> project = projectController.findProject(projectId);
        model.addAttribute("project", project.get());
        model.addAttribute("actors", projectController.showAllActors(projectId));
        projectController.deleteActor(projectId, actorId);
        return "redirect:/editproject/?projectId=" + projectId;
    }

    @RequestMapping(value = "project", params = {"projectId"}, method = GET)
    String deleteProject(@RequestParam("projectId") Long projectId, Model model) {
        Optional<Project> project = projectController.findProject(projectId);
        model.addAttribute("project", project.get());
        model.addAttribute("actors", projectController.showAllActors(projectId));
        projectController.deleteProject(projectId);
        return "redirect:/engineer";
    }
}