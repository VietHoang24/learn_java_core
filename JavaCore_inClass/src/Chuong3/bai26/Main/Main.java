package Chuong3.bai26.Main;

import Chuong3.bai26.mypack.List;
import Chuong3.bai26.mypack.NhanVien;

public class Main {
    public static void main(String[] args){
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        System.out.println("- Nhap nhan vien thu 1");
        nv1.nhap();
        System.out.println("- Nhap nhan vien thu 2");
        nv2.nhap();
        System.out.println("- Nhan vien vua nhap: ");
        NhanVien.xuatTieuDe();
        nv1.inDuLieu();
        nv2.inDuLieu();
        if(nv1.coVuotChuan())
            System.out.println("Nhan vien 1 co vuot chuan.");
        else
            System.out.println("Nhan vien 1 khong vuot chuan.");
        if(nv2.coVuotChuan())
            System.out.println("Nhan vien 2 co vuot chuan.");
        else
            System.out.println("Nhan vien 2 khong vuot chuan.");

        //phan mo rong
        List a = new List();
        System.out.println("\n\t\t\t\t- Nhap danh sach sinh vien");
        a.nhap();
        System.out.println("\n\t\t\t\t\t- Danh sach sinh vien");
        a.xuat();
        System.out.println("\n\t\t\t\t- Danh sach sinh vien vuot chuan");
        a.inSinhVienVuotChuan();
    }
}
