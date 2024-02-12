package Day07;

public class Course {
    private String name;
    private int courseID;
    private int cost,duration;

    public Course(String name, int courseID, int cost, int duration) {
        this.name = name;
        this.courseID = courseID;
        this.cost = cost;
        this.duration = duration;
    }

    public Course() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void startCourse(){
        System.out.println("starting course");
    }
    public void finishCourse(){
        System.out.println("finish course");
    }
}
