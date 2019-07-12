package vn.Unit4.Mang1Chieu;

import java.util.Scanner;

public class vd1 {
    static Scanner input = new Scanner(System.in);
    public static void nhap(int[] a){
        System.out.println("Nhap mang so nguyen: ");
        for(int i=0; i<a.length; i++){
            System.out.print("\t a[" + i + "] = ");
            a[i] = input.nextInt();
        }
    }

    public static void xuat(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + ", ");
        System.out.println();
    }

    public static void timKiem(int[] a, int x){
        int dem = 0;
        for (int i=0; i<a.length; i++){
            if(a[i]==x)
                dem++;
        }
        if(dem==0)
            System.out.println("\t- Phan tu " + x + " khong xuat hien trong mang.");
        else {
            System.out.println("\t- Phan tu " + x + " xuat hien " + dem + " lan.");
            System.out.print("\t- Cac vi tri xuat hien: ");
            for(int i=0; i<a.length; i++)
                if(a[i]==x)
                    System.out.print("a[" + (i+1) + "], ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] a = new int[n];
        nhap(a);
        System.out.print("Mang vua nhap: ");
        xuat(a);
        System.out.print("Nhap phan tu can tim: ");
        int x = input.nextInt();
        timKiem(a, x);
    }
}
