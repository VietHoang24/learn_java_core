package Chuong3.bai38.Process;

import Chuong3.bai38.Module.Date;
import Chuong3.bai38.Module.Gio;
import Chuong3.bai38.Module.Ngay;

import java.util.ArrayList;
import java.util.Scanner;

public class inputHoaDon {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Gio> listTime = new ArrayList<Gio>();
    static ArrayList<Ngay> listDay = new ArrayList<Ngay>();

    public static void nhapGio(){
        Gio gio = new Gio();

        System.out.print("Ma hoa don: ");
        String maHD = input.nextLine();
        gio.setMaHD(maHD);

        System.out.println("\t\t-> Ngay ra hoa don <-");
        Date date = new Date();
        inputDate.nhapDate(date);
        gio.setNgayHD(date);

        System.out.print("Ten khach hang: ");
        String tenKH = input.nextLine();
        gio.setTenKH(tenKH);

        System.out.print("Ma phong: ");
        String maPhong = input.nextLine();
        gio.setMaPhong(maPhong);

        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        gio.setDonGia(donGia);

        System.out.print("So gio thue: ");
        double soGio = input.nextDouble();
        gio.setSoGioThue(soGio);
        input.nextLine();

        listTime.add(gio);
    }

    public static void nhapDSHDTheoGio(){
        System.out.print("So hoa don theo gio can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("\t\t-> Nhap danh sach hoa don theo gio <-");
        for (int i=0; i<n; i++){
            System.out.println("\n\tHoa don theo gio thu " + (i+1));
            nhapGio();
        }
    }

    public static void nhapNgay(){
        Ngay ngay = new Ngay();

        System.out.print("Ma hoa don: ");
        String maHD = input.nextLine();
        ngay.setMaHD(maHD);

        System.out.println("\t\t-> Ngay ra hoa don <-");
        Date date = new Date();
        inputDate.nhapDate(date);
        ngay.setNgayHD(date);

        System.out.print("Ten khach hang: ");
        String tenKH = input.nextLine();
        ngay.setTenKH(tenKH);

        System.out.print("Ma phong: ");
        String maPhong = input.nextLine();
        ngay.setMaPhong(maPhong);

        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        ngay.setDonGia(donGia);

        System.out.print("So ngay thue: ");
        double soNgay = input.nextDouble();
        ngay.setSoNgayThue(soNgay);
        input.nextLine();

        listDay.add(ngay);
    }

    public static void nhapDSHDTheoNgay(){
        System.out.print("So hoa don theo ngay can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("\t\t-> Nhap danh sach hoa don theo ngay <-");
        for (int i=0; i<n; i++){
            System.out.println("\n\tHoa don theo ngay thu " + (i+1));
            nhapNgay();
        }
    }
}
