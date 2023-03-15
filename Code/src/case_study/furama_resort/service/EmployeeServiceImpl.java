package case_study.furama_resort.service;

import case_study.furama_resort.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee(001, "Truong", "6/3/1999", "Nam","123456789", "113", "thanhtruong0123@gmail.com", "Dai Hoc", "Giam Doc", 1000000));
        employeeList.add(new Employee(002, "Phi", "8/3/1999", "Nam","123456780", "112", "ngocphi@gmail.com", "Dai Hoc", "Nhan vien", 1000));
        employeeList.add(new Employee(003, "Lam", "7/3/1999", "Nam","123456781", "115", "dinhlam@gmail.com", "Cao Dang", "Nhan vien", 1000));
    }

    @Override
    public void display() {
        System.out.println(employeeList);
    }

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        int id = sc.nextInt();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String birthday = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nhập cmnd: ");
        String identifyId = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        System.out.print("Nhập trình độ: ");
        String studyLevel = sc.nextLine();
        System.out.print("Nhập vị trí: ");
        String position = sc.nextLine();
        System.out.print("Nhập lương: ");
        int salary = sc.nextInt();

        employeeList.add(new Employee(id, name, birthday, gender, identifyId, phoneNumber, email, studyLevel, position, salary));
    }

    @Override
    public void editService() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên cần sửa đổi");
        int editId = sc.nextInt();

        for (int i = 0; i < employeeList.size(); i++) {
            if (editId == employeeList.get(i).getId()) {
                int id = sc.nextInt();
                System.out.print("Nhập tên: ");
                String name = sc.nextLine();
                employeeList.get(i).setName(name);
                System.out.print("Nhập ngày sinh: ");
                String birthday = sc.nextLine();
                employeeList.get(i).setBirthday(birthday);
                System.out.print("Nhập giới tính: ");
                String gender = sc.nextLine();
                employeeList.get(i).setGender(gender);
                System.out.print("Nhập cmnd: ");
                String identifyId = sc.nextLine();
                employeeList.get(i).setIdentifyNumber(identifyId);
                System.out.print("Nhập số điện thoại: ");
                String phoneNumber = sc.nextLine();
                System.out.print("Nhập email: ");
                String email = sc.nextLine();
                System.out.print("Nhập trình độ: ");
                String studyLevel = sc.nextLine();
                System.out.print("Nhập vị trí: ");
                String position = sc.nextLine();
                System.out.print("Nhập lương: ");
                int salary = sc.nextInt();

            }
        }
    }
}
