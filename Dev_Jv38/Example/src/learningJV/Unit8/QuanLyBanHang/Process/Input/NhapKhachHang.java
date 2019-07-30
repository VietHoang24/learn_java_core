package learningJV.Unit8.QuanLyBanHang.Process.Input;

import learningJV.Unit8.QuanLyBanHang.Module.GioHang;
import learningJV.Unit8.QuanLyBanHang.Module.KhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapKhachHang {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<KhachHang> khachHangs = new ArrayList<KhachHang>();

    public static void nhapKhachHang(){
        KhachHang khachHang = new KhachHang();

        System.out.print("ID khach hang: ");
        String id = input.nextLine();
        khachHang.setId(id);

        System.out.print("Ten khach hang: ");
        String tenKH = input.nextLine();
        khachHang.setTenKH(tenKH);

        ArrayList<GioHang> gioHangs = new ArrayList<GioHang>();
        NhapGioHang.nhapDsGioHang(gioHangs);

        khachHangs.add(khachHang);
    }

    public static void nhapDsKhachHang(){
        System.out.print("- So khach hang can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("--- Nhap danh sach khach hang ---");
        for (int i=0; i<n; i++){
            System.out.println("\tKhach hang thu " + (i+1));
            nhapKhachHang();
        }
    }
}
