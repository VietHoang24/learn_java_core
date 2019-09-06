package learningJV.Unit8.QuanLyBanHang.Process.Input;

import learningJV.Unit8.QuanLyBanHang.Module.Hang;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapHang {
    static Scanner input = new Scanner(System.in);

    public static void nhapHangs(Hang hang){
        System.out.print("ID hang: ");
        String id = input.nextLine();
        hang.setId(id);

        System.out.print("Ten hang: ");
        String tenHang = input.nextLine();
        hang.setTenHang(tenHang);

        System.out.print("So luong: ");
        int soLuong = input.nextInt();
        hang.setSoLuong(soLuong);

        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        hang.setDonGia(donGia);
        input.nextLine();
    }

    public static void nhapDsHangs(ArrayList<Hang> hangs){
        hangs = new ArrayList<Hang>();
        System.out.print("- So mat hang can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("--- Nhap danh sach cac mat hang ---");
        for (int i=0; i<n; i++){
            Hang hang = new Hang();
            System.out.println("\tMat hang thu " + (i+1));
            nhapHangs(hang);
            hangs.add(hang);
        }
    }
}
