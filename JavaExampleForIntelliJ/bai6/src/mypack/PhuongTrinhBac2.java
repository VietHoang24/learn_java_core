package mypack;
import java.util.Scanner;

public class PhuongTrinhBac2 {
    static public double a, b, c;
    static Scanner input = new Scanner(System.in);

    public void nhap() {
        System.out.println("Nhap vao cac he so cua phuong trinh:");
        System.out.print("a = ");
        a = input.nextDouble();
        while (a < 0) {
            System.out.print("Yeu cau nhap a>0; moi nhap lai:\na = ");
            a = input.nextDouble();
        }
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();
    }

    public void giaiPhuongTrinh() {
        double delta = b * b - 4 * a * c;
        if (delta < 0)
            System.out.println("Phouong trinh da cho vo nghiem.");
        else {
            if (delta == 0)
                System.out.println("Phuong trinh da cho co nghiem kep: x1 = x2 = " + -b / (2 * a));
            else
                System.out.println("Phuong trinh da cho co hai nghiem phan biet: x1 = " + (-b - Math.sqrt(delta)) / (2 * a)
                        + " va x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
        }
    }
}
