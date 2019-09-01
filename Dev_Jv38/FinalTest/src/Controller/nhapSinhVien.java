package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import Module.*;

public class nhapSinhVien {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<SinhVien> list = new ArrayList<SinhVien>();

    public static void nhapMotSinhVien() {
        SinhVien sv = new SinhVien();
        System.out.print("Ma sinh vien: ");
        String maSinhVien = input.nextLine();
        sv.setMaSinhVien(maSinhVien);

        System.out.print("Ho dem: ");
        String hoDem = input.nextLine();
        while (Helper.kiemTraKyTuDacBiet(hoDem)) {
            System.out.print("Ho dem khong duoc chua ky tu dac biet, moi nhap lai: ");
            hoDem = input.nextLine();
        }
        sv.setHoDem(hoDem);

        System.out.print("Ten: ");
        String ten = input.nextLine();
        while (Helper.kiemTraKyTuDacBiet(ten)) {
            System.out.print("Ten khong duoc chua ky tu dac biet, moi nhap lai: ");
            ten = input.nextLine();
        }
        sv.setTen(ten);

        System.out.print("Nam sinh: ");
        int namSinh = input.nextInt();
        while (!Helper.kiemTraNam(namSinh)) {
            System.out.print("Nam nhap vao phai khong am va khong phai nam the ky, moi nhap lai: ");
            namSinh = input.nextInt();
        }
        input.nextLine();
        sv.setNamSinh(namSinh);

        System.out.print("Gioi tinh: ");
        String gioiTinh = input.nextLine();
        while (!Helper.kiemTraGioiTinh(gioiTinh)) {
            System.out.print("Gioi tinh khong hop le, moi nhap lai: ");
            gioiTinh = input.nextLine();
        }
        sv.setGioiTinh(gioiTinh);

        ArrayList<MonHoc> listMH = new ArrayList<MonHoc>();
        nhapMonHoc.nhapDanhSachMonHoc(listMH);
        sv.setList(listMH);
        System.out.println();

        list.add(sv);
    }

    public static void nhapDanhSachSinhVien() {
        System.out.println("----> NHAP DANH SACH SINH VIEN <----");
        System.out.print("So sinh vien can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("- Sinh vien thu " + (i+1) + ":");
            nhapMotSinhVien();
        }
    }
}
