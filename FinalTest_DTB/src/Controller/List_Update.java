package Controller;

import Module.*;

import java.util.ArrayList;

public class List_Update {
    public static void suaSinhVien() {
        SinhVien sinhVien = Data_Input.nhapSinhVien();
        if (!Helper_Exception.suaSinhVien(sinhVien)) {
            System.out.println("Sinh vien vua nhap khong ton tai, khong the chinh sua.");
            return;
        }
        Database_Update.suaSinhVien(sinhVien);
        System.out.println("Sua thong tin sinh vien thanh cong.");
    }

    public static void suaMonHoc() {
        MonHoc monHoc = Data_Input.nhapMonHoc();
        if (!Helper_Exception.suaMonHoc(monHoc)) {
            System.out.println("Mon hoc vua nhap khong ton tai, khong the chinh sua.");
            return;
        }
        Database_Update.suaMonHoc(monHoc);
        System.out.println("Sua thong tin mon hoc thanh cong.");
    }

    public static void suaDiem() {
        Diem diem = Data_Input.nhapDiem();
        if (!Helper_Exception.suaDiem(diem)) {
            System.out.println("Ma sinh vien va ma mon hoc vua nhap khong ton tai trong bang Diem, khong the chinh sua.");
            return;
        }
        Database_Update.suaDiem(diem);
        System.out.println("Sua thong tin diem thanh cong.");
    }
}
