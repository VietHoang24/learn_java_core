package Chuong3.bai31.Main;

import Chuong3.bai31.SinhVien.SinhVien;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t--- Nhap thong tin sinh vien ---");
        SinhVien a = new SinhVien();
        a.nhap();
        System.out.println("\n\t\t\t\t\t--- Thong tin sinh vien vua nhap ---\n");
        a.xuat();
        System.out.println("\n\t\t\t\t--- Thong tin sinh vien sau khi sap xep theo diem thi ---\n");
        a.sapXep();
        a.xuat();
    }
}
