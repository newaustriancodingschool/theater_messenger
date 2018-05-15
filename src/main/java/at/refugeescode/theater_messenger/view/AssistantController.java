package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.ProblemController;
import at.refugeescode.theater_messenger.persistence.model.Problem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/assistant")
public class AssistantController {

    private ProblemController problemController;

    public AssistantController(ProblemController problemController) {
        this.problemController = problemController;
    }

    // Display the assistant page
    @GetMapping
    String page() {
        return "assistant";
    }

    // Show messages on assistant page
    @ModelAttribute("messages")
    List<Problem> showMessage() {
        return problemController.showMessage();
    }

    // Remove the fixed problem from Problem repository
    @GetMapping("/{id}")
    String removeProblem(@PathVariable Long id) {
        problemController.deleteMessage(id);
        return "redirect:/assistant";
    }
}
