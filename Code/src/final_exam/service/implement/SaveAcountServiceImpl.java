package final_exam.service.implement;

import case_study.furama_resort.model.Employee;
import final_exam.model.SaveAcount;
import final_exam.service.SaveAcountService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveAcountServiceImpl implements SaveAcountService {
    private static final String FILE_PATH = "D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\final_exam\\data\\save_acounts.csv";
    static List<SaveAcount> saveAcountList;

    static {
        try {
            saveAcountList = readCSV();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<SaveAcount> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        saveAcountList = new ArrayList<>();
        String line = "";
        String temp[];

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");

            int id = Integer.parseInt(temp[0].trim());
            String acountId = temp[1];
            String name = temp[2];
            String createDay = temp[3];
            long saveMoney = Integer.parseInt(temp[4].trim());
            String beginDay = temp[5];
            double laixuat = Double.parseDouble(temp[6].trim());
            int kiHan = Integer.parseInt(temp[7].trim());

            saveAcountList.add(new SaveAcount(id, acountId, name, createDay, saveMoney, beginDay, laixuat, kiHan));
        }
        buff.close();
        return saveAcountList;
    }

    public static void writeCSV(List<SaveAcount> saveAcounts) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (SaveAcount e : saveAcounts) {
            buff.write(e.getId() + "," + e.getAcountId() + "," + e.getName() + "," + e.getCreateDay() + "," + e.getSaveMoney() + "," + e.getBeginDay() + "," + e.getLaiXuat() + "," + e.getKiHan()  + "\n");
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

        System.out.println("Nhập số tiền gửi tiết kiệm");
        long saveMoney = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập ngày gửi tiết kiệm");
        String beginDay = sc.nextLine();

        System.out.println("Nhập lãi xuất");
        double laixuat = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập kì hạn");
        int kiHan = Integer.parseInt(sc.nextLine());

        saveAcountList.add(new SaveAcount(id, acountId, name, createDay, saveMoney, beginDay, laixuat, kiHan));
        writeCSV(saveAcountList);
    }

    @Override
    public void delete() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id cần xóa");
        int deleteId = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < saveAcountList.size(); i++) {
            if (deleteId == saveAcountList.get(i).getId()) {
                saveAcountList.remove(i);
                writeCSV(saveAcountList);
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

        for (int i = 0; i < saveAcountList.size(); i++) {
            if (searchId == saveAcountList.get(i).getId()) {
                System.out.println(saveAcountList.get(i));
            }
        }
    }
}
