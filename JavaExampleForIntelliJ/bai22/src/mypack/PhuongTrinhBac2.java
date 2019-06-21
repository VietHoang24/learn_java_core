package mypack;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    private double a, b, c;
    private double x1, x2;
    static Scanner input = new Scanner(System.in);

    public void nhap() {
        System.out.print("a = ");
        a = input.nextDouble();
        while (a < 0) {
            System.out.print("Yeu cau nhap a>0, moi nhap lai: a = ");
            a = input.nextDouble();
        }
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();
    }

    public boolean giaiPhuongTrinh() {
        double delta = b * b - 4 * a * c;
        if (delta < 0)
            return false;
        else {
            if (delta == 0)
                x1 = x2 = -b / (2 * a);
            else {
                x1 = -b - Math.sqrt(delta) / (2 * a);
                x2 = -b + Math.sqrt(delta) / (2 * a);
            }
        }
        return true;
    }

    public void inTieuDe() {
        System.out.println(a + "x2 + " + b + "x + " + c);
        System.out.println();
    }

    public void inKetQua() {
        if (giaiPhuongTrinh())
            System.out.println("Phuong trinh co nghiem la: x1 = " + x1 + " va x2 = " + x2);
        else
            System.out.println("Phuong trinh vo nghiem.");
        System.out.println();
    }
}
