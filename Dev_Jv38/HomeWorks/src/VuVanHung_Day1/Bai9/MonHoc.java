package VuVanHung_Day1.Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class MonHoc extends SinhVien {
    private String tenMH;
    private int soTinChi;
    private int diemHeSo;
    private ArrayList<MonHoc> list;
    static Scanner input = new Scanner(System.in);

    //nhap thong tin cho 1 mon hoc
    public void nhapMonHoc(){
        System.out.print("Ten mon hoc: ");
        tenMH = input.nextLine();
        System.out.print("So tin chi: ");
        soTinChi = input.nextInt();
        System.out.print("Diem he so(<4): ");
        diemHeSo = input.nextInt();
        while (diemHeSo<0 || diemHeSo>4){
            System.out.print("Yeu cau nhap diem he so <4, moi nhap lai: ");
            diemHeSo = input.nextInt();
        }
        input.nextLine();
    }


    //nhap danh sach cac mon hoc
    public void nhapDs(){
        System.out.println("- Nhap thong tin sinh vien");
        super.nhap();

        System.out.println("- Nhap danh sach mon hoc");
        list = new ArrayList<MonHoc>();
        System.out.print("Tong so mon hoc: ");
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i<n; i++){
            System.out.println("- Mon hoc thu " + (i+1) + ":");
            MonHoc a = new MonHoc();
            a.nhapMonHoc();
            list.add(a);
        }
    }

    //tinh diem trung binh tich luy
    public double getDiemTB(){
        double tong = 0;
        int tongTinChi = 0;
        for(int i=0; i<list.size(); i++){
            tong += (list.get(i).diemHeSo * list.get(i).soTinChi);
            tongTinChi += list.get(i).soTinChi;
        }
        return tong/tongTinChi;
    }

    //xuat thong tin 1 mon hoc
    public void xuatMonHoc(){
        System.out.printf("%20s%20d%20d%20d%n", tenMH, soTinChi, diemHeSo, soTinChi*diemHeSo);
    }

    //xuat danh sach cac mon hoc
    public void xuatDs(){
        System.out.println("\n\t\t\t\t\t\t\t\tThong tin sinh vien\n");
        super.xuat();

        System.out.println("\n\t\t\t\t\t\t\t\tThong tin mon hoc\n");
        System.out.printf("%20s%20s%20s%20s%n", "Mon Hoc", "So Tin Chi", "Diem He 4", "Tinh");
        for(int i=0; i<list.size(); i++){
            list.get(i).xuatMonHoc();
        }
        System.out.println("\t=> Diem trung binh tich luy: " + getDiemTB());
    }
}
