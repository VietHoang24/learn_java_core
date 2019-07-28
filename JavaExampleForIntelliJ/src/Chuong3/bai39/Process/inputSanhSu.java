package Chuong3.bai39.Process;

import Chuong3.bai39.Module.DMY;
import Chuong3.bai39.Module.HangSanhSu;

import java.util.ArrayList;
import java.util.Scanner;

public class inputSanhSu {
    static Scanner input = new Scanner(System.in);
    static ArrayList<HangSanhSu> listSanhSu = new ArrayList<HangSanhSu>();

    public static void nhapSanhSu(){
        HangSanhSu hss = new HangSanhSu();

        System.out.print("Ma hang: ");
        String maHang = input.nextLine();
        hss.setMaHang(maHang);

        System.out.print("Ten hang: ");
        String tenHang = input.nextLine();
        hss.setTenHang(tenHang);

        System.out.print("So luong ton: ");
        int slt = input.nextInt();
        hss.setSoLuongTonKho(slt);

        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        hss.setDonGia(donGia);

        System.out.print("Hang san xuat: ");
        String hsx = input.nextLine();
        hss.setHangSX(hsx);

        System.out.print("Nha san xuat: ");
        String nsx = input.nextLine();
        hss.setNhaSX(nsx);

        System.out.print("Dia chi: ");
        String dc = input.nextLine();
        hss.setDiaChi(dc);

        System.out.println("\t-> Ngay nhap kho <-");
        DMY ngay = new DMY();
        inputDMY.nhapDate(ngay);
        hss.setNgayNhapKho(ngay);

        listSanhSu.add(hss);
    }

    public static void nhapDSTP(){
        System.out.print("So hang sanh su can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Hang hoa thu " + (i+1));
            nhapSanhSu();
        }
    }
}
