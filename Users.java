
import java.util.ArrayList;
public class Users {

    private String firstName;
    private String lastName;
    private char role;

    public Users(java.lang.String firstName, java.lang.String lastName, char role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public void setRole(char role) {
        this.role = role;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public char getRole() {
        return role;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Users{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", role=" + role +
                '}';
    }
    public void getDashboard(){
        System.out.println("displaying dashboard for user");
    }
}
