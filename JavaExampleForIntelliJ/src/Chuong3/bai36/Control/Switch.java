package Chuong3.bai36.Control;

import Chuong3.bai36.Process.*;

public class Switch {
    public static void chooce(int n){
        switch (n){
            case 1:
                System.out.println("\t\t===== Nhap danh sach giao dich nha dat =====");
                inputGiaoDich.nhapDS();
                break;
            case 2:
                System.out.println("\t\t\t\t\t\t\t\t\t===== Xuat danh sach giao dich nha dat =====");
                outputGiaoDich.tieuDe();
                outputGiaoDich.xuatDS();
                break;
            case 3:
                System.out.println("\t\t===== Tong so luong tung loai =====");
                outputGiaoDich.tongSoLuong();
                break;
            case 4:
                System.out.println("\t\t===== Trung binh thanh tien giao dich dat =====");
                outputGiaoDich.trungBinh();
                break;
            case 5:
                System.out.println("\t\t\t\t\t\t\t\t===== Cac giao dich thang 9 nam 2013 =====");
                outputGiaoDich.tieuDe();
                outputGiaoDich.timGiaoDich();
                break;
            case 0:
                System.out.println("\t\t=====> Thoat chuong trinh <=====");
                System.exit(0);
        }
    }
}
