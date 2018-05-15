package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Problem;
import at.refugeescode.theater_messenger.persistence.repository.ProblemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemController {

    private ProblemFactory problemFactory;
    private ProblemRepository problemRepository;

    public ProblemController(ProblemFactory problemFactory, ProblemRepository problemRepository) {
        this.problemFactory = problemFactory;
        this.problemRepository = problemRepository;
    }

    public List<String> showProblems() {
        List<String> problems = problemFactory.createProblem();
        return problems;
    }

    public void saveProblem(String problemName, Actor actor) {
        Problem problem = new Problem();
        problem.setName(problemName);
        problem.setActor(actor);
        problemRepository.save(problem);
    }

    public List<Problem> showMessage() {
        return problemRepository.findAll();
    }

    public void deleteProblem(Long problemId){
        problemRepository.deleteById(problemId);
    }
}
