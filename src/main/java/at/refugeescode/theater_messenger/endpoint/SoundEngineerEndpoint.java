package at.refugeescode.theater_messenger.endpoint;

import at.refugeescode.theater_messenger.controller.SoundEngineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/engineer")
public class SoundEngineerEndpoint {

    private SoundEngineer soundEngineer;

    public SoundEngineerEndpoint(SoundEngineer soundEngineer) {
        this.soundEngineer = soundEngineer;
    }

    @GetMapping
    List<String> showProblem() {
        return soundEngineer.makeProblem();
    }
}
