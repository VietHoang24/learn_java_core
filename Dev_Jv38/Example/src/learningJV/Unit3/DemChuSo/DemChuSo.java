package learningJV.Unit3.DemChuSo;

import java.util.Scanner;

public class DemChuSo {
    public static int demCs(long n){
        int d=0;
        while(n>0){
            d++;
            n/=10;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = input.nextInt();
        System.out.println("So chu so cua " + n + " la: " + demCs(n));
    }
}
