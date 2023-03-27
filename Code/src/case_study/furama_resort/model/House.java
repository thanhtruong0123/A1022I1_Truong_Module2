package case_study.furama_resort.model;

public class House extends Facility {
    private String roomStandard;
    private int floorNumber;

    public House() {
    }

    public House(String roomStandard, int floorNumber) {
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public House(String serviceId, String serviceName, double area, int fee, int maxPersonNum, String rentType, String roomStandard, int floorNumber) {
        super(serviceId, serviceName, area, fee, maxPersonNum, rentType);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tiêu Chuẩn: " + roomStandard + '\'' +
                ", Số Tầng: " + floorNumber + "\n";
    }
}
