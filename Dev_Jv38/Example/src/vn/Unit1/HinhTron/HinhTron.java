package vn.devpro.HinhTron;

import java.util.Scanner;

public class HinhTron {
    private double r;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.println("Nhap ban kinh: ");
        r = input.nextDouble();
    }

    public double chuVi(){
        return 4*Math.PI*r;
    }

    public double dienTich(){
        return Math.PI*r*r;
    }

    public void xuat(){
        System.out.println("Chu vi hinh tron: " + chuVi());
        System.out.println("Dien tich hinh tron: " + dienTich());
    }
}
