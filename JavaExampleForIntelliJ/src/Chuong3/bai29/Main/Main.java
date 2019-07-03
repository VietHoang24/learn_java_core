package Chuong3.bai29.Main;

import Chuong3.bai29.mypack.List;

public class Main {
    public static void main(String[] args){
        List a = new List();
        a.nhap();
        System.out.println("\t\t\t\t\t\t\t\tDanh sach sinh vien\n");
        a.xuat();
        System.out.println("\t\t\t\t\t\t\tDanh sach sinh vien sau khi sap xep\n");
        a.sapXep(); a.xuat();
        System.out.println("\n\t- Sinh vien co diem trung binh cao nhat la: " + a.getDiemTBMax());
        System.out.println("\n\t- Sinh vien co diem trung binh thap nhat la: " + a.getDiemTBMin());
    }
}
