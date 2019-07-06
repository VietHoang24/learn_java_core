package VuVanHung_Day2.bai5;

import java.util.Scanner;

public class Fibonacci {
    private static int n;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap vi tri can tim: ");
        n = input.nextInt();
    }

    public static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        nhap();
        System.out.println("So fibonacci tai vi tri " + n + " la: " + fibonacci(n));
    }
}
