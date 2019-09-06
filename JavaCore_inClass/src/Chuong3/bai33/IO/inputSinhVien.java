package Chuong3.bai33.IO;

import Chuong3.bai33.Module.*;

import java.util.ArrayList;
import java.util.Scanner;

public class inputSinhVien {
    static ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
    static ArrayList<LopHoc> listLH = new ArrayList<LopHoc>();
    static Scanner input = new Scanner(System.in);

    public static void nhapSv(){
        SinhVien a = new SinhVien();

        System.out.print("Ma sinh vien: ");
        String maSV = input.nextLine();
        a.setMaSinhVien(maSV);

        System.out.print("Ten sinh vien: ");
        String tenSV = input.nextLine();
        a.setTenSinhVien(tenSV);

        System.out.println("- Nhap lop hoc");
        inputLopHoc.nhapLopHoc();

        System.out.println("----------------------------------------------------");
        System.out.println("- Nhap danh sach mon hoc");
        ArrayList<MonHoc> mh = new ArrayList<MonHoc>();
        inputMonHoc.nhapDSMH(mh);
        a.setListMH(mh);

        listSV.add(a);
    }

    public static void nhapDSSV(){
        System.out.println("------------- Nhap danh sach sinh vien -------------");
        System.out.print("So sinh vien can nhap: ");
        int n = input.nextInt();
        System.out.println("----------------------------------------------------");
        input.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("-> Sinh vien thu " + (i+1));
            System.out.println("----------------------------------------------------");
            nhapSv();
            System.out.println("----------------------------------------------------");
        }
    }
}
