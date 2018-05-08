package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.model.ProblemTypes;
import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.model.Project;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SoundEngineer {

    // ToDO: SE can create a new project
    // ToDO: SE can edit an existing project
    // ToDo: SE can delete a project
    // ToDO: SE can send a message to SA

    private Project project;
    private ProblemTypes problemTypes;

    public SoundEngineer(ProblemTypes problemTypes, Project project) {
        this.problemTypes = problemTypes;
        this.project = project;
    }

    public List<String> makeProblem() {
        List<String> problem = problemTypes.createProblem();
        //System.out.println(problem.get(0));
        return problem;
    }

//    public Project createProject(String string, List<Actor> actors){
//        project.setName();
//    }

}
