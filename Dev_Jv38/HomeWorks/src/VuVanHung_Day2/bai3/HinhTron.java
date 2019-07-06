package VuVanHung_Day2.bai3;

import java.util.Scanner;

public class HinhTron {
    private static double r;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap ban kinh: ");
        r = input.nextDouble();
    }

    public static double chuVi(){
        return 2*r*Math.PI;
    }

    public static double dienTich(){
        return r*r*Math.PI;
    }

    public static void main(String[] args) {
        nhap();
        System.out.println("Chu vi hinh tron la: " + chuVi());
        System.out.println("Dien tich hinh tron la: " + dienTich());
    }
}
