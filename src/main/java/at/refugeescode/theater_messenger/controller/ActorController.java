package at.refugeescode.theater_messenger.controller;

import at.refugeescode.theater_messenger.persistence.model.Actor;
import at.refugeescode.theater_messenger.persistence.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorController {

    private ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public void addNewActor(Actor actor) {
        actorRepository.save(actor);
    }

    public List<Actor> showAllActors() {
        return actorRepository.findAll();
    }

    public void removeActor(Long id) {
        actorRepository.deleteById(id);
    }
}
