package case_study.furama_resort.service;

public interface BookingService extends Service {
    void creatContract();
    void displayContract();
    void editContract();

    @Override
    void display();

    @Override
    void addNew();

    @Override
    void editService();
}
