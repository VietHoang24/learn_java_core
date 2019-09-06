package Chuong3.bai37.Process;

import Chuong3.bai37.Module.Date;
import Chuong3.bai37.Module.NuocNgoai;
import Chuong3.bai37.Module.VietNam;

import java.util.ArrayList;
import java.util.Scanner;

public class inputKhachHang {
    static Scanner input = new Scanner(System.in);
    static ArrayList<VietNam> listVN = new ArrayList<VietNam>();
    static ArrayList<NuocNgoai> listForeign = new ArrayList<NuocNgoai>();

    public static void nhapV(){
        VietNam vn = new VietNam();

        System.out.print("Ma khach hang: ");
        String maKH = input.nextLine();
        vn.setMaKH(maKH);

        System.out.print("Ho ten: ");
        String hoTen = input.nextLine();
        vn.setHoTen(hoTen);

        System.out.println("\t-> Ngay ra hoa don <-");
        Date date = new Date();
        inputDate.nhapDate(date);
        vn.setNgayRaHD(date);

        System.out.print("Doi tuong khach hang(sinh hoat/kinh doanh/san xuat): ");
        String doiTuong = input.nextLine();
        vn.setDoiTuongKH(doiTuong);

        System.out.print("So luong dien tieu thu: ");
        float soLuong = input.nextFloat();
        vn.setSoLuong(soLuong);

        System.out.print("Don gia: ");
        int donGia = input.nextInt();
        vn.setDonGia(donGia);

        System.out.print("Dinh muc: ");
        int dinhMuc = input.nextInt();
        vn.setDinhMuc(dinhMuc);
        input.nextLine();

        listVN.add(vn);
    }

    public static void nhapF(){
        NuocNgoai fore = new NuocNgoai();

        System.out.print("Ma khach hang: ");
        String maKH = input.nextLine();
        fore.setMaKH(maKH);

        System.out.print("Ho ten: ");
        String hoTen = input.nextLine();
        fore.setHoTen(hoTen);

        System.out.println("\t-> Ngay ra hoa don <-");
        Date date = new Date();
        inputDate.nhapDate(date);
        fore.setNgayRaHD(date);

        System.out.print("Quoc tich: ");
        String quocTich = input.nextLine();
        fore.setQuocTich(quocTich);

        System.out.print("So luong dien tieu thu: ");
        float soLuong = input.nextFloat();
        fore.setSoLuong(soLuong);

        System.out.print("Don gia: ");
        int donGia = input.nextInt();
        fore.setDonGia(donGia);
        input.nextLine();

        listForeign.add(fore);
    }

    public static void nhapDSKHVN(){
        System.out.print("Tong so khach hang Viet Nam can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("\n\tKhach hang Viet Nam thu " + (i+1));
            nhapV();
        }
    }

    public static void nhapDSKHForeign(){
        System.out.print("Tong so khach hang nuoc ngoai can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("\n\tKhach hang nuoc ngoai thu " + (i+1));
            nhapF();
        }
    }
}
