package learningJV.Unit7.bai4;

import java.util.Scanner;

public class Rectangle implements Shape, IO{
    private double d, r;
    static Scanner input = new Scanner(System.in);

    @Override
    public void input() {
        System.out.print("Chieu dai: ");
        d = input.nextDouble();
        System.out.print("Chieu rong: ");
        r = input.nextDouble();
    }

    @Override
    public void output() {
        System.out.println("HCN co: CD = " + d + " CR = " + r);
        System.out.println("Chu vi: " + erea());
        System.out.println("Dien tich: " + perimeter());
    }

    @Override
    public double erea() {
        return d+r;
    }

    @Override
    public double perimeter() {
        return d*r;
    }
}
