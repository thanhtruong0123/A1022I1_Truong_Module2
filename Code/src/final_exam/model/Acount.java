package final_exam.model;

public class Acount {
    private int id;
    private String acountId;
    private String name;
    private String createDay;

    public Acount() {

    }

    public Acount(int id, String acountId, String name, String createDay) {
        this.id = id;
        this.acountId = acountId;
        this.name = name;
        this.createDay = createDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcountId() {
        return acountId;
    }

    public void setAcountId(String acountId) {
        this.acountId = acountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateDay() {
        return createDay;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }

    @Override
    public String toString() {
        return "Acount{" +
                "id=" + id +
                ", acountId='" + acountId + '\'' +
                ", name='" + name + '\'' +
                ", createDay='" + createDay + '\'' +
                '}';
    }
}
