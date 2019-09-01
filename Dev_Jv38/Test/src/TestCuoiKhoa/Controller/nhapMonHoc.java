package TestCuoiKhoa.Controller;

import TestCuoiKhoa.Module.Diem;
import TestCuoiKhoa.Module.MonHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class nhapMonHoc {
    static Scanner input = new Scanner(System.in);
    public static void nhapMH(MonHoc mh) {
        System.out.print("Ma mon hoc: ");
        String maMH = input.nextLine();
        mh.setMaMonHoc(maMH);

        System.out.print("Ten mon hoc: ");
        String tenMH = input.nextLine();
        mh.setTenMonHoc(tenMH);

        System.out.print("He so mon hoc: ");
        int heSo = input.nextInt();
        input.nextLine();
        mh.setHeSo(heSo);

        mh = new Diem();
        System.out.print("Diem so: ");
        float diemSo = input.nextFloat();
        input.nextLine();
        ((Diem) mh).setDiemSo(diemSo);
    }

    public static void nhapDSMH(ArrayList<MonHoc> list) {
        System.out.println("--->Nhap danh sach mon hoc<---");
        System.out.print("So mon hoc can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("MH " + (i+1));
            MonHoc mh = new MonHoc();
            nhapMH(mh);
            list.add(mh);
        }
    }
}
