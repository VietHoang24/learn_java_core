package VuVanHung_Day3.BaiTap4.BaiToan;

import java.util.Scanner;

public class BaiToan4 {
    private static double x;
    private static int i;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap x: ");
        x = input.nextDouble();
        System.out.print("Nhap i: ");
        i = input.nextInt();
    }

    public static double giaiThua(int n){
        if(n==0)
            return 1;
        else
            return (n*giaiThua(n-1));
    }

    public static double tinhSinx(){
        double kq = x;
        for(int j=1; j<=i; i++){
            double tu = Math.pow(x, 2*j+1);
            double mau = giaiThua(2*j+1);
            kq += (Math.pow(-1, j))*(tu/mau);
        }
        return kq;
    }

    public static void xuat(){
        System.out.println("Dang tinh toan, vui long cho ...");
        System.out.println("Sin(x) = " + tinhSinx());
    }
}
