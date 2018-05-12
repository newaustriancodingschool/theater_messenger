package at.refugeescode.theater_messenger.controller;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoundEngineer {

    // ToDO: SE can create a new project
    // ToDO: SE can edit an existing project
    // ToDo: SE can delete a project
    // ToDO: SE can send a message to SA


    private ProblemFactory problemFactory;

    public SoundEngineer(ProblemFactory problemFactory) {
        this.problemFactory = problemFactory;
    }


//    public List<String> makeProblem() {
//        List<String> problem = problemFactory.createProblem();
//        System.out.println(problem.get(0));
//        return problem;
//    }
}
