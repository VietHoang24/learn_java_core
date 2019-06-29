package VuVanHung_Day1.Bai3;

import java.util.Scanner;

public class TinhGiaTriBieuThuc {
    private int a, b;
    private float x;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("x = ");
        x = input.nextFloat();
    }

    public double ketQua(){
        double kq = ( float)a/10 + Math.pow(a, b)
                - (Math.sin( (Math.PI*x)/3)/(Math.sqrt((a+b)*(a+b)+5) )
                + Math.log(a*a+1) - ((Math.log(4*Math.pow(x, 2*a)+3)/Math.log(3)))/2.55 );
        return kq;
    }

    public void xuat(){
        System.out.println("Ket qua bieu thuc la: " + ketQua());
    }
}
