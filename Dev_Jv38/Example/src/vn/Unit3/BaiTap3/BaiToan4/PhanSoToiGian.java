package vn.Unit3.BaiTap3.BaiToan4;

import java.util.Scanner;

public class PhanSoToiGian {
    private static int tuSo, mauSo;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Tu so: ");
        tuSo = input.nextInt();
        System.out.print("Mau so: ");
        mauSo = input.nextInt();
        while (mauSo==0){
            System.out.print("Y/c mau so khac 0, moi nhap lai: ");
            mauSo = input.nextInt();
        }
    }

    public static int ucln(int a, int b){
        int r;
        if(a<b){
            r = a; a = b; b = r;
        }
        r = a%b;
        while (r!=0){
            a = b; b = r;
            r = a%b;
        }
        return b;
    }

    public static void xuat(){
        if(ucln(Math.abs(tuSo), Math.abs(mauSo))==1)
            System.out.println("Phan so da duoc toi gian.");
        else
            System.out.println("Phan so sau khi toi gian la: " + tuSo/ucln(Math.abs(tuSo), Math.abs(mauSo)) +
                    "/" + mauSo/ucln(Math.abs(tuSo), Math.abs(mauSo)));
    }
}
