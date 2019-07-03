package Chuong2.bai8.Main;

import Chuong2.bai8.mypack.KhoangCachDiem;

public class Main {
    public static void main(String[] args) {
        KhoangCachDiem a = new KhoangCachDiem();
        a.nhapDiem();
        System.out.println("Khoang cach giua hai diem la: " + a.khoangCach());
    }
}
