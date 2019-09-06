package Chuong3.bai33.IO;

import Chuong3.bai33.Module.MonHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class inputMonHoc extends inputSinhVien {
    static Scanner input = new Scanner(System.in);

    public static void nhapMH(MonHoc a){
        System.out.print("\tTen mon hoc: ");
        String tenMH = input.nextLine();
        a.setTenMonHoc(tenMH);

        System.out.print("\tSo trinh: ");
        int soTrinh = input.nextInt();
        a.setSoTrinh(soTrinh);

        System.out.print("\tDiem: ");
        float diem = input.nextFloat();
        a.setDiem(diem);
        input.nextLine();
    }

    public static void nhapDSMH(ArrayList<MonHoc> x){
        System.out.print("Nhap tong so mon hoc: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("----------------------------------------------------");
        for(int i=0; i<n; i++){
            System.out.println("-> Mon hoc thu " + (i+1));
            MonHoc a = new MonHoc();
            nhapMH(a);
            x.add(a);
        }
    }
}
