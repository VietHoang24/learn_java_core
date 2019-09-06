package VuVanHung_Day3.BaiTap4.BaiToan;

import java.util.Scanner;

public class BaiToan1 {
    private static int n;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap so can kiem tra: ");
        n = input.nextInt();
    }

    public static boolean check(int n){
        int kt = 1;
        if(n<2) kt = 0;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void xuat(){
        if (check(n))
            System.out.println("So vua nhap la so nguyen to.");
        else
            System.out.println("So vua nhap khong la so nguyen to.");
    }

}
