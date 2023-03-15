package case_study.furama_resort.model;

public abstract class Facility {
    private String serviceName;
    private double area;
    private int fee;
    private int maxPersonNum;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceName, double area, int fee, int maxPersonNum, String rentType) {
        this.serviceName = serviceName;
        this.area = area;
        this.fee = fee;
        this.maxPersonNum = maxPersonNum;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getMaxPersonNum() {
        return maxPersonNum;
    }

    public void setMaxPersonNum(int maxPersonNum) {
        this.maxPersonNum = maxPersonNum;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", fee=" + fee +
                ", maxPersonNum=" + maxPersonNum +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
