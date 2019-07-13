package VuVanHung_Day4.ArrayString.Control;

import VuVanHung_Day4.ArrayString.Process.*;

public class Switch {
    public static void choose(int n){
        switch (n){
            case 1:
                System.out.println("\n\t\t----- Nhap danh sach ho gia dinh -----\n");
                input.nhapDS();
                break;
            case 2:
                System.out.println("\n\t\t\t----- Danh sach ho gia dinh vua nhap -----");
                output.xuatDs();
                break;
            case 3:
                System.out.println("\n\t\t\t----- Sap xep danh sach theo ten -----");
                SapTen.sapXep();
                output.xuatDs();
                break;
            case 4:
                System.out.println("\n\t\t\t----- Sap xep danh sach theo so KwH -----");
                SapSoKwh.sapXep();
                output.xuatDs();
                break;
            case 5:
                System.out.println("\n\t\t----- Ba ho gia dinh co so KwH cao nhat -----");
                System.out.println("\t*** Hien thi theo danh sach da sap xep tang dan cua so KwH ***\n");
                SapSoKwh.sapXep();
                output.hienThi3GD();
                break;
            case 6:
                System.out.println("\n\t\t----- Hien thi danh sach cac chu ho co ten la 'Truong' -----\n");
                output.hienThiChuHo();
                break;
            case 7:
                System.out.println("\n\t\t---->  Thoat chuong trinh  <----\n");
                System.exit(0);
        }
    }
}
