package case_study.furama_resort.service;

import case_study.furama_resort.model.Employee;
import case_study.furama_resort.util.TestBirthday;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static final String FILE_PATH = "D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\case_study\\furama_resort\\data\\employee.csv";
    static List<Employee> employeeList;

    static {
        try {
            employeeList = readCSV();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Employee> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        employeeList = new ArrayList<>();
        String line = "";
        String temp[];

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");

            int id = Integer.parseInt(temp[0].trim());
            String name = temp[1];
            String birthday = temp[2];
            String gender = temp[3];
            String identifyId = temp[4];
            String phoneNumber = temp[5];
            String email = temp[6];
            String studyLevel = temp[7];
            String position = temp[8];
            int salary = Integer.parseInt(temp[9].trim());

            employeeList.add(new Employee(id, name, birthday, gender, identifyId, phoneNumber, email, studyLevel, position, salary));
        }
        buff.close();
        return employeeList;
    }

    public static void writeCSV(List<Employee> employee) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (Employee e : employee) {
            buff.write(e.getId() + "," + e.getName() + "," + e.getBirthday() + "," +
                    e.getGender() + "," + e.getIdentifyNumber() + "," + e.getPhoneNumber() + "," + e.getEmail() + "," + e.getStudyLevel() + "," + e.getPosition() + "," + e.getSalary() + "\n");
        }
        buff.close();
    }

    @Override
    public void display() throws IOException {
        System.out.println(readCSV());
    }

    @Override
    public void addNew() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        String birthday;
        do {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
            birthday = sc.nextLine();

            if (!TestBirthday.testBirthday(birthday)) {
                System.out.println("Tuổi nhân viên phải > 18 và < 100");
                System.out.println("----------------------------------");
            }
        } while (!TestBirthday.testBirthday(birthday));

        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();

        System.out.println("Nhập cmnd: ");
        String identifyId = sc.nextLine();

        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Nhập email: ");
        String email = sc.nextLine();

        System.out.println("Nhập trình độ: ");
        String studyLevel = sc.nextLine();

        System.out.println("Nhập vị trí: ");
        String position = sc.nextLine();

        System.out.println("Nhập lương: ");
        int salary = sc.nextInt();

        employeeList.add(new Employee(id, name, birthday, gender, identifyId, phoneNumber, email, studyLevel, position, salary));
        writeCSV(employeeList);
    }

    @Override
    public void editService() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên cần sửa đổi");
        int editId = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < employeeList.size(); i++) {
            if (editId == employeeList.get(i).getId()) {
                System.out.println("Nhập tên: ");
                String name = sc.nextLine();
                employeeList.get(i).setName(name);

                String birthday;
                do {
                    System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
                    birthday = sc.nextLine();

                    if (!TestBirthday.testBirthday(birthday)) {
                        System.out.println("Tuổi nhân viên phải > 18 và < 100");
                        System.out.println("----------------------------------");
                    }
                } while (!TestBirthday.testBirthday(birthday));
                employeeList.get(i).setBirthday(birthday);

                System.out.println("Nhập giới tính: ");
                String gender = sc.nextLine();
                employeeList.get(i).setGender(gender);

                System.out.println("Nhập cmnd: ");
                String identifyId = sc.nextLine();
                employeeList.get(i).setIdentifyNumber(identifyId);

                System.out.println("Nhập số điện thoại: ");
                String phoneNumber = sc.nextLine();
                employeeList.get(i).setPhoneNumber(phoneNumber);

                System.out.println("Nhập email: ");
                String email = sc.nextLine();
                employeeList.get(i).setEmail(email);

                System.out.println("Nhập trình độ: ");
                String studyLevel = sc.nextLine();
                employeeList.get(i).setStudyLevel(studyLevel);

                System.out.println("Nhập vị trí: ");
                String position = sc.nextLine();
                employeeList.get(i).setPosition(position);

                System.out.println("Nhập lương: ");
                int salary = sc.nextInt();
                employeeList.get(i).setSalary(salary);

                writeCSV(employeeList);
            }
        }
    }
}