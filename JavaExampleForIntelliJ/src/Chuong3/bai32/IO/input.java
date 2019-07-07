package Chuong3.bai32.IO;

import Chuong3.bai32.Module.*;

import java.util.ArrayList;
import java.util.Scanner;

public class input {
    static ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
    static ArrayList<HangHoa> list = new ArrayList<HangHoa>();
    static Scanner input = new Scanner(System.in);

    public static Date inputDate(){
        Date day = new Date();

        System.out.print("Ngay  : ");
        int ngay = input.nextInt();
        day.setNgay(ngay);

        System.out.print("Thang : ");
        int thang = input.nextInt();
        day.setThang(thang);

        System.out.print("Nam   : ");
        int nam = input.nextInt();
        day.setNam(nam);
        input.nextLine();

        return day;
    }

    public static void inputKH(){
        KhachHang kH = new KhachHang();

        System.out.print("Ma hoat dong   : ");
        String maHD = input.nextLine();
        kH.setMaHD(maHD);

        System.out.print("Ten khach hang : ");
        String tenKH = input.nextLine();
        kH.setTenKH(tenKH);

        System.out.print("Dia chi        : ");
        String diaChi = input.nextLine();
        kH.setDiaChi(diaChi);

        System.out.println("-- Nhap ngay ban --");
        Date date = inputDate();
        kH.setNgayBan(date);

        listKH.add(kH);
    }

    public static void inputHangHoa(){
        HangHoa hH = new HangHoa();

        System.out.print("Ten hang : ");
        String tenHang = input.nextLine();
        hH.setTenHang(tenHang);

        System.out.print("Don gia  : ");
        int donGia = input.nextInt();
        hH.setDonGia(donGia);

        System.out.print("So luong : ");
        int soLuong = input.nextInt();
        hH.setSoLuong(soLuong);
        input.nextLine();

        long thanhTien = hH.getSoLuong()*hH.getDonGia();
        hH.setThanhTien(thanhTien);

        list.add(hH);
    }

    public static HoaDon inputHoaDon(){
        HoaDon hD = new HoaDon();

        System.out.println("----- Nhap thong tin khach hang -----");
        inputKH();
        hD.setKhachHang(listKH.get(0));

        System.out.println("----- Nhap thong tin hang hoa -----");
        System.out.print("Tong so hang hoa can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("\t-> Mat hang thu " + (i+1));
            inputHangHoa();
        }
        hD.setHangHoa(list);

        return hD;
    }
}
