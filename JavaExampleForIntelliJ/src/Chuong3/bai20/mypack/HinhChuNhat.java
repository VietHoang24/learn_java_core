package Chuong3.bai20.mypack;

import java.util.Scanner;

public class HinhChuNhat {
    private float dai, rong;
    static Scanner input = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap chieu dai: ");
        dai = input.nextFloat();
        System.out.print("Nhap chieu rong: ");
        rong = input.nextFloat();
    }

    public float chuVi() { return (dai + rong) * 2; }

    public float dienTich() { return dai * rong; }

    public static void xuatTieuDe() { System.out.printf("%20s%20s%20s%20s%n", "ChieuDai", "ChieuRong", "ChuVi", "DienTich"); }

    public void xuat() { System.out.printf("%20.2f%20.2f%20.2f%20.2f%n", dai, rong, chuVi(), dienTich()); }
}
