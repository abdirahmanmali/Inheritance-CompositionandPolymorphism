import java.util.ArrayList;
public class Admin extends Users {
    private String title;
    private double salary;
    private String startDate;

    public Admin(java.lang.String firstName, java.lang.String lastName, char role, java.lang.String title,
                 double salary, java.lang.String startDate) {
        super(firstName, lastName, role);
        this.title = title;
        this.salary = salary;
        this.startDate = startDate;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public java.lang.String getStartDate() {
        return startDate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Admin{" +
                "title=" + title +
                ", salary=" + salary +
                ", startDate=" + startDate +
                '}';
    }

    @java.lang.Override
    public void getDashboard() {
        super.getDashboard();
        System.out.println("\"displaying dashboard for administrator\"");

    }
}
