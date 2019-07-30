package learningJV.Unit8.QuanLyBanHang.Process.Input;

import learningJV.Unit8.QuanLyBanHang.Module.Hang;
import learningJV.Unit8.QuanLyBanHang.Module.LoaiHang;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapLoaiHang {
    static Scanner input = new Scanner(System.in);

    public static void nhapLoaiHang(LoaiHang loaiHang){
        System.out.print("ID loai hang: ");
        String id = input.nextLine();
        loaiHang.setId(id);

        System.out.print("Ten loai hang: ");
        String tenLoaiHang = input.nextLine();
        loaiHang.setTenLoaiHang(tenLoaiHang);

        ArrayList<Hang> hangs = new ArrayList<Hang>();
        NhapHang.nhapDsHangs(hangs);
    }

    public static void nhapDsLoaiHang(ArrayList<LoaiHang> loaiHangs){
        System.out.print("- So loai hang can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("--- Nhap danh sach cac loai hang ---");
        for (int i=0; i<n; i++){
            LoaiHang loaiHang = new LoaiHang();
            System.out.println("\tLoai hang thu " + (i+1));
            nhapLoaiHang(loaiHang);
            loaiHangs.add(loaiHang);
        }
    }
}
