public class Admin {
    public static void main(String[] args){
        StudentProfile Akash = new StudentProfile(16011013,"akash","SE",3.75 );
        StudentProfile Shiv = new StudentProfile(160110103,"shiv","SE",3.85 );
        Akash.increaseGpa();
        System.out.println(Akash.gpa);
    }
}
