package Chuong3.bai27.Main;

import Chuong3.bai27.mypack.List;
import Chuong3.bai27.mypack.TamGiac;

public class Main {
    public static void main(String[] args){
        TamGiac a = new TamGiac();
        System.out.println("Nhap vao do dai cac canh thoa man dieu kien cua tam giac.\n");
        a.nhap();
        System.out.println("- Chu vi tam giac: " + a.getChuVi() + "\n");
        System.out.println("- Dien tich tam giac: " + a.getDienTich() + "\n");

        //mo rong
        List b = new List();
        System.out.println("\n\t\t\t- Nhap vao danh sach tam giac.");
        b.nhap();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t-Danh sach tam giac");
        b.xuat();
    }
}
