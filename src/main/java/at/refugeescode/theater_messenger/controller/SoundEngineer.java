package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.logic.ProblemFactory;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SoundEngineer {

    // ToDO: SE should be able to create a new project

    // ToDO: SE should be able to edit an existing project

    // ToDo: SE

    private ProblemFactory problemFactory;

    public SoundEngineer(ProblemFactory problemFactory) {
        this.problemFactory = problemFactory;
    }

    public List<String> makeProblem() {
        List<String> problem = problemFactory.createProblem();
        //System.out.println(problem.get(0));
        return problem;
    }
}
