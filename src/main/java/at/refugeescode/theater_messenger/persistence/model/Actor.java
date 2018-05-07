package at.refugeescode.theater_messenger.persistence.model;

public class Actor {

    private String firstName;
    private String lastName;
    private String roleName;
    private Integer micNumber;
    private Integer bagNumber;
    private Integer outputGain;


    public Actor() {
    }

    public Actor(String firstName, String lastName, String roleName, Integer micNumber, Integer bagNumber, Integer outputGain) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleName = roleName;
        this.micNumber = micNumber;
        this.bagNumber = bagNumber;
        this.outputGain = outputGain;
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


    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", micNumber=" + micNumber +
                ", bagNumber=" + bagNumber +
                ", outputGain=" + outputGain +
                '}';
    }
}
