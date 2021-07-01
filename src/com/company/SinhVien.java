package com.company;

public class SinhVien {
    private String id;
    private String name;
    private String gender;
    private String diaChi;
    private int diemTrungBinh;
    private int age;

    public SinhVien (String id, String name, String gender, String diaChi, int diemTrungBinh,int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.diaChi = diaChi;
        this.diemTrungBinh = diemTrungBinh;
        this.age=age;
    }


    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getDiaChi () {
        return diaChi;
    }

    public void setDiaChi (String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDiemTrungBinh () {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh (int diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }


    @Override
    public String toString () {
        return "Sinhvien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }

    public String display(){
        return id + ","+ name+","+gender+","+diaChi+","+diemTrungBinh+","+age;
    }
}
