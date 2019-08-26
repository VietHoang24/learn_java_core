package TestCuoiKhoa.Controller.Process;

import TestCuoiKhoa.Module.*;

import java.util.ArrayList;
import java.util.Scanner;

public class nhapSinhVien {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<tblSinhVien> list = new ArrayList<>();

    public static void nhapSV() {
        tblSinhVien sv = new tblSinhVien();

        System.out.print("Ma sinh vien: ");
        String maSV = input.nextLine();
        sv.setMaSinhVien(maSV);

        System.out.print("Ho dem: ");
        String hoDem = input.nextLine();
        sv.setHoDem(hoDem);

        System.out.print("Ten: ");
        String ten = input.nextLine();
        sv.setTen(ten);

        System.out.print("Nam sinh: ");
        int namSinh = input.nextInt();
        input.nextLine();
        sv.setNamSinh(namSinh);

        System.out.print("Gioi tinh: ");
        String gioiTinh = input.nextLine();
        sv.setGioiTinh(gioiTinh);

        ArrayList<tblMonHoc> listMH = new ArrayList<>();
        nhapMonHoc.nhapDSMH(listMH);
        sv.setListMH(listMH);

        list.add(sv);
    }

    public static void nhapDSSV() {
        System.out.println("--->Nhap danh sach sinh vien<---");
        System.out.print("So sinh vien can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("- SV " + (i+1));
            nhapSV();
        }
    }
}
