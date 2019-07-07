package vn.Unit3.BaiTap3.BaiToan2;

import java.util.Scanner;

public class SoDaoNguoc {
    private static long n;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap n: ");
        n = input.nextLong();
        while (n<10){
            System.out.print("Yeu cau nhap n co 2 chu so, moi nhap lai: ");
            n = input.nextLong();
        }
    }

    public static long DaoNguoc(){
        long m = 0, r, tg = n;
        while(n>0){
            r = n%10;
            m = m*10+r;
            n/=10;
        }
        n = tg;
        return m;
    }

    public static void xuat() {
        System.out.println("So dao nguoc cua " + n + " la: " + DaoNguoc());
    }
}
