package mypack;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private ArrayList<CNhanVien> list;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        list = new ArrayList<CNhanVien>();
        System.out.print("Nhap vao so luong nhan vien: ");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Nhan vien thu " + (i+1) + ":");
            CNhanVien a = new CNhanVien();
            a.nhap();
            list.add(a);
        }
    }

    public void xuat(){
        CNhanVien.xuatTieuDe();
        for(int i=0; i<list.size(); i++){
            list.get(i).xuat();
        }
    }

    public void sort(){
        for(int i=1; i<list.size(); i++){
            for(int j=0; j<list.size()-i; j++){
                if(list.get(j).getLuong()>list.get(j+1).getLuong()){
                    CNhanVien tg = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, tg);
                }
            }
        }
    }
}
