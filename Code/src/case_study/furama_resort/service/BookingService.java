package case_study.furama_resort.service;

public interface BookingService extends Service {
    @Override
    void display();

    @Override
    void addNew();

    @Override
    void editService();

    void createContract();

    void displayContract();
}
