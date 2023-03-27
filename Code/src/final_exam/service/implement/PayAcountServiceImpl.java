package final_exam.service.implement;

import final_exam.model.PayAcount;
import final_exam.model.SaveAcount;
import final_exam.service.PayAcountService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayAcountServiceImpl implements PayAcountService {
    private static final String FILE_PATH = "D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\final_exam\\data\\pay_acounts.csv";
    static List<PayAcount> payAcountList;

    static {
        try {
            payAcountList = readCSV();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<PayAcount> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        payAcountList = new ArrayList<>();
        String line = "";
        String temp[];

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");

            int id = Integer.parseInt(temp[0].trim());
            String acountId = temp[1];
            String name = temp[2];
            String createDay = temp[3];
            String cardNumber = temp[4];
            Long money = (long) Integer.parseInt(temp[5].trim());
            payAcountList.add(new PayAcount(id, acountId, name, createDay, cardNumber, money));
            // PayAcount(int id, String acountId, String name, String createDay, String cardNumber, long money)
        }
        buff.close();
        return payAcountList;
    }

    public static void writeCSV(List<PayAcount> payAcounts) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (PayAcount e : payAcounts) {
            buff.write(e.getId() + "," + e.getAcountId() + "," + e.getName() + "," + e.getCreateDay() + "," + e.getCardNumber() + "," + e.getMoney() + "\n");
        }
        buff.close();
    }
    @Override
    public void addNew() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id:");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập mã tài khoản");
        String acountId = sc.nextLine();

        System.out.println("Nhập tên chủ tài khoản");
        String name = sc.nextLine();

        System.out.println("Nhập ngày tạo tài khoản");
        String createDay = sc.nextLine();

        System.out.println("Nhập số thẻ");
        String cardNumber = sc.nextLine();

        System.out.println("Nhập số tiền trong tài khoản");
        long money = Integer.parseInt(sc.nextLine());

        payAcountList.add(new PayAcount(id, acountId, name, createDay, cardNumber, money));
        writeCSV(payAcountList);
    }

    @Override
    public void delete() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id cần xóa");
        int deleteId = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < payAcountList.size(); i++) {
            if (deleteId == payAcountList.get(i).getId()) {
                payAcountList.remove(i);
                writeCSV(payAcountList);
            }
        }
    }

    @Override
    public void display() throws IOException {
        System.out.println(readCSV());
    }

    @Override
    public void search() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id cần tìm");
        int searchId = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < payAcountList.size(); i++) {
            if (searchId == payAcountList.get(i).getId()) {
                System.out.println(payAcountList.get(i));
            }
        }
    }
}
