package Chuong3.bai39.Process;

import Chuong3.bai39.Module.DMY;
import Chuong3.bai39.Module.HangSanhSu;

import java.util.ArrayList;
import java.util.Scanner;

public class inputHangSanhSu {
    static Scanner input = new Scanner(System.in);
    static ArrayList<HangSanhSu> listSanhSu = new ArrayList<HangSanhSu>();

    public static void nhap(HangSanhSu hss){
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
        input.nextLine();

        System.out.print("Hang san xuat: ");
        String hangSanXuat = input.nextLine();
        hss.setHangSX(hangSanXuat);

        System.out.print("Nha san xuat: ");
        String nhanSanXuat = input.nextLine();
        hss.setNhaSX(nhanSanXuat);

        System.out.print("Dia chi: ");
        String diaChi = input.nextLine();
        hss.setDiaChi(diaChi);

        System.out.println("\t-> Ngay nhap kho <-");
        DMY nhapKho = new DMY();
        inputDMY.nhapDate(nhapKho);
        hss.setNgayNhapKho(nhapKho);

        input.nextLine();
    }

    public static void nhapSanhSu(){
        HangSanhSu hss = new HangSanhSu();
        nhap(hss);
        listSanhSu.add(hss);
    }

    public static void themSanhSu(){
        HangSanhSu themHss = new HangSanhSu();
        System.out.println("\tNhap thong tin hang sanh sau can them.");
        nhap(themHss);
        for (int i=0; i<listSanhSu.size(); i++){
            if (themHss.getMaHang().compareToIgnoreCase(listSanhSu.get(i).getMaHang())!=0){
                System.out.println("Them hang sanh su thanh cong.");
                listSanhSu.add(themHss);
            } else {
                System.out.println("Ma hang sanh su bi trung, khong the them.");
                break;
            }
        }
    }

    public static void nhapDSSS(){
        System.out.print("So hang sanh su can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Hang hoa thu " + (i+1));
            nhapSanhSu();
        }
    }
}
