package case_study.furama_resort.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceId, String serviceName, double area, int fee, int maxPersonNum, String rentType, String freeService) {
        super(serviceId, serviceName, area, fee, maxPersonNum, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Dịch Vụ Miễn Phí: " + freeService + "\n";
    }
}
