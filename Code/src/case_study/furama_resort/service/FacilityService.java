package case_study.furama_resort.service;

import case_study.furama_resort.model.Facility;

public interface FacilityService extends Service {
    @Override
    void display();

    @Override
    void addNew();

    @Override
    void editService();

    void maintenanceFacility();
    void increaseFacilityUsage(Facility facility);
}