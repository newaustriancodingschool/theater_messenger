package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/editproject")
public class EditProjectController {

    private ProjectController projectController;

    public EditProjectController(ProjectController projectController) {
        this.projectController = projectController;
    }

    // Display the edit project page
    @GetMapping(params = {"projectId"})
    String page(@RequestParam("projectId") Long id, Model model) {
        model.addAttribute("project", projectController.findProject(id).get());
        model.addAttribute("actors", projectController.showAllActors(id));
        return "editproject";
    }

    // Create new actor object
    @ModelAttribute("newActor")
    Actor newActor() {
        return new Actor();
    }

    // Add a new Actor in Project repository
    @PostMapping("/{projectId}")
    String newActor(@PathVariable Long projectId, Actor actor) {
        projectController.addNewActor(projectId, actor);
        return "redirect:/editproject/?projectId=" + projectId;
    }

    // Delete Actor from Project repository
    @GetMapping(value = "actor", params = {"projectId", "actorId"})
    String deleteActor(@RequestParam("projectId") Long projectId, @RequestParam("actorId") Long actorId, Model model) {
        Optional<Project> project = projectController.findProject(projectId);
        model.addAttribute("project", project.get());
        model.addAttribute("actors", projectController.showAllActors(projectId));
        projectController.deleteActor(projectId, actorId);
        return "redirect:/editproject/?projectId=" + projectId;
    }

    // Delete Project from Project repository
    @GetMapping(value = "project", params = {"projectId"})
    String deleteProject(@RequestParam("projectId") Long projectId, Model model) {
        Optional<Project> project = projectController.findProject(projectId);
        model.addAttribute("project", project.get());
        model.addAttribute("actors", projectController.showAllActors(projectId));
        projectController.deleteProject(projectId);
        return "redirect:/engineer";
    }
}