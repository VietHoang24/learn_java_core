package Chuong3.bai33.IO;

import Chuong3.bai33.Module.LopHoc;

import java.util.Scanner;

public class inputLopHoc extends inputSinhVien {
    static Scanner input = new Scanner(System.in);
    public static void nhapLopHoc(){
        LopHoc a = new LopHoc();

        System.out.print("Lop hoc: ");
        String lopHoc = input.nextLine();
        a.setTenLop(lopHoc);

        System.out.print("Khoa: ");
        int khoaHoc = input.nextInt();
        a.setKhoa(khoaHoc);
        input.nextLine();

        listLH.add(a);
    }
}
