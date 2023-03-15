package case_study.furama_resort.model;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floorNumber;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int floorNumber) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public Villa(String serviceName, double area, int fee, int maxPersonNum, String rentType, String roomStandard, double poolArea, int floorNumber) {
        super(serviceName, area, fee, maxPersonNum, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
