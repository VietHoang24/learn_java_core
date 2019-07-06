package Chuong3.bai31.SinhVien;

import Chuong3.bai31.Mon.Mon;
import Chuong3.bai31.Ngay.Date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private Date ngaySinh = new Date();
    private ArrayList<Mon> list;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ho ten: ");
        hoTen = input.nextLine();
        System.out.println("- Nhap ngay sinh");
        ngaySinh.nhap();

        System.out.println("- Nhap cac mon hoc");
        list = new ArrayList<Mon>();
        System.out.print("Nhap tong so mon hoc: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("=> Mon thu " + (i+1));
            Mon a = new Mon();
            a.nhap();
            list.add(a);
        }
    }

    public static void inTieuDe(){
        System.out.printf("%20s%20s%20s%20s%n", "Ten Mon Hoc", "So Hoc Trinh", "Hoc Ky", "Diem Thi");
    }

    public void xuat(){
        System.out.println("\t\tHo ten: " + hoTen);
        System.out.print("\t\tNgay sinh: "); ngaySinh.xuat();
        System.out.println("\n\t\t\t\t\t\t\t\t====> Danh sach mon hoc <====");
        inTieuDe();
        for (Mon a : list) {
            a.xuat();
        }
    }

    public void sapXep(){
        Collections.sort(list, new Comparator<Mon>() {
            @Override
            public int compare(Mon mon1, Mon mon2) {
                if(mon1.getDiemThi() > mon2.getDiemThi())
                    return 1;
                else
                    return -1;
            }
        });
    }
}
