package Chuong3.bai33.IO;

import Chuong3.bai33.Module.MonHoc;
import java.util.Scanner;

public class inputMonHoc extends inputSinhVien {
    static Scanner input = new Scanner(System.in);

    public static void nhapMH(){
        MonHoc a = new MonHoc();
        System.out.print("Ten mon hoc: ");
        String tenMH = input.nextLine();
        a.setTenMonHoc(tenMH);

        System.out.print("So trinh: ");
        int soTrinh = input.nextInt();
        a.setSoTrinh(soTrinh);

        System.out.print("Diem: ");
        float diem = input.nextFloat();
        a.setDiem(diem);
        input.nextLine();

        listMH.add(a);
    }

    public static void nhapDSMH(){
        System.out.println("---- Nhap danh sach mon hoc ----");
        System.out.print("Nhap tong so mon hoc: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("-> Mon hoc thu " + (i+1));
            nhapMH();
        }
    }
}
