import java.util.ArrayList;
public class Teacher extends Users {

    private String subject;
    private double salary;
    private Classroom classroom;
   private  String startDate;

    public Teacher(java.lang.String firstName, java.lang.String lastName,
                   char role, double salary,
                   java.lang.String startDate) {
        super(firstName, lastName, role);
        this.salary = salary;
        this.startDate = startDate;
    }

    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Teacher{" +
                "subject=" + subject +
                ", salary=" + salary +
                ", classroom=" + classroom +
                ", startDate=" + startDate +
                '}';
    }

    @java.lang.Override
    public void getDashboard() {
        super.getDashboard();

        System.out.println("the teacher's"+ subject);
        System.out.println("the classroom "+ classroom);
        System.out.println("the salary" +salary);

    }
}
