package Controller;

import java.util.Scanner;
import Module.*;

public class CapNhatDanhSach extends nhapSinhVien {
    static Scanner input = new Scanner(System.in);
    public static void themSinhVien() {
        SinhVien sv = new SinhVien();
        System.out.print("Nhap ma sinh vien can them: ");
        String maSV = input.nextLine();
        sv.setMaSinhVien(maSV);
        for (int i=0; i<list.size(); i++) {
            if (sv.getMaSinhVien().compareTo(list.get(i).getMaSinhVien())==0) {
                System.out.println("Ma sinh vien da ton tai, khong the them.");
                return;
            }
        }
        System.out.print("Ho dem: ");
        String hoDem = input.nextLine();
        sv.setHoDem(hoDem);

        System.out.print("Ten: ");
        String ten = input.nextLine();
        sv.setTen(ten);

        System.out.print("Nam sinh: ");
        int namSinh = input.nextInt();
        sv.setNamSinh(namSinh);

        System.out.print("Gioi tinh: ");

    }
}
