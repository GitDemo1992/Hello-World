package Class_Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        //student.course = new Course();

        student.setName("Karthick");
        student.setDob("07/02/1991");
        student.setStudentHousing(true);

        student.setCourse(new Course());
        student.getCourse().setLevel("UG");
        student.getCourse().setTitle("Computer Science");
        student.getCourse().setStartDate("19/12/2022");
        /*
        Student student2 = new Student();
        student2.setName("Rathi");
        student2.setDob("13/11/1990");
        student2.setStudentHousing(false);
        */
        System.out.println("Name: " + student.getName());
        System.out.println("Dob: " + student.getDob());
        System.out.println("isStudentHousing: " + (student.hasStudentHousing() ? "yes" : "no" ));

        System.out.printf("The student %s has enrolled the course %s that is due to start on %s",student.getName(),student.getCourse().getTitle(),student.getCourse().getStartDate());
    }
}
