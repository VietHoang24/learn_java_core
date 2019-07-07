package Chuong3.bai32.IO;

import Chuong3.bai32.Module.*;

import java.util.ArrayList;
import java.util.Scanner;

public class input {
    static Scanner input = new Scanner(System.in);

    public static Date inputDate(){
        Date a = new Date();

        System.out.print("Ngay  : ");
        int ngay = input.nextInt();
        a.setNgay(ngay);

        System.out.print("Thang : ");
        int thang = input.nextInt();
        a.setThang(thang);

        System.out.print("Nam   : ");
        int nam = input.nextInt();
        a.setNam(nam);
        input.nextLine();

        return a;
    }

    public static void inputKH(){
        KhachHang a = new KhachHang();

        System.out.print("Ma hoat dong   : ");
        String maHD = input.nextLine();
        a.setMaHD(maHD);

        System.out.print("Ten khach hang : ");
        String tenKH = input.nextLine();
        a.setTenKH(tenKH);

        System.out.print("Dia chi        : ");
        String diaChi = input.nextLine();
        a.setDiaChi(diaChi);

        System.out.println("-- Nhap ngay ban --");
        Date x = inputDate();
        a.setNgayBan(x);
    }

    public static void inputHangHoa(HangHoa a){
        System.out.print("Ten hang : ");
        String tenHang = input.nextLine();
        a.setTenHang(tenHang);

        System.out.print("Don gia  : ");
        int donGia = input.nextInt();
        a.setDonGia(donGia);

        System.out.print("So luong : ");
        int soLuong = input.nextInt();
        a.setSoLuong(soLuong);
        input.nextLine();

        long thanhTien = a.getSoLuong()*a.getDonGia();
        a.setThanhTien(thanhTien);
    }

    public static void inputHoaDon(HoaDon a){
        System.out.println("----- Nhap thong tin khach hang -----");
        KhachHang x = new KhachHang();
        inputKH(x);
        a.setKhachHang(x);

        System.out.println("----- Nhap thong tin hang hoa -----");
        ArrayList<HangHoa> y = new ArrayList<HangHoa>();
        System.out.print("Tong so hang hoa can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("\t-> Mat hang thu " + (i+1));
            HangHoa z = new HangHoa();
            inputHangHoa(z);
            y.add(z);
        }
        a.setHangHoa(y);
    }
}
