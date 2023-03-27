package case_study.furama_resort.service;

import case_study.furama_resort.model.Customer;
import case_study.furama_resort.util.TestBirthday;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static final String FILE_PATH = "D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\case_study\\furama_resort\\data\\customer.csv";
    static List<Customer> customersList;

    static {
        try {
            customersList = ReadCSV();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Customer> ReadCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        customersList = new LinkedList<>();
        String line = "";
        String temp[];

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");

            int id = Integer.parseInt(temp[0].trim());
            String name = temp[1];
            String birthday = temp[2];
            String gender = temp[3];
            String identifyNumber = temp[4];
            String phoneNumber = temp[5];
            String email = temp[6];
            String type = temp[7];
            String address = temp[8];

            customersList.add(new Customer(id, name, birthday, gender, identifyNumber, phoneNumber, email, type, address));
        }
        buff.close();
        return customersList;
    }

    public static void WriteCSV(List<Customer> customers) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);

        for (Customer e: customers) {
            buff.write(e.getId() + "," + e.getName() + "," + e.getBirthday() + "," + e.getGender() + "," + e.getIdentifyNumber() + "," + e.getPhoneNumber() + "," + e.getEmail() + "," + e.getType() + "," + e.getAddress() + "\n");
        }
        buff.close();
    }


    public void display() throws IOException {
        System.out.println(ReadCSV());
    }

    @Override
    public void addNew() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên: ");
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
        String identifyNumber = sc.nextLine();

        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();

        System.out.println("Nhập email: ");
        String email = sc.nextLine();

        System.out.println("Nhập loại khách hàng");
        String type = sc.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();

        customersList.add(new Customer(id, name, birthday, gender, identifyNumber, phoneNumber, email, type, address));
        WriteCSV(customersList);
    }

    @Override
    public void editService() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên cần sửa đổi");
        int editId = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < customersList.size(); i++) {
            if (editId == customersList.get(i).getId()) {
                System.out.println("Nhập tên: ");
                String name = sc.nextLine();
                customersList.get(i).setName(name);

                String birthday;
                do {
                    System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
                    birthday = sc.nextLine();

                    if (!TestBirthday.testBirthday(birthday)) {
                        System.out.println("Tuổi nhân viên phải > 18 và < 100");
                        System.out.println("----------------------------------");
                    }
                } while (!TestBirthday.testBirthday(birthday));
                customersList.get(i).setBirthday(birthday);

                System.out.println("Nhập giới tính: ");
                String gender = sc.nextLine();
                customersList.get(i).setGender(gender);

                System.out.println("Nhập cmnd: ");
                String identifyId = sc.nextLine();
                customersList.get(i).setIdentifyNumber(identifyId);

                System.out.println("Nhập số điện thoại: ");
                String phoneNumber = sc.nextLine();
                customersList.get(i).setPhoneNumber(phoneNumber);

                System.out.println("Nhập email: ");
                String email = sc.nextLine();
                customersList.get(i).setEmail(email);

                System.out.println("Nhập loại khách hàng");
                String type = sc.nextLine();
                customersList.get(i).setType(type);

                System.out.println("Nhập địa chỉ");
                String address = sc.nextLine();
                customersList.get(i).setAddress(address);

                WriteCSV(customersList);
            }
        }
    }
}