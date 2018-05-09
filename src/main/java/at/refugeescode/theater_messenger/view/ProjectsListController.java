package at.refugeescode.theater_messenger.view;

import at.refugeescode.theater_messenger.persistence.model.Project;
import at.refugeescode.theater_messenger.persistence.repository.ProjectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectsListController {

    private ProjectRepository projectRepository;

    public ProjectsListController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


}
