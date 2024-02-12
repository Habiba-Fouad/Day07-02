package Day07;

public class Trainer extends Person {
    private String speciality;

    public Trainer(String name, int age, String speciality) {
        super(name, age);
        this.speciality = speciality;
    }

    public Trainer() {}

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    @Override
    public void eat() {
        System.out.println("trainer eating");
    }

    public void teach(){
        System.out.println("teaching");
    }
}
