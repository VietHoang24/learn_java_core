package Controller;

import Module.*;

public class List_Add {
    public static void themSinhVien() {
        SinhVien sinhVien = Data_Input.nhapSinhVien();
        if (Database_Add.themSinhVien(sinhVien)) {
            System.out.println("Them sinh vien thanh cong.");
        } else {
            System.out.println("Ma sinh vien bi trung, khong the them.");
        }
    }

    public static void themMonHoc() {
        MonHoc monHoc = Data_Input.nhapMonHoc();
        if (Database_Add.themMonHoc(monHoc)) {
            System.out.println("Them mon hoc thanh cong.");
        } else {
            System.out.println("Ma mon hoc bi trung, khong the them.");
        }
    }

    public static void themDiem() {
        Diem diem = Data_Input.nhapDiem();
        if (Database_Add.themDiem(diem)) {
            System.out.println("Them diem thanh cong.");
        } else {
            System.out.println("Ma sinh vien hoac ma mon hoc khong trung khop, khong the them.");
        }
    }
}
