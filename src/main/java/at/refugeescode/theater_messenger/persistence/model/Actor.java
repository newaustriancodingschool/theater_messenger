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
    private Integer bagNumber;
    private Integer outputGain;

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

    public Integer getBagNumber() {
        return bagNumber;
    }

    public void setBagNumber(Integer bagNumber) {
        this.bagNumber = bagNumber;
    }

    public Integer getOutputGain() {
        return outputGain;
    }

    public void setOutputGain(Integer outputGain) {
        this.outputGain = outputGain;
    }
}
