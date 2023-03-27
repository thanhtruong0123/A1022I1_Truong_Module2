package final_exam.controller;

import final_exam.service.PayAcountService;
import final_exam.service.SaveAcountService;
import final_exam.service.implement.PayAcountServiceImpl;
import final_exam.service.implement.SaveAcountServiceImpl;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank_Manager {
    static SaveAcountService saveAcountService = new SaveAcountServiceImpl();
    static PayAcountService payAcountService = new PayAcountServiceImpl();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG --");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng:");
            try {
                int select = Integer.parseInt(sc.nextLine());

                switch (select) {
                    case 1:
                        addNew();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        search();
                        break;
                    default:
                        System.out.println("Chỉ nhập số từ 1 - 5");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Chỉ nhập 'SỐ'!!!");
            }
        }
    }

    public static void addNew() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại tài khoản");
            System.out.println("1. Tài khoản tiết kiệm");
            System.out.println("2. Tài khoản thanh toán");
            System.out.println("3. Về menu chính");
            System.out.println("=======================");
            try {
                int select = Integer.parseInt(sc.nextLine());

                switch (select) {
                    case 1:
                        saveAcountService.addNew();
                        break;
                    case 2:
                        payAcountService.addNew();
                    case 3:
                        return;
                    default:
                        System.out.println("Chỉ nhập số từ 1 - 3");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Chỉ nhập 'SỐ'!!!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void delete() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại tài khoản");
            System.out.println("1. Tài khoản tiết kiệm");
            System.out.println("2. Tài khoản thanh toán");
            System.out.println("3. Về menu chính");
            System.out.println("=======================");
            try {
                int select = Integer.parseInt(sc.nextLine());

                switch (select) {
                    case 1:
                        saveAcountService.delete();
                        break;
                    case 2:
                        payAcountService.delete();
                    case 3:
                        return;
                    default:
                        System.out.println("Chỉ nhập số từ 1 - 3");
                        break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Chỉ nhập 'SỐ'!!!");
            }
        }
    }

    public static void display() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại tài khoản");
            System.out.println("1. Tài khoản tiết kiệm");
            System.out.println("2. Tài khoản thanh toán");
            System.out.println("3. Về menu chính");
            System.out.println("=======================");
            try {
                int select = Integer.parseInt(sc.nextLine());

                switch (select) {
                    case 1:
                        saveAcountService.display();
                        break;
                    case 2:
                        payAcountService.display();
                    case 3:
                        return;
                    default:
                        System.out.println("Chỉ nhập số từ 1 - 3");
                        break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Chỉ nhập 'SỐ'!!!");
            }
        }
    }

    public static void search() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại tài khoản");
            System.out.println("1. Tài khoản tiết kiệm");
            System.out.println("2. Tài khoản thanh toán");
            System.out.println("3. Về menu chính");
            System.out.println("=======================");
            try {
                int select = Integer.parseInt(sc.nextLine());

                switch (select) {
                    case 1:
                        saveAcountService.search();
                        break;
                    case 2:
                        payAcountService.search();
                    case 3:
                        return;
                    default:
                        System.out.println("Chỉ nhập số từ 1 - 3");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Chỉ nhập 'SỐ'!!!");
            }
        }
    }
}
