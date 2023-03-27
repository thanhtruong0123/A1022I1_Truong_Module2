package case_study.furama_resort.service;

import case_study.furama_resort.controller.FuramaController;
import case_study.furama_resort.model.Facility;
import case_study.furama_resort.model.House;
import case_study.furama_resort.model.Room;
import case_study.furama_resort.model.Villa;
import case_study.furama_resort.util.MyRegex;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static case_study.furama_resort.util.MyRegex.REGEX_RENT_TYPE;

public class FactilityServiceImpl implements FacilityService {
    private static final String FILE_VILLA = "D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\case_study\\furama_resort\\data\\facility\\villa.csv";
    private static final String FILE_HOUSE= "D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\case_study\\furama_resort\\data\\facility\\house.csv";
    private static final String FILE_ROOM = "D:\\0. CODEGYM\\A1022I1_Truong_Module2\\Code\\src\\case_study\\furama_resort\\data\\facility\\room.csv";
    private static Map<Villa, Integer> villaMap;
    private static Map<House, Integer> houseMap;
    private static Map<Room, Integer> roomMap;
    private static Map<Facility, Integer> facilityUsage;

    static {
        try {
            villaMap = readVillaCSV();
            houseMap = readHouseCSV();
            roomMap = readRoomCSV();

            facilityUsage = new LinkedHashMap<>();
            facilityUsage.putAll(villaMap);
            facilityUsage.putAll(houseMap);
            facilityUsage.putAll(roomMap);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<Villa, Integer> readVillaCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_VILLA);
        BufferedReader buff = new BufferedReader(fileReader);
        villaMap = new HashMap<>();
        String line = "";
        String temp[];

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String serviceId = temp[0];
            String serviceName = temp[1];
            double area = Double.parseDouble(temp[2]);
            int fee = Integer.parseInt(temp[3]);
            int maxPersonNum = Integer.parseInt(temp[4]);
            String rentType = temp[5];
            String roomStandard = temp[6];
            double poolArea = Double.parseDouble(temp[7]);
            int floorNumber = Integer.parseInt(temp[8]);
            int value = Integer.parseInt(temp[9]);

            villaMap.put(new Villa(serviceId, serviceName, area, fee, maxPersonNum, rentType, roomStandard, poolArea, floorNumber), value);
        }
        buff.close();
        return villaMap;
    }

    public static Map<House, Integer> readHouseCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_HOUSE);
        BufferedReader buff = new BufferedReader(fileReader);
        houseMap = new LinkedHashMap<>();
        String line = "";
        String temp[];

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String serviceId = temp[0];
            String serviceName = temp[1];
            double area = Double.parseDouble(temp[2]);
            int fee = Integer.parseInt(temp[3]);
            int maxPersonNum = Integer.parseInt(temp[4]);
            String rentType = temp[5];
            String roomStandard = temp[6];
            int floorNumber = Integer.parseInt(temp[7]);
            int value = Integer.parseInt(temp[8]);

            houseMap.put(new House(serviceId, serviceName, area, fee, maxPersonNum, rentType, roomStandard, floorNumber), value);
        }
        buff.close();
        return houseMap;
    }

    public static Map<Room, Integer> readRoomCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_ROOM);
        BufferedReader buff = new BufferedReader(fileReader);
        roomMap = new LinkedHashMap<>();
        String line = "";
        String temp[];

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String serviceId = temp[0];
            String serviceName = temp[1];
            double area = Double.parseDouble(temp[2]);
            int fee = Integer.parseInt(temp[3]);
            int maxPersonNum = Integer.parseInt(temp[4]);
            String rentType = temp[5];
            String freeService = temp[6];
            int value = Integer.parseInt(temp[7]);

            roomMap.put(new Room(serviceId, serviceName, area, fee, maxPersonNum, rentType, freeService), value);
        }
        buff.close();
        return roomMap;
    }

    public static void setFacilityUsage(Map<Facility, Integer> facilityUsage) {
        FactilityServiceImpl.facilityUsage = facilityUsage;
    }

    public static void writeVillaCSV(Map<Villa, Integer> mapVilla) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_VILLA, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);

        for (Villa key : mapVilla.keySet()) {
            buff.write(key.getServiceId() + "," + key.getServiceName() + "," + key.getArea() + "," + key.getFee() + "," + key.getMaxPersonNum() + "," + key.getRentType() + "," + key.getRoomStandard() + "," + key.getPoolArea() + "," + key.getFloorNumber() + "0" + "\n");
        }
        buff.close();
    }

    public void writeHouseCSV(Map<House, Integer> mapHouse) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_HOUSE, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);

        for (House key : mapHouse.keySet()) {
            buff.write(key.getServiceId() + "," + key.getServiceName() + "," + key.getArea() + "," + key.getFee() + "," + key.getMaxPersonNum() + "," + key.getRentType() + "," + key.getRoomStandard() + "," + "," + key.getFloorNumber() + 0 + "\n");
        }
        buff.close();
    }

    public void writeRoomCSV(Map<Room, Integer> mapRoom) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_ROOM, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);

        for (Room key : mapRoom.keySet()) {
            buff.write(key.getServiceId() + "," + key.getServiceName() + "," + key.getArea() + "," + key.getFee() + "," + key.getMaxPersonNum() + "," + key.getRentType() + "," + key.getFreeService() + 0 + "\n");
        }
        buff.close();
    }

    public void increaseFacilityUsage(Facility facility) {
        Integer usage = facilityUsage.get(facility);
        facilityUsage.put(facility, usage+1);
    }

    @Override
    public void display() {
        System.out.println("Facility List");
        for (Facility facility : facilityUsage.keySet()) {
            System.out.print("Mã dịch vụ: " + facility.getServiceId() + "Dịch vụ: " + facility.getServiceName() + ", Diện tích: " + facility.getArea() + ", Giá: " + facility.getFee() + ", Số người tối đa: " + facility.getMaxPersonNum() + ", Loại thuê: " + facility.getRentType() + ", ");
            if (facility instanceof Villa) {
                Villa villa = (Villa) facility;
                System.out.print("Tiêu chuẩn: " + villa.getRoomStandard() + ", Diện tích Bể Bơi: " + villa.getPoolArea() + ", Số tầng: " + villa.getFloorNumber());
            } else if (facility instanceof House) {
                House house = (House) facility;
                System.out.print("Tiêu chuẩn: " + house.getRoomStandard() + ", Số tầng: " + house.getFloorNumber());
            } else if (facility instanceof Room) {
                Room room = (Room) facility;
                System.out.print("Dịch vụ miễn phí: " + room.getFreeService());
            }
            System.out.println("\n" + facilityUsage.get(facility) + " Lần");
            System.out.println("-----------");
        }
    }

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back");
        System.out.println("==================");

        try {
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
                    break;
                case 4:
                    FuramaController.facilityManagement();
                    break;
                default:
                    System.out.println("Chỉ nhập số từ 1 - 4");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Chỉ nhập số");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void addVilla() throws IOException {
        Scanner sc = new Scanner(System.in);

        String serviceId;
        boolean flag = true;
        do {
            System.out.println("Nhập Mã Dịch Vụ (Format: SVVL-XXXX)");
            serviceId = sc.nextLine();
            if (!serviceId.matches(MyRegex.REGEX_VILLA_ID)) {
                System.out.println("Mã Dịch Vụ Không Đúng Format");
            }
            for (Facility facility : facilityUsage.keySet()) {
                if (facility.getServiceId().equals(serviceId)) {
                    System.out.println("Mã Dịch Vụ Này Đã Tồn Tại");
                    flag = false;
                }
            }
        } while (!serviceId.matches(MyRegex.REGEX_VILLA_ID) || !flag);

        String serviceName;
        do {
            System.out.println("Nhập Tên Dịch Vụ:");
            serviceName = sc.nextLine();
            if (!serviceName.matches(MyRegex.REGEX_SERVICE_NAME)) {
                System.out.println("Mã Dịch Vụ Không Đúng Format");
            }
        } while (!serviceName.matches(MyRegex.REGEX_SERVICE_NAME));

        double area;
        do {
            System.out.println("Nhập Diện Tích (> 30m2):");
            area = Double.parseDouble(sc.nextLine());
        } while (area <= 30.0);

        int fee;
        do {
            System.out.println("Nhập giá cả (Số Dương):");
            fee = Integer.parseInt(sc.nextLine());
        } while (fee <= 0);

        int maxPersonNum;
        do {
            System.out.println("Nhập số người tối đa (>0 và <20)");
            maxPersonNum = Integer.parseInt(sc.nextLine());
        } while (maxPersonNum <= 0 || maxPersonNum >= 20);

        String renType;
        do {
            System.out.println("Nhập Loại thuê");
            renType = sc.nextLine();
        } while (!renType.matches(REGEX_RENT_TYPE));

        System.out.println("Nhập Tiêu Chuẩn");
        String roomStandard = sc.nextLine();

        double poolArea;
        do {
            System.out.println("Nhập diện tích bể bơi (> 30m2)");
            poolArea = Double.parseDouble(sc.nextLine());
        } while (poolArea <= 30);

        int floorNumber;
        do {
            System.out.println("Nhập Số Tầng (số nguyên dương)");
            floorNumber = Integer.parseInt(sc.nextLine());
        } while (floorNumber <= 0);

        Villa newVilla = new Villa(serviceId, serviceName, area, fee, maxPersonNum, renType, roomStandard, poolArea, floorNumber);
//        facilityUsage.put(newVilla, 0);
//        villaMap.put(newVilla, 0);
//        writeVillaCSV((Map<Villa, Integer>) newVilla);
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        villaMap.put(newVilla, 0);
        writeVillaCSV(villaMap);
    }
    private void addHouse() {
        Scanner sc = new Scanner(System.in);

        String serviceId;
        boolean flag = true;
        do {
            System.out.println("Nhập Mã Dịch Vụ (Format: SVHO-XXXX)");
            serviceId = sc.nextLine();
            if (!serviceId.matches(MyRegex.REGEX_HOUSE_ID)) {
                System.out.println("Mã Dịch Vụ Không Đúng Format");
            }
            for (Facility facility : facilityUsage.keySet()) {
                if (facility.getServiceId().equals(serviceId)) {
                    System.out.println("Mã Dịch Vụ Này Đã Tồn Tại");
                    flag = false;
                }
            }
        } while (!serviceId.matches(MyRegex.REGEX_HOUSE_ID) || !flag);

        String serviceName;
        do {
            System.out.println("Nhập Tên Dịch Vụ:");
            serviceName = sc.nextLine();
            if (!serviceName.matches(MyRegex.REGEX_SERVICE_NAME)) {
                System.out.println("Mã Dịch Vụ Không Đúng Format");
            }
        } while (!serviceName.matches(MyRegex.REGEX_SERVICE_NAME));

        double area;
        do {
            System.out.println("Nhập Diện Tích (> 30m2):");
            area = Double.parseDouble(sc.nextLine());
        } while (area <= 30.0);

        int fee;
        do {
            System.out.println("Nhập giá cả (Số Dương):");
            fee = Integer.parseInt(sc.nextLine());
        } while (fee <= 0);

        int maxPersonNum;
        do {
            System.out.println("Nhập số người tối đa (>0 và <20)");
            maxPersonNum = Integer.parseInt(sc.nextLine());
        } while (maxPersonNum <= 0 || maxPersonNum >= 20);

        String renType;
        do {
            System.out.println("Nhập Loại thuê");
            renType = sc.nextLine();
        } while (!renType.matches(REGEX_RENT_TYPE));

        System.out.println("Nhập Tiêu Chuẩn");
        String roomStandard = sc.nextLine();

        int floorNumber;
        do {
            System.out.println("Nhập Số Tầng (số nguyên dương)");
            floorNumber = Integer.parseInt(sc.nextLine());
        } while (floorNumber <= 0);

        House newHouse = new House(serviceId, serviceName, area, fee, maxPersonNum, renType, roomStandard, floorNumber);
        facilityUsage.put(newHouse, 0);
    }

    private void addRoom() {
        Scanner sc = new Scanner(System.in);

        String serviceId;
        boolean flag = true;
        do {
            System.out.println("Nhập Mã Dịch Vụ (Format: SVRO-XXXX)");
            serviceId = sc.nextLine();
            if (!serviceId.matches(MyRegex.REGEX_ROOM_ID)) {
                System.out.println("Mã Dịch Vụ Không Đúng Format");
            }
            for (Facility facility : facilityUsage.keySet()) {
                if (facility.getServiceId().equals(serviceId)) {
                    System.out.println("Mã Dịch Vụ Này Đã Tồn Tại");
                    flag = false;
                }
            }
        } while (!serviceId.matches(MyRegex.REGEX_ROOM_ID) || !flag);

        String serviceName;
        do {
            System.out.println("Nhập Tên Dịch Vụ:");
            serviceName = sc.nextLine();
            if (!serviceName.matches(MyRegex.REGEX_SERVICE_NAME)) {
                System.out.println("Mã Dịch Vụ Không Đúng Format");
            }
        } while (!serviceName.matches(MyRegex.REGEX_SERVICE_NAME));

        double area;
        do {
            System.out.println("Nhập Diện Tích (> 30m2):");
            area = Double.parseDouble(sc.nextLine());
        } while (area <= 30.0);

        int fee;
        do {
            System.out.println("Nhập giá cả (Số Dương):");
            fee = Integer.parseInt(sc.nextLine());
        } while (fee <= 0);

        int maxPersonNum;
        do {
            System.out.println("Nhập số người tối đa (>0 và <20)");
            maxPersonNum = Integer.parseInt(sc.nextLine());
        } while (maxPersonNum <= 0 || maxPersonNum >= 20);

        String renType;
        do {
            System.out.println("Nhập Loại thuê");
            renType = sc.nextLine();
        } while (!renType.matches(REGEX_RENT_TYPE));

        System.out.println("Nhập dịch vụ miễn phí");
        String freeService = sc.nextLine();

        Room newRoom = new Room(serviceId, serviceName, area, fee, maxPersonNum, renType, freeService);
        facilityUsage.put(newRoom, 0);
    }

    @Override
    public void editService() {

    }

    public void maintenanceFacility() {
        System.out.println("Các Facility cần bảo trì: ");
        for (Map.Entry<Facility, Integer> entry : facilityUsage.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry);
            }
        }
    }
}
