package VuVanHung_Day1.Bai10;

import java.util.Scanner;

public class TachSo {
    private int n;
    private int[] a = new int[4];
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("n = ");
        n = input.nextInt();
        while (999>n || n>10000){
            System.out.print("Yeu cau n co 4 chu so. Moi nhap lai: n = ");
            n = input.nextInt();
        }
    }

    public void tachSo(){
        int i = 0;
        while (n>0){
            a[i] = n%10;
            n/=10;
            i++;
        }
    }

    public int getTong(){
        int tong = 0;
        for (int i = 0; i<4; i++)
            tong+=a[i];
        return tong;
    }

    public void xuat(){
        for(int i=0; i<4; i++){
            System.out.print(a[i] + ", ");
        }
    }
}
