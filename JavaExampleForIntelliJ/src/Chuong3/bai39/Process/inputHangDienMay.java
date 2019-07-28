package Chuong3.bai39.Process;

import Chuong3.bai39.Module.DMY;
import Chuong3.bai39.Module.HangDienMay;

import java.util.ArrayList;
import java.util.Scanner;

public class inputHangDienMay {
    static Scanner input = new Scanner(System.in);
    static ArrayList<HangDienMay> listDienMay = new ArrayList<HangDienMay>();

    public static void nhapDienMay(){
        HangDienMay hdm = new HangDienMay();

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

        listDienMay.add(hdm);
    }

    public static void nhapDSTP(){
        System.out.print("So hang dien may can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Hang hoa thu " + (i+1));
            nhapDienMay();
        }
    }
}
