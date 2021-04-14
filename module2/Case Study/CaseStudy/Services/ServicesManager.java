package CaseStudy.Services;

import CaseStudy.Common.*;
import CaseStudy.Controllers.MainController;
import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.util.*;

public class ServicesManager {
    //Show Services
    public static void showServices() {
        int choices;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Show All Villa");
        System.out.println("2.Show All House");
        System.out.println("3.Show All Room");
        System.out.println("4.Show All Name Villa Not Duplicate");
        System.out.println("5.Show All Name House Not Duplicate");
        System.out.println("6.Show All Name Room Not Duplicate");
        System.out.println("7.Back To Menu");
        System.out.println("8.Exit");
        System.out.println("==========");

        while (true) {
            System.out.println("Input Show Services: ");
            choices = input.nextInt();
            switch (choices) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    MainController.displayMainMenu();
                    break;
                case 8:

                    return;
            }
        }
    }
    public static void showAllVilla() {
        List<Villa> list = WriteAndReadVilla.readVilla();
        for (int i=0; i<list.size(); i++) {
            System.out.println((1+i)+ ". "+ list.get(i));
        }
    }public static void showAllHouse() {
        List<House> list = WriteAndReadHouse.readHouse();
        for (int i=0; i<list.size(); i++) {
            System.out.println((1+i)+ ". "+ list.get(i));
        }
    }public static void showAllRoom() {
        List<Room> list = WriteAndReadRoom.readRoom();
        for (int i=0; i<list.size(); i++) {
            System.out.println((1+i)+ ". "+ list.get(i));
        }
    }
    //Add new services
    public static void addNewServices() {
        int choices;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add New Villa");
            System.out.println("2.Add New House");
            System.out.println("3.Add New Room");
            System.out.println("4.Back To menu");
            System.out.println("5.Exit");
            System.out.println("==========");
            System.out.println("Input Services: ");
            choices = input.nextInt();
            switch (choices) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    MainController.displayMainMenu();
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void addNewVilla() {
        List<Villa> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Tiêu Chuẩn Phòng:");
        String tieuChuanPhong = input.nextLine();
        System.out.println("Mô Tả Tiện Nghi Khác:");
        String moTaTienNghiKhac = input.nextLine();
        System.out.println("Diện Tích Hồ Bơi:");
        int dienTichHoBoi =Integer.parseInt(input.nextLine());
        System.out.println("Số Tầng:");
        int soTang = Integer.parseInt(input.nextLine());
        System.out.println("Tên Dịch Vụ:");
        String tenDichVu = input.nextLine();
        System.out.println("Diện Tích Sử Dụng:");
        int dienTichSuDung = Integer.parseInt(input.nextLine());
        System.out.println("Chi Phí Thuê:");
        int chiPhiThue = Integer.parseInt(input.nextLine());
        System.out.println("Số Lượng Người Tối Đa:");
        int soLuongNguoiMax = Integer.parseInt(input.nextLine());
        System.out.println("Kiểu Thuê:");
        String kieuThue = input.nextLine();
        Villa villa = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue, tieuChuanPhong, moTaTienNghiKhac, dienTichHoBoi, soTang);
        list.add(villa);
        WriteAndReadVilla.writeVilla(list, true);
    }

    public static void addNewHouse() {
        List<House> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Tiêu Chuẩn Phòng:");
        String tieuChuanPhong = input.nextLine();
        System.out.println("Mô Tả Tiện Nghi Khác:");
        String moTaTienNghiKhac = input.nextLine();
        System.out.println("Số Tầng:");
        int soTang = Integer.parseInt(input.nextLine());
        System.out.println("Tên Dịch Vụ:");
        String tenDichVu = input.nextLine();
        System.out.println("Diện Tích Sử Dụng:");
        int dienTichSuDung = Integer.parseInt(input.nextLine());
        System.out.println("Chi Phí Thuê:");
        int chiPhiThue = Integer.parseInt(input.nextLine());
        System.out.println("Số Lượng Người Tối Đa:");
        int soLuongNguoiMax = Integer.parseInt(input.nextLine());
        System.out.println("Kiểu Thuê:");
        String kieuThue = input.nextLine();
        House house = new House(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue, tieuChuanPhong, moTaTienNghiKhac, soTang);
        list.add(house);
        WriteAndReadHouse.writeHouse(list, true);
    }

    public static void addNewRoom() {
        List<Room> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Dịch vụ miền phí đi kèm (massage, karaoke, food, drink, car):");
        String dichVuMienPhi = input.nextLine();
        System.out.println("Tên Dịch Vụ:");
        String tenDichVu = input.nextLine();
        System.out.println("Diện Tích Sử Dụng:");
        int dienTichSuDung = Integer.parseInt(input.nextLine());
        System.out.println("Chi Phí Thuê:");
        int chiPhiThue = Integer.parseInt(input.nextLine());
        System.out.println("Số Lượng Người Tối Đa:");
        int soLuongNguoiMax = Integer.parseInt(input.nextLine());
        System.out.println("Kiểu Thuê:");
        String kieuThue = input.nextLine();
        Room room = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiMax, kieuThue, dichVuMienPhi);
        list.add(room);
        WriteAndReadRoom.writeRoom(list , true);
    }
    //Add new customer
    public static void addNewCustomer(){
        List<Customer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Tên:");
        String name = input.nextLine();
        System.out.println("Ngày tháng năm sinh:");
        String dateOfBirth = input.nextLine();
        System.out.println("Giới tính:");
        String gender = input.nextLine();
        System.out.println("CMND:");
        int iDCard = Integer.parseInt(input.nextLine());
        System.out.println("Số điện thoại:");
        int phone = Integer.parseInt(input.nextLine());
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("Loại khách hàng:");
        String typeCustomer = input.nextLine();
        System.out.println("Địa chỉ:");
        String address = input.nextLine();
        Customer customer = new Customer(name, dateOfBirth, gender, iDCard, phone, email, typeCustomer, address);
        list.add(customer);
        WriteAndReadCustomers.writeCustomers(list, true);
    }
    //Show Customer
    public static void showInforationCustomers(){
        List<Customer> list = WriteAndReadCustomers.readCustomers();
        Collections.sort(list,new CompareByNameAndDate());
        for (int i=0; i<list.size(); i++) {
            System.out.println((1+i)+ ". "+ list.get(i));
        }
    }
}
