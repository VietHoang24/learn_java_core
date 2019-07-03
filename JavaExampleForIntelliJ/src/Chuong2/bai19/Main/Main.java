package Chuong2.bai19.Main;

import Chuong2.bai19.mypack.Fibonaci;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Fibonaci a = new Fibonaci();

        System.out.println("- Day Fibonaci");
        a.nhapSoPhanTu();
        a.xuatDayFibonaci();

        int viTri;
        System.out.println("- So Fibonaci tai vi tri bat ky");
        System.out.print("Nhap vi tri can tim: ");
        viTri = input.nextInt();
        System.out.println("Gia tri tai vi tri thu " + viTri + " la: " + a.fibonaciFind(viTri));
    }
}
