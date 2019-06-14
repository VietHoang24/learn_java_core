package mypack;

import java.util.Scanner;

public class Process {
    static Scanner input = new Scanner(System.in);
    public double a, b;

    public void nhap() {
        System.out.print("Nhap a: ");
        a = input.nextDouble();
        System.out.print("Nhap b: ");
        b = input.nextDouble();
    }

    public double tong() {
        return a + b;
    }

    public double hieu() {
        return a - b;
    }

    public double tich() {
        return a * b;
    }

    public double thuong() {
        return a / b;
    }
}