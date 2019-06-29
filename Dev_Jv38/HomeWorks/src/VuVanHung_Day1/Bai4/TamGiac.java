package VuVanHung_Day1.Bai4;

import java.util.Scanner;

public class TamGiac {
    private int a, b, c;
    static Scanner input = new Scanner(System.in);

    public boolean kiemTraTamGiac(){
        if(a>0 && b>0 && c>0 && a+b>c && b+c>a && a+c>b)
            return true;
        else
            return false;
    }

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void nhap(){
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();
    }

    public int chuVi(){ return a+b+c; }

    public double dienTich(){
        double s = chuVi()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public void xuat(){
        if(kiemTraTamGiac()){
            System.out.println("=> La tam giac");
            System.out.printf("%20s%20s%20s%20s%20s%n", "a", "b", "c", "Chu Vi", "Dien Tich");
            System.out.printf("%20d%20d%20d%20d%20.2f%n", a, b, c, chuVi(), dienTich());
        } else {
            System.out.println("=> Khong la tam giac");
        }
    }
}
