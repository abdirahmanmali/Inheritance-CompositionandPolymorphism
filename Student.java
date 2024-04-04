import java.util.ArrayList;
public class Student extends Users {
   private  double gpa;
    private ArrayList<Classroom> classes;
   private  String startDate;

    public Student(java.lang.String firstName, java.lang.String lastName, char role,
                   java.lang.String startDate) {
        super(firstName, lastName, role);
        this.classes = classes;
        this.startDate = startDate;
        classes= new ArrayList<>();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setClasses(ArrayList<Classroom> classes) {
        this.classes = classes;
    }

    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }

    public double getGpa() {
        return gpa;
    }

    public ArrayList<Classroom> getClasses() {
        return classes;
    }

    public java.lang.String getStartDate() {
        return startDate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{"   +
                "Firstname= '" + getFirstName()  + '\'' +
                " lastname = '" + getLastName()  + '\'' +
                '}';
    }

    @java.lang.Override
    public void getDashboard() {
        super.getDashboard();
        System.out.println("GPA:" + gpa);
        System.out.println("Classes :"  );
        for(Classroom classroom : classes){
            System.out.println(classroom.getSubject());
        }
    }

}
