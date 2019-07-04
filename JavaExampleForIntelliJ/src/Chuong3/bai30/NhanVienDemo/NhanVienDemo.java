package Chuong3.bai30.NhanVienDemo;

import Chuong3.bai30.NgayThang.NgayThang;
import Chuong3.bai30.NhanVien.NhanVien;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienDemo {
    static ArrayList<NhanVien> list;
    static Scanner input = new Scanner(System.in);

    public static void nhapDS(){
        list = new ArrayList<NhanVien>();
        System.out.print("So nhan vien can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("- Nhap danh sach nhan vien");
        for(int i=0; i<n; i++){
            System.out.println("\t+ Nhan vien thu " + (i+1) + ":");
            NhanVien a = new NhanVien();
            a.nhap();
            list.add(a);
        }
    }

    public static void xuat(){
        NhanVien.xuatTieuDe();
        for(int i=0; i<list.size(); i++){
            list.get(i).xuat();
        }
        System.out.println();
    }


    public static void main(String[] args){
        /*NgayThang ngaySinh = new NgayThang ( 24, 7, 1991 );
        NgayThang ngayVaoLam = new NgayThang( 3, 12, 1998 );
        NhanVien nv= new NhanVien ( "Vu", "Lan Anh", ngaySinh, ngayVaoLam );
        JOptionPane.showMessageDialog( null, nv.toString(), "minh họa lớp Employee",
                JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );*/

        System.out.println("\n\t\t\t=== Nhap danh sach sinh vien ===\n");
        nhapDS();
        System.out.println("\n\t\t\t\t\t\t====> Danh sach nhan vien vua nhap <====\n");
        xuat();
    }
}
