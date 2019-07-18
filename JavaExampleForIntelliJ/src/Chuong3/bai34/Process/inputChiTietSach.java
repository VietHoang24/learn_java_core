package Chuong3.bai34.Process;

import Chuong3.bai34.Module.ChiTietSach;

import java.util.ArrayList;
import java.util.Scanner;

public class inputChiTietSach {
    static Scanner input = new Scanner(System.in);
    public static void nhap(ChiTietSach a){
        System.out.print("Ten sach: ");
        String tenSach = input.nextLine();
        a.setTenSach(tenSach);

        System.out.print("Ten tac gia: ");
        String tenTacGia = input.nextLine();
        a.setTenTacGia(tenTacGia);

        System.out.print("Ten NXB: ");
        String tenNXB = input.nextLine();
        a.setTenNXB(tenNXB);

        System.out.print("So luong: ");
        int soLuong = input.nextInt();
        a.setSoLuong(soLuong);
        input.nextLine();
    }

    public static void nhapDanhSach(ArrayList<ChiTietSach> a){
        System.out.print("So sach can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            ChiTietSach x = new ChiTietSach();
            System.out.println("\tSach thu " + (i+1));
            nhap(x);
            a.add(x);
        }
    }
}
