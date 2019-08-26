package TestCuoiKhoa.Controller.Process;

import TestCuoiKhoa.Module.tblDiem;
import TestCuoiKhoa.Module.tblMonHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class nhapMonHoc {
    static Scanner input = new Scanner(System.in);
    public static void nhapMH(tblMonHoc mh) {
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

        mh = new tblDiem();
        System.out.print("Diem so: ");
        float diemSo = input.nextFloat();
        input.nextLine();
        ((tblDiem) mh).setDiemSo(diemSo);
    }

    public static void nhapDSMH(ArrayList<tblMonHoc> list) {
        System.out.println("--->Nhap danh sach mon hoc<---");
        System.out.print("So mon hoc can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++) {
            System.out.println("MH " + (i+1));
            tblMonHoc mh = new tblMonHoc();
            nhapMH(mh);
            //nhapDiem.nhapD(mh);
            list.add(mh);
        }
    }
}
