package Chuong3.bai34.Process;

import Chuong3.bai34.Module.*;

import java.util.ArrayList;
import java.util.Scanner;

public class inputPhieuNhapSach {
    static ArrayList<Date> listDate = new ArrayList<Date>();
    static ArrayList<PhieuNhapSach> listPhieu = new ArrayList<PhieuNhapSach>();
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        PhieuNhapSach a = new PhieuNhapSach();

        System.out.print("Ma Phieu: ");
        String maPhieu = input.nextLine();
        a.setMaPhieu(maPhieu);

        System.out.println("\t- Nhap ngay");
        intputDate.nhap();

        System.out.println("\t- Nhap danh sach chi tiet sach");
        ArrayList<ChiTietSach> x = new ArrayList<ChiTietSach>();
        inputChiTietSach.nhapDanhSach(x);
        a.setListBook(x);

        listPhieu.add(a);
    }

    public static void nhapDS(){
        System.out.print("So phieu can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("\tPhieu thu " + (i+1));
            nhap();
        }
    }
}
