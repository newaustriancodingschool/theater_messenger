package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.repository.ProblemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoundEngineer {

    private ProblemFactory problemFactory;
    private ProblemRepository problemRepository;

    public SoundEngineer(ProblemFactory problemFactory, ProblemRepository problemRepository) {
        this.problemFactory = problemFactory;
        this.problemRepository = problemRepository;
    }

    public List<String> makeProblem() {
        List<String> problem = problemFactory.createProblem();
        System.out.println(problem.get(0));
        return problem;
    }


}
