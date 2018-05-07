package at.refugeescode.theater_messenger.persistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Problem {

    @Id
    private String id;
    private String name;
    private Actor actor;


    public Problem() {
    }

    public Problem(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Problem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
