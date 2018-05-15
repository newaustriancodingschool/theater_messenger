package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProblemController;
import at.refugeescode.theater_messenger.persistence.model.Problem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/assistant")
public class AssistantController {

    private ProblemController problemController;

    public AssistantController(ProblemController problemController) {
        this.problemController = problemController;
    }

    @GetMapping
    String page() {
        return "assistant";
    }

    @ModelAttribute("messages")
    List<Problem> showMessage(){
        return problemController.showMessage();
    }

    @GetMapping("/{id}")
    String removeProblem(@PathVariable Long id){
        problemController.deleteProblem(id);
        return "redirect:/assistant";
    }
}
