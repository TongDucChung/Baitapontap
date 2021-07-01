package com.company;

import sun.misc.SignalHandler;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Menu menu=new Menu();


        while (true){
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN----");
            System.out.println("Chọn chức năng theo số(để tiếp tục)");
            System.out.println("1. Xem danh sách Sinh Viên");
            System.out.println("2. Thêm mới");
            System.out.println("3.Cập nhật");
            System.out.println("4.Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6.Đọc từ File");
            System.out.println("7.Ghi vào File");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng");
            int choise=scanner.nextInt();

            switch (choise){
                case 1:
                    menu.show();
                    break;
                case 2:
                    System.out.println("Nhập tên Sinh Viên cần thêm");
                    String name=scanner.nextLine();
                    menu.addSinhVien(name);
                    break;
                case 3:
                    System.out.println(" Khi cập nhật thông tin cũ sẽ bị xóa, bạn có đồng ý không");
                    System.out.println("1.yes");
                    System.out.println("2.no");
                    int choise2=scanner.nextInt();
                    if(choise2==1){
                        System.out.println("Nhập vào vị trí muốn thay đổi thông tin Sinh Viên");
                        int index=scanner.nextInt();
                        System.out.println("Nhập vào tên mới");
                        String name1=scanner.nextLine();
                        menu.editSinhVien(menu.create(name1),index);
                    }else
                        System.out.println("Xin lỗi không thể edit nếu không đồng ý");
                    break;
                case 4:
                    System.out.println("Nhập tên cần xóa");
                    String name2=scanner.nextLine();
                    menu.removeSinhVien(name2);
                    break;
                case 5:
                    menu.sortSinhVien();
                    break;
                case 6:
                    menu.docToFile();
                    break;
                case 7:
//                    ArrayList<SinhVien> list = new ArrayList<>()
                    menu.ghiFile();
                    break;

                case 8:
                    System.exit(0);

            }


        }
    }
}
