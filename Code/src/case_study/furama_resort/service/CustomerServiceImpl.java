package case_study.furama_resort.service;

import case_study.furama_resort.model.Customer;
import case_study.furama_resort.model.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customersList = new LinkedList<>();
    static {
        customersList.add(new Customer(001, "Truong", "6/3/1999", "Nam","123456789", "113", "thanhtruong0123@gmail.com", "Diamond", "133 Nui Thanh"));
        customersList.add(new Customer(002, "Phi", "8/3/1999", "Nam","123456780", "112", "ngocphi@gmail.com", "Gold", "144 Tieu La" ));
        customersList.add(new Customer(003, "Lam", "7/3/1999", "Nam","123456781", "115", "dinhlam@gmail.com", "Silver", "165 Hoang Dieu"));
    }

    public void display() {
        System.out.println(customersList);
    }

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String birthday = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nhập cmnd: ");
        String identifyNumber = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập loại khách hàng");
        String type = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();

        customersList.add(new Customer(id, name, birthday, gender, identifyNumber, phoneNumber, email, type, address));
    }

    @Override
    public void editService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên cần sửa đổi");
        int editId = sc.nextInt();

        for (int i = 0; i < customersList.size(); i++) {
            if (editId == customersList.get(i).getId()) {
                int id = sc.nextInt();
                System.out.print("Nhập tên: ");
                String name = sc.nextLine();
                customersList.get(i).setName(name);
                System.out.print("Nhập ngày sinh: ");
                String birthday = sc.nextLine();
                customersList.get(i).setBirthday(birthday);
                System.out.print("Nhập giới tính: ");
                String gender = sc.nextLine();
                customersList.get(i).setGender(gender);
                System.out.print("Nhập cmnd: ");
                String identifyId = sc.nextLine();
                customersList.get(i).setIdentifyNumber(identifyId);
                System.out.print("Nhập số điện thoại: ");
                String phoneNumber = sc.nextLine();
                customersList.get(i).setPhoneNumber(phoneNumber);
                System.out.print("Nhập email: ");
                String email = sc.nextLine();
                customersList.get(i).setEmail(email);
                System.out.println("Nhập loại khách hàng");
                String type = sc.nextLine();
                customersList.get(i).setType(type);
                System.out.println("Nhập địa chỉ");
                String address = sc.nextLine();
                customersList.get(i).setAddress(address);
            }
        }
    }
}