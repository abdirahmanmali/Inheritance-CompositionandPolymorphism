public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("Abdirahman ", "Ali",'A', "administrator", 650000,"02-28-2024");

        Student student1 = new Student("waryaa", "warey",'S',"02-28-2024" );
        Student student2 = new Student("john", "legend",'S',"02-28-2024" );
        Student student3 = new Student("smith", "legend",'S',"02-28-2024" );
        //
        student1.setGpa(3.6);
        student1.getClasses().add(new Classroom("java"));
        student1.getClasses().add(new Classroom("Science"));
//
        student2.setGpa(4.0);
        student2.getClasses().add(new Classroom("history"));
        student2.getClasses().add(new Classroom("math"));
//
        student3.setGpa(4.0);
        student3.getClasses().add(new Classroom("english"));
        student3.getClasses().add(new Classroom("chem"));
//
        Teacher teacher1 = new Teacher("farhad", "software", 'T', 65000, "02-28-2024");

        teacher1.setSubject("English");
        teacher1.setClassroom(new Classroom("English" ));

        Teacher teacher2 = new Teacher("britney", "yellow ", 'T',
                65000, "02-28-2024");
        teacher2.setSubject("Math");
        teacher2.setClassroom(new Classroom( "math"));

        Teacher teacher3 = new Teacher("lady", "bagg ", 'T',
                65000, "02-28-2024");
        teacher3.setSubject("science");
        teacher3.setClassroom(new Classroom("science"));

        System.out.println("Admin: " + admin);
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        System.out.println("Teacher 1: " + teacher1);
        System.out.println("Teacher 2: " + teacher2);
        System.out.println("Teacher 3: " + teacher3);

        System.out.println("\nDashboard for Admin:");
        admin.getDashboard();

        System.out.println("\nDashboard for Student 1:");
        student1.getDashboard();

        System.out.println("\nDashboard for Teacher 1:");
        teacher1.getDashboard();












    }
}