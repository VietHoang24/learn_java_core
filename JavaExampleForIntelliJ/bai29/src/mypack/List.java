package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class List {
    private ArrayList<SinhVien> list;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        list = new ArrayList<SinhVien>();
        System.out.print("So sinh vien can nhap: ");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("- Sinh vien thu " + (i+1) + ":");
            SinhVien a = new SinhVien();
            a.nhap();
            list.add(a);
        }
    }

    public void xuat(){
        System.out.println("\t->\tMaSV\t->\tHoTen\t->\tDiemLT\t->\tDiemTH\t->\tDiemTB\t->\tKetQua\n");
        for (SinhVien a : list) {
            System.out.println(a+a.getPass());
        }
    }

    public void sapXep(){
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.hoTen.compareTo(sv2.hoTen)>0)
                    return 1;
                else if(sv1.hoTen.compareTo(sv2.hoTen)==0){
                    if(sv1.diemLT >=sv2.diemLT)
                        return 1;
                    else
                        return -1;
                } else
                    return -1;
            }
        });
    }

    public float getDiemTBMax(){
        float MAX = list.get(0).diemTB;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).diemTB > MAX)
                MAX = list.get(i).diemTB;
        }
        return MAX;
    }

    public float getDiemTBMin(){
        float MIN = list.get(0).diemTB;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).diemTB < MIN)
                MIN = list.get(i).diemTB;
        }
        return MIN;
    }
}
