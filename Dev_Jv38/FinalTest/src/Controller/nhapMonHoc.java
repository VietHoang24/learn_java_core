package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import Module.MonHoc;

public class nhapMonHoc {
    static Scanner input = new Scanner(System.in);
    public static void nhapMotMonHoc(MonHoc mh) {
        System.out.print("Ma mon hoc: ");
        String maMonHoc = input.nextLine();
        mh.setMaMonHoc(maMonHoc);

        System.out.print("Ten mon hoc: ");
        String tenMonHoc = input.nextLine();
        mh.setTenMonHoc(tenMonHoc);

        System.out.print("He so mon hoc: ");
        int heSo = input.nextInt();
        mh.setHeSo(heSo);

        System.out.print("Diem so mon hoc: ");
        float diem = input.nextFloat();
        input.nextLine();
        mh.setDiemSo(diem);
        System.out.println();
    }

    public static void nhapDanhSachMonHoc(ArrayList<MonHoc> list) {
        System.out.println("----> NHAP DANH SACH MON HOC <----");
        System.out.print("So mon hoc can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("- Mon hoc thu " + (i+1) + ":");
            MonHoc mh = new MonHoc();
            nhapMotMonHoc(mh);
            list.add(mh);
        }
    }
}
