public class StudentProfile {
    int enrollment_number;
    String name;
    String dept;
    Double gpa;

    public StudentProfile(int enrollment_number,
                          String name,
                          String dept,
                          Double gpa){
        this.enrollment_number = enrollment_number;
        this.name = name;
        this.dept = dept;
        this.gpa =  gpa;
    }
    public void increaseGpa(){
        gpa = gpa*1.05;
    }
}
