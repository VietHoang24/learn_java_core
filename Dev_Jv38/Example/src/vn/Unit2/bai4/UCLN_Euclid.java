package vn.Unit2.bai4;

import java.util.Scanner;

public class UCLN_Euclid {
    public static void swap(int a,int b){
            int tg = a; a = b;  b = tg;
    }

    public static int ucln(int a, int b){
        if(a%b==0)  return b;
        else return ucln(b, a%b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        if(a<b){ swap(a, b); }
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + ucln(a, b));
    }
}
