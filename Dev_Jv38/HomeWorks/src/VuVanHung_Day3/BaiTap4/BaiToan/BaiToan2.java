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
        int tong = 0;
        for (int i=1; i<=n; i++){
            if(BaiToan1.check(i)){
                System.out.print(i + ", ");
                tong+=i;
            }
        }
        System.out.println("Tong cua n so nguyen to dau tien la: " + tong);
    }
}
