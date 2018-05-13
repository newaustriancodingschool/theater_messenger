package at.refugeescode.theater_messenger.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String roleName;
    private Integer micNumber;

    public Actor() {
    }

    public Actor(String firstName, String lastName, String roleName, Integer micNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleName = roleName;
        this.micNumber = micNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getMicNumber() {
        return micNumber;
    }

    public void setMicNumber(Integer micNumber) {
        this.micNumber = micNumber;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", micNumber=" + micNumber +
                '}';
    }
}
