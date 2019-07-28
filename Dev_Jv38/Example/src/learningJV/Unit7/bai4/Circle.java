package learningJV.Unit7.bai4;

import java.util.Scanner;

public class Circle implements Shape, IO {
    private double r;

    @Override
    public double erea() {
        return pi*r*r;
    }

    @Override
    public double perimeter() {
        return 2*pi*r;
    }

    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap r = ");
        r = in.nextDouble();
    }

    @Override
    public void output() {
        System.out.println("Hinh tron r = " + r);
        System.out.println("Chu vi = " + erea());
        System.out.println("Dien tich = " + perimeter());
    }
}
