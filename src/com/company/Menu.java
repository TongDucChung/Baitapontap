package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;


public class Menu {
    static ArrayList<SinhVien>sinhViens=new ArrayList<>();
    static SinhVien sinhVien;
    static Scanner scanner=new Scanner(System.in);
    public void show(){
        docFile();
        for (SinhVien a:sinhViens) {
            System.out.println(a);
        }
    }

    public SinhVien create(String nameSinhVien){
        System.out.println("Nhập vào tên");
        String ten = scanner.nextLine();
        System.out.println("Nhập vào mã sinh vien");
        String id = scanner.nextLine();
        System.out.println("Nhập vào giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập vào điểm trung bình");
        int diemTrungBinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tuổi");
        int tuoi=Integer.parseInt(scanner.nextLine());

        return new SinhVien(id,ten,gender,diaChi,diemTrungBinh,tuoi);
    }

    public void addSinhVien(String nameSinhVien){
        SinhVien sinhVien=create(nameSinhVien);
        sinhViens.add(sinhVien);
    }

    public void removeSinhVien(String name){
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getName().equals(name)){
                sinhViens.remove(i);
        }
        }
    }

    public void editSinhVien(SinhVien sinhVien, int index){
        sinhViens.set(index,sinhVien);
    }

    public void sortSinhVien(){
        SortSinhVien sortSinhVien=new SortSinhVien();
        Collections.sort(sinhViens,sortSinhVien);
    }

    public ArrayList<SinhVien> docFile(){
        try {
            BufferedReader ois = new BufferedReader(new FileReader("QLSV.csv"));
            String line ="";
            while ((line = ois.readLine()) != null){
                String[] str = line.split(",");
                sinhViens.add(new SinhVien(str[0],str[1],str[2],str[3],Integer.parseInt(str[4]),Integer.parseInt(str[5])));
            }
            ois.close();
        } catch (Exception e){
            System.out.println("file chưa có gì");
        }
        return sinhViens;
    }
    public void ghiFile(){
        try{
           BufferedWriter oos = new BufferedWriter(new FileWriter("QLSV.csv"));
            for (SinhVien c : sinhViens){
                oos.write(c.display());
            }
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void docToFile(){
        ArrayList<SinhVien> arrayList = new ArrayList<>();
        arrayList = docFile();
        for (SinhVien a: arrayList){
            System.out.println(a);
        }
    }
}
