package Class_Student;

public class Student {

    private String name;
    private String dob;
    private boolean hasStudentHousing;

     private Course course;

    public void setName(String name){
        this.name = name;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public void setStudentHousing(boolean hasStudentHousing){
        this.hasStudentHousing = hasStudentHousing;
    }
    public void setCourse(Course course){
           this.course = course;
    }
    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }
    public boolean hasStudentHousing(){
        return hasStudentHousing;
    }
    public Course getCourse(){
        return course;
    }

}
