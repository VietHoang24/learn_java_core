package VuVanHung_Day3.BaiTap2.BaiToan;

import java.util.Scanner;

public class BaiToan2 {
    private static double x;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap x: ");
        x = input.nextDouble();
    }

    public static double tinhGT(){
        double y = 0;
        if(x>=3)
            y = (x+3)*(x+3);
        else if(2<x && x<3)
            y = 5*Math.cos(3*x+2)-Math.log(2*x+2);
        else
            y = 1;
        return y;
    }

    public static void xuat(){
        System.out.println("Gia tri cua bieu thuc y = " + tinhGT());
    }
}
