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

    // Read the list of problems from problem factory
    public List<String> showProblems() {
        List<String> problems = problemFactory.createProblem();
        return problems;
    }

    // Save the message in problem repository
    public void saveMessage(String problemName, Actor actor) {
        Problem problem = new Problem();
        problem.setName(problemName);
        problem.setActor(actor);
        problemRepository.save(problem);
    }

    // Load message from problem repository
    public List<Problem> showMessage() {
        return problemRepository.findAll();
    }

    // Delete message from problem repository
    public void deleteMessage(Long problemId){
        problemRepository.deleteById(problemId);
    }
}
