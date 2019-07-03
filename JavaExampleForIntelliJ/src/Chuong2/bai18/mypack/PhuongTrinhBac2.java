package Chuong2.bai18.mypack;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    private double a, b, c;
    static Scanner input = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap a = ");
        a = input.nextDouble();
        while (a < 0) {
            System.out.print("Yeu cau nhap a>0, moi nhap lai: a = ");
            a = input.nextDouble();
        }
        System.out.print("Nhap b = ");
        b = input.nextDouble();
        System.out.print("Nhap c = ");
        c = input.nextDouble();
    }

    public void xuLy() {
        double delta = b * b - 4 * a * c;
        if (delta < 0)
            System.out.println("Phuong trinh vua nhap vo nghiem.");
        else {
            if (delta == 0)
                System.out.println("Phuong trinh vua nhap co nghiem kep: x1 = x2 = " + (-b / (2 * a)));
            else
                System.out.println("Phuong trinh vua nhap co hai nghiem phan biet: x1 = "
                        + (-b - Math.sqrt(delta) / (2 * a)) + " va x2 = " + (-b + Math.sqrt(delta) / (2 * a)));
        }
    }
}
