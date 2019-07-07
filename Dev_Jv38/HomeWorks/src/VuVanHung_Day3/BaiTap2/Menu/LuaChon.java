package VuVanHung_Day3.BaiTap2.Menu;

import VuVanHung_Day3.BaiTap2.BaiToan.*;

public class LuaChon {
    public static void choose(int n){
        switch (n){
            case 1:
                System.out.println("\n--- Doc chu so ---");
                BaiToan1.nhap();
                System.out.println("\n-> Ket qua:");
                BaiToan1.docSo();
                break;
            case 2:
                System.out.println("\n--- Tinh gia tri bieu thuc ---");
                BaiToan2.nhap();
                System.out.println("\n-> Ket qua:");
                BaiToan2.xuat();
                break;
            case 3:
                System.out.println("\n--- Tinh tien mua gao ---");
                BaiToan3.nhap();
                System.out.println("\n-> Ket qua:");
                BaiToan3.tinhTien();
                break;
            case 4:
                System.out.println("\n--- Tam giac ---");
                BaiToan4.nhap();
                System.out.println("\n-> Ket qua:");
                BaiToan4.xuat();
                break;
            case 5:
                System.out.println("Thoat chuong trinh !!!");
                System.exit(0);
        }
    }
}
