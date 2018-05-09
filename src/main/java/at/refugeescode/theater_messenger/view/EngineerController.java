package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.controller.SoundEngineer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/engineer")
public class EngineerController {

    private SoundEngineer soundEngineer;

    public EngineerController(SoundEngineer soundEngineer) {
        this.soundEngineer = soundEngineer;
    }

    @ModelAttribute("problems")
    List<String> showProblems() {
        return soundEngineer.makeProblem();
    }

    @GetMapping
    List<String> problem() {
        return soundEngineer.makeProblem();
    }

//    @GetMapping
//    String page() {
//        return "engineer";
//    }

}
