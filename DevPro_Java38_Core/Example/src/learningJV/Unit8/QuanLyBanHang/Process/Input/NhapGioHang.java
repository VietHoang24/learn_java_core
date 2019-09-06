package learningJV.Unit8.QuanLyBanHang.Process.Input;

import learningJV.Unit8.QuanLyBanHang.Module.GioHang;
import learningJV.Unit8.QuanLyBanHang.Module.LoaiHang;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapGioHang {
    static Scanner input = new Scanner(System.in);

    public static void nhapGioHangs(GioHang gioHang){
        System.out.print("ID gio hang: ");
        String id = input.nextLine();
        gioHang.setId(id);

        ArrayList<LoaiHang> loaiHangs = new ArrayList<LoaiHang>();
        NhapLoaiHang.nhapDsLoaiHang(loaiHangs);
    }

    public static void nhapDsGioHang(ArrayList<GioHang> gioHangs){
        gioHangs = new ArrayList<GioHang>();
        System.out.print("- So gio hang can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("--- Nhap danh sach gio hang ---");
        for (int i=0; i<n; i++){
            GioHang gioHang = new GioHang();
            System.out.println("\tGio hang thu " + (i+1));
            nhapGioHangs(gioHang);
            gioHangs.add(gioHang);
        }
    }
}
