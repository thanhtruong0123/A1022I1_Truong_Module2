package case_study.furama_resort.controller;

import case_study.furama_resort.service.*;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    static EmployeeService employee = new EmployeeServiceImpl();
    static CustomerService customer = new CustomerServiceImpl();
    static FacilityService facility = new FactilityServiceImpl();
    static BookingService booking = new BookingServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========MENU========");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("======================");

            try {
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        employeeManagement();
                        break;
                    case 2:
                        customerManagement();
                        break;
                    case 3:
                        facilityManagement();
                        break;
                    case 4:
                        bookingManagement();
                        break;
                    case 5:
                        promotionManagement();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Only number from 1 to 6");
                        break;
                }
            } catch(NumberFormatException e) {
                System.out.println("Only Number");
            }
        }
    }

    public static void employeeManagement() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========Employee Management========");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return main menu");
            System.out.println("======================");

            try {
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        employee.display();
                        break;
                    case 2:
                        employee.addNew();
                        break;
                    case 3:
                        employee.editService();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("Only number from 1 to 4");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void customerManagement() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========Customer Management========");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("======================");

            try {
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        customer.display();
                        break;
                    case 2:
                        customer.addNew();
                        break;
                    case 3:
                        customer.editService();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("Only number from 1 to 4");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void facilityManagement() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========Facility Management========");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("======================");

            try {
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        facility.display();
                        break;
                    case 2:
                        facility.addNew();
                        break;
                    case 3:
                        facility.maintenanceFacility();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("Only number from 1 to 4");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number");
            }
        }
    }

    public static void bookingManagement() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========Booking Management========");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("======================");

            try {
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1:
                        booking.addNew();
                        break;
                    case 2:
                        booking.display();
                        break;
                    case 3:
                        booking.createContract();
                        break;
                    case 4:
                        booking.displayContract();
                        break;
                    case 5:
                        booking.editService();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Only number from 1 to 6");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number");
            }
        }
    }

    public static void promotionManagement() {
        System.out.println("========Promotion Management========");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        System.out.println("======================");
    }
}
