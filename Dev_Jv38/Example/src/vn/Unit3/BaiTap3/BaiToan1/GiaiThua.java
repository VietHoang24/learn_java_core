package vn.Unit3.BaiTap3.BaiToan1;

import java.util.Scanner;

public class GiaiThua {
    private static int n;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap n: ");
        n = input.nextInt();
        while (n<0){
            System.out.print("Yeu cau n>0, moi nhap lai: ");
            n = input.nextInt();
        }
    }

    public static double giaiThua(int n){
        if(n==0)
            return 1;
        else
            return (n*giaiThua(n-1));
    }

    public static void xuat(){
        System.out.println("Ket qua: " + n + "! = " + giaiThua(n));
    }
}
