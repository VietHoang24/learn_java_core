package VuVanHung_Day3.BaiTap4.BaiToan;

import java.util.Scanner;

public class BaiToan2 {
    private static int n;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap n: ");
        n = input.nextInt();
    }

    public static void tongNguyenTo(){
        int tong = 0, dem = 0;
        int i = 2;
        System.out.print(n + " so nguyen to dau tien la: ");
        do {
            if(BaiToan1.check(i)){
                tong+=i;
                dem++;
                System.out.print(i + ", ");
            }
            i++;
        } while (dem<n);
        System.out.println("\n-> Tong cua n so nguyen to dau tien la: " + tong);
    }
}
