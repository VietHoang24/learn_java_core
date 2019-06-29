package VuVanHung_Day1.Bai5;

import java.util.Scanner;

public class HinhHopChuNhat {
    private int a, b, h;
    static Scanner input = new Scanner(System.in);

    public HinhHopChuNhat() {
    }

    public HinhHopChuNhat(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void nhap(){
        System.out.print("Chieu dai: ");
        a = input.nextInt();
        System.out.print("Chieu rong: ");
        b = input.nextInt();
        System.out.print("Chieu cao: ");
        h = input.nextInt();
    }

    public int dienTichXungQuanh(){ return 2*h*(a+b); }

    public int dienTichToanPhan(){ return dienTichXungQuanh() + 2*a*b; }

    public int theTich(){ return a*b*h; }

    public void xuat(){
        System.out.printf("%20s%20s%20s%20s%20s%20s%n", "Chieu Dai", "Chieu Rong",
                "Chieu Cao", "Dien Tich XQ", "Dien Tich TP", "The Tich");
        System.out.printf("%20d%20d%20d%20d%20d%20d%n", a, b, h, dienTichXungQuanh(), dienTichToanPhan(), theTich());
    }
}
