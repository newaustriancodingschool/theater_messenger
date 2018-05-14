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


    @GetMapping(params = {"projectId"})
    String page(@RequestParam("projectId") Long projectId, @RequestParam(value = "success", required = false, defaultValue = "false") Boolean success, Model model) {
        model.addAttribute("projectId", projectId);
        model.addAttribute("actors", projectController.findActorsSortByMicNumber(projectId));
        if (success) {
            model.addAttribute("success", true);
        }
        return "createmessage";
    }


    @ModelAttribute("problems")
    List<String> showProblems() {
        return soundEngineer.showProblems();
    }

    @PostMapping(params = {"problem", "actorId", "projectId"})
    String saveMessage(@RequestParam("projectId") Long projectId, @RequestParam("actorId") Long actorId, @RequestParam("problem") String problem, RedirectAttributes redirectAttributes) {
        System.out.println("problem = " + problem);
        System.out.println("actorId = " + actorId);
        System.out.println("projectId = " + projectId);

        // save in info DB
        Actor actor = projectController.selectActor(projectId, actorId);
        soundEngineer.saveProblem(problem, actor);

//        redirectAttributes.addAttribute("projectId", projectId);
//        redirectAttributes.addAttribute("actors", actor);
//        redirectAttributes.addAttribute("actors", projectController.findActorsSortByMicNumber(projectId));
        redirectAttributes.addFlashAttribute("success", true);
        return "redirect:/createmessage/?projectId=" + projectId + "&success";
    }


//
//    @PostMapping("/{projectId}")
//    String newProblem(@PathVariable Long projectId, Problem problem) {
////        Long problemId = problem.getId();
////        String problemName = problem.getName();
////        soundEngineer.addNewProblem(problemName, problemId);
//        System.out.println(projectId);
//        System.out.println(problem);
//        return "redirect:/createmessage/?id=" + projectId;
//    }


//    @RequestMapping(value = "actor", params = {"projectId", "actorId"}, method = GET)
//    String selectActor(@RequestParam("projectId") Long projectId, @RequestParam("actorId") Long actorId, Model model) {
//        Optional<Project> project = projectController.findProject(projectId);
//        model.addAttribute("project", project.get());
//        model.addAttribute("actors", projectController.showAllActors(projectId));
//        Actor actor = projectController.selectActor(projectId, actorId);
//        soundEngineer.saveActor(actor);
//        return "redirect:/createmessage/?id=" + projectId + "&actorId=" + actorId;
//    }

    //    @GetMapping(params = {"id"})
//    String page(@RequestParam("id") String d, Model model) {
//        System.out.println("d = " + d);
//        // model add for actors
//
//
//        model.addAttribute("b",d);
//        return "createmessage";
//    }


}
