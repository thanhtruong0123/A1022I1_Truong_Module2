package case_study.furama_resort.model;

public class Booking {
    private int bookingId;
    private String beginDay;
    private String endDay;
    private int customerId;
    private String serviceName;
    private String typeService;

    public Booking() {
    }

    public Booking(int bookingId, String beginDay, String endDay, int customerId, String serviceName, String typeService) {
        this.bookingId = bookingId;
        this.beginDay = beginDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.typeService = typeService;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(String beginDay) {
        this.beginDay = beginDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", beginDay='" + beginDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerId=" + customerId +
                ", serviceName='" + serviceName + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }
}
