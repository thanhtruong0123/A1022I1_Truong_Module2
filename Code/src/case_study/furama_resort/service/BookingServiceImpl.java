package case_study.furama_resort.service;

import case_study.furama_resort.model.Booking;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    static TreeSet<Booking> bookingList = new TreeSet<>();
    static {
        bookingList.add(new Booking("SVVL-0001", "01/01/2023", "05/01/2023", 01, "Villa A", "Qua Đêm"));
        bookingList.add(new Booking("SVVL-0002", "03/01/2023", "09/01/2023", 02, "Villa B", "Qua Đêm"));
        bookingList.add(new Booking("SVHO-0001", "03/01/2023", "22/01/2023", 03, "House A", "Qua Đêm"));
        bookingList.add(new Booking("SVRO-0001", "10/01/2023", "21/01/2023", 03, "Room A", "Qua Đêm"));
    }

    @Override
    public void display() {
        for (Booking booking : bookingList) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void editService() {

    }

    @Override
    public void createContract() {

    }

    @Override
    public void displayContract() {

    }
}
