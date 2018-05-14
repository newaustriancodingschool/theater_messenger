package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProjectController;
import at.refugeescode.theater_messenger.controller.SoundEngineer;
import at.refugeescode.theater_messenger.persistence.model.Actor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/createmessage")
public class CreateMessageController {

    private ProjectController projectController;
    private SoundEngineer soundEngineer;

    public CreateMessageController(ProjectController projectController, SoundEngineer soundEngineer) {
        this.projectController = projectController;
        this.soundEngineer = soundEngineer;
    }

    // Display the create message page
    @GetMapping(params = {"projectId"})
    String page(@RequestParam("projectId") Long projectId, @RequestParam(value = "success", required = false, defaultValue = "false") Boolean success, Model model) {
        model.addAttribute("projectId", projectId);
        model.addAttribute("actors", projectController.findActorsSortByMicNumber(projectId));
        if (success) {
            model.addAttribute("success", true);
        }
        return "createmessage";
    }

    // Display the problems button
    @ModelAttribute("problems")
    List<String> showProblems() {
        return soundEngineer.showProblems();
    }

    // Create and save the message in Problem repository
    @PostMapping(params = {"problem", "actorId", "projectId"})
    String createMessage(@RequestParam("projectId") Long projectId, @RequestParam("actorId") Long actorId, @RequestParam("problem") String problem, RedirectAttributes redirectAttributes) {

        // Find the Actor
        Actor actor = projectController.findActorBy(projectId, actorId);

        // Save problem in info DB
        soundEngineer.saveProblem(problem, actor);

        // Flash the success Message when the message has been created
        redirectAttributes.addFlashAttribute("success", true);

        // Redirect to the current page
        return "redirect:/createmessage/?projectId=" + projectId + "&success";
    }

}
