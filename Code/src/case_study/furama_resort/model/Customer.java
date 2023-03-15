package case_study.furama_resort.model;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public Customer(int id, String name, String birthday, String gender, String identifyNumber, String phoneNumber, String email, String type, String address) {
        super(id, name, birthday, gender, identifyNumber, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
