package Chuong3.bai39.Process;

import Chuong3.bai39.Module.DMY;
import Chuong3.bai39.Module.HangDienMay;

import java.util.ArrayList;
import java.util.Scanner;

public class inputHangDienMay {
    static Scanner input = new Scanner(System.in);
    static ArrayList<HangDienMay> listDienMay = new ArrayList<HangDienMay>();

    public static void nhap(HangDienMay hdm){
        System.out.print("Ma hang: ");
        String maHang = input.nextLine();
        hdm.setMaHang(maHang);

        System.out.print("Ten hang: ");
        String tenHang = input.nextLine();
        hdm.setTenHang(tenHang);

        System.out.print("So luong ton: ");
        int slt = input.nextInt();
        hdm.setSoLuongTonKho(slt);

        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        hdm.setDonGia(donGia);

        System.out.print("Thoi gia bao hanh: ");
        int time = input.nextInt();
        hdm.setThoiGianBaoHanh(time);

        System.out.print("Cong suat: ");
        double congSuat = input.nextDouble();
        hdm.setCongSuat(congSuat);
        input.nextLine();
    }

    public static void nhapDienMay(){
        HangDienMay hdm = new HangDienMay();
        nhap(hdm);
        listDienMay.add(hdm);
    }

    public static void themDienMay(){
        HangDienMay themHdm = new HangDienMay();
        System.out.println("\tNhap thong tin hang dien may can them.");
        nhap(themHdm);
        for (int i=0; i<listDienMay.size(); i++){
            if (themHdm.getMaHang().compareToIgnoreCase(listDienMay.get(i).getMaHang())!=0){
                System.out.println("Them hang dien may thanh cong.");
                listDienMay.add(themHdm);
            } else {
                System.out.println("==> Ma hang dien may bi trung, khong the them.");
                break;
            }
        }
    }

    public static void nhapDSDM(){
        System.out.print("So hang dien may can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Hang hoa thu " + (i+1));
            nhapDienMay();
        }
    }
}
