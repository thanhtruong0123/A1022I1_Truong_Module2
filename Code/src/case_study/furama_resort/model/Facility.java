package case_study.furama_resort.model;

import java.util.Objects;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double area;
    private int fee;
    private int maxPersonNum;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, double area, int fee, int maxPersonNum, String rentType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.fee = fee;
        this.maxPersonNum = maxPersonNum;
        this.rentType = rentType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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
        return  "Mã Dịch Vụ: " + serviceId +
                "Tên Dịch Vụ: " + serviceName +
                ", Diện Tích: " + area +
                ", Giá: " + fee +
                ", Số Người Tối Đa: " + maxPersonNum +
                ", Loại Thuê: " + rentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return serviceName.equals(facility.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName);
    }
}