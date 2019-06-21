package mypack;

import java.util.Scanner;

public class HinhTron {
    private double r;
    static Scanner input = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap ban kinh hinh tron: ");
        r = input.nextDouble();
    }

    public double chuVi() {
        return 2 * Math.PI * r;
    }

    public double dienTich() {
        return Math.PI * r * r;
    }

    public static void xuatTieuDe() {
        System.out.printf("%20s%20s%20s%n", "BanKinh", "ChuVi", "DienTich");
    }

    public void xuat() {
        System.out.printf("%20.2f%20.2f%20.2f%n", r, chuVi(), dienTich());
    }
}
