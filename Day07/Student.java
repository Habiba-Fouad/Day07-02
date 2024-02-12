package Day07;

public class Student extends Person {
    private int studentID;
    private Course[] course;

    public Student(String name, int age,int studentID,Course[] course) {
        super(name, age);
        this.studentID=studentID ;
        this.course = course;
    }

    public Student() {}

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public void eat() {
        System.out.println("student eating");
    }
}
