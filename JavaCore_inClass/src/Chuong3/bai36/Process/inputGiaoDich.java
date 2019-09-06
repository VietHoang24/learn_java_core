package Chuong3.bai36.Process;

import Chuong3.bai36.Module.Date;
import Chuong3.bai36.Module.GiaoDichNha;

import java.util.ArrayList;
import java.util.Scanner;

public class inputGiaoDich {
    static ArrayList<GiaoDichNha> listNha = new ArrayList<GiaoDichNha>();
    static Scanner input = new Scanner(System.in);

    public static void nhapNha(){
        GiaoDichNha nha = new GiaoDichNha();

        System.out.print("Ma giao dich: ");
        String maGiaoDich = input.nextLine();
        nha.setMaGiaoDich(maGiaoDich);

        System.out.println("\t-> Thoi gian giao dich <-");
        Date ngayGiaoDich = new Date();
        inputDate.nhapDate(ngayGiaoDich);
        nha.setNgayGiaoDich(ngayGiaoDich);

        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        nha.setDonGia(donGia);
        input.nextLine();

        System.out.print("Loai dat (A/B/C): ");
        String loaiDat = input.nextLine();
        nha.setLoaiDat(loaiDat);

        System.out.print("Dien tich: ");
        double dienTich = input.nextDouble();
        nha.setDienTich(dienTich);
        input.nextLine();

        System.out.print("Loai nha (cao cap/thuong): ");
        String loaiNha = input.nextLine();
        nha.setLoaiNha(loaiNha);

        System.out.print("Dia chi: ");
        String diaChi = input.nextLine();
        nha.setDiaChi(diaChi);

        listNha.add(nha);
    }

    public static void nhapDS(){
        System.out.print("So giao dich dat can thuc hien: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("---> Nhap vao cac giao dich dat can thuc hien <---");
        for (int i=0; i<n; i++){
            System.out.println("\n\tGiao dich thu " + (i+1));
            nhapNha();
        }
    }
}
