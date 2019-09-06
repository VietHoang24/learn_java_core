package VuVanHung_Day3.BaiTap4.Menu;

import VuVanHung_Day3.BaiTap4.BaiToan.*;

public class LuaChon {
    public static void choose(int n){
        switch (n){
            case 1:
                System.out.println("\n--- Kiem tra so nguyen to ---");
                BaiToan1.nhap();
                System.out.println("\n-> Ket qua:");
                BaiToan1.xuat();
                break;
            case 2:
                System.out.println("\n--- Tong n so nguyen to dau tien ---");
                BaiToan2.nhap();
                System.out.println("\n-> Ket qua:");
                BaiToan2.tongNguyenTo();
                break;
            case 3:
                System.out.println("\n--- Bang Cuu chuong ---");
                System.out.println("\n-> Ket qua:");
                BaiToan3.bangCuuChuong();
                break;
            case 4:
                System.out.println("\n--- Tinh Sin(x) ---");
                BaiToan4.nhap();
                System.out.println("\n-> Ket qua:");
                BaiToan4.xuat();
                break;
            case 5:
                System.out.println("\n--- Day Fibonacci ---");
                BaiToan5.nhapSoPhanTu();
                System.out.println("\n-> Ket qua:");
                BaiToan5.xuatDayFibonaci();
                break;
            case 6:
                System.out.println("Thoat chuong trinh !!!");
                System.exit(0);
        }
    }
}
