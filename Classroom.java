
import java.util.ArrayList;
 public class Classroom  {
   private  String subject;
    private int numberOfStudents;
    private ArrayList<Student> students;

    private Teacher primaryTeacher;
    private String startDate;

    public Classroom(java.lang.String subject) {
        this.subject = subject;
        this.primaryTeacher = primaryTeacher;
        students = new ArrayList<>();
    }

    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setPrimaryTeacher(Teacher primaryTeacher) {
        this.primaryTeacher = primaryTeacher;
    }

    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }

    public java.lang.String getSubject() {
        return subject;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Teacher getPrimaryTeacher() {
        return primaryTeacher;
    }

    public java.lang.String getStartDate() {
        return startDate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Classroom{" +
                "subject=" + subject +
                '}';
    }

    public void printEachStudent() {
        for(Student students : students){
            System.out.println(students);
        }
    }
}
