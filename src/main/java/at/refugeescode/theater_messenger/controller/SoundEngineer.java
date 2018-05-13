package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Problem;
import at.refugeescode.theater_messenger.persistence.repository.ProblemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoundEngineer {

    private ProblemFactory problemFactory;
    private ProblemRepository problemRepository;
//    private Problem problem = new Problem();

    public SoundEngineer(ProblemFactory problemFactory, ProblemRepository problemRepository) {
        this.problemFactory = problemFactory;
        this.problemRepository = problemRepository;
    }

    public List<String> showProblems() {
        List<String> problems = problemFactory.createProblem();
        System.out.println(problems);
        return problems;
    }


//    public void saveActor(Actor actor) {
//        problem.setActor(actor);
//        Problem savedActor = problemRepository.save(problem);
//        System.out.println("savedActor:" + savedActor);
//    }

    public void saveActor(Actor actor, Long problemId) {
        Problem problem = problemRepository.findById(problemId).get();
        problem.setActor(actor);
        Problem savedActor = problemRepository.save(problem);
        System.out.println("savedActor:" + savedActor);
    }

    public void addNewProblem(String problemName, Long problemId) {
        Problem problem = problemRepository.findById(problemId).get();
        problem.setName(problemName);
        Problem savedProblem = problemRepository.save(problem);
        System.out.println("savedProblem:" + savedProblem);
    }

}
