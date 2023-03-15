package case_study.furama_resort.model;

public class Employee extends Person {
   private String studyLevel;
   private String position;
   private int salary;

   public Employee() {
   }

    public Employee(String studyLevel, String position, int salary) {
        this.studyLevel = studyLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String birthday, String gender, String identifyNumber, String phoneNumber, String email, String studyLevel, String position, int salary) {
        super(id, name, birthday, gender, identifyNumber, phoneNumber, email);
        this.studyLevel = studyLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(String studyLevel) {
        this.studyLevel = studyLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "studyLevel='" + studyLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
