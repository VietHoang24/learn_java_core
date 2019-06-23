package mypack;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private ArrayList<NhanVien> list;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        list = new ArrayList<NhanVien>();
        System.out.print("Nhap vao so luong nhan vien: ");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("- Nhan vien thu "+(i+1)+":");
            NhanVien a = new NhanVien();
            a.nhap();
            list.add(a);
        }
    }

    public void xuat(){
        NhanVien.xuatTieuDe();
        for(int i=0; i<list.size(); i++){
            list.get(i).inDuLieu();
        }
    }

    public void inSinhVienVuotChuan(){
        NhanVien.xuatTieuDe();
        for (int i=0; i<list.size(); i++) {
            if(list.get(i).coVuotChuan())
                list.get(i).inDuLieu();
        }
    }
}
