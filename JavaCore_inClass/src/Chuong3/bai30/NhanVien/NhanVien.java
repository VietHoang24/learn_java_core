package Chuong3.bai30.NhanVien;

import Chuong3.bai30.NgayThang.NgayThang;

import java.util.Scanner;

public class NhanVien {
    private String hoDem, ten;
    private NgayThang ngaySinh = new NgayThang();
    private NgayThang ngayVaoLam = new NgayThang();
    static Scanner input = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String hoDem, String ten, NgayThang ngaySinh, NgayThang ngayVaoLam) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
    }

    public void nhap(){
        System.out.print("Ho dem: ");
        hoDem = input.nextLine();
        System.out.print("Ten   : ");
        ten = input.nextLine();
        System.out.println("- Nhap ngay sinh -");
        ngaySinh.nhap();
        System.out.println("- Nhap ngay vao lam -");
        ngayVaoLam.nhap();
    }

    public static void xuatTieuDe(){
        System.out.printf("%20s%20s%20s%20s%n", "Ho dem", "Ten", "Ngay sinh", "Ngay vao lam");
    }

    public void xuat(){
        System.out.printf("%20s%20s%20s%20s%n", hoDem, ten, ngaySinh, ngayVaoLam);
    }

    public String toString(){
        return ten + ", " + hoDem + " ngay vao lam: " + ngayVaoLam + " sinh ngay: " + ngaySinh;
    }
}
