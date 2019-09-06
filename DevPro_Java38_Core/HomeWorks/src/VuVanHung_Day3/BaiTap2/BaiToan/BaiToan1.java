package VuVanHung_Day3.BaiTap2.BaiToan;

import java.util.Scanner;

public class BaiToan1 {
    private static int n;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap vao so co mot chu so: ");
        n = input.nextInt();
        while (n<0 || n>9){
            System.out.print("So vua nhap khong thoa man, moi nhap lai: ");
            n = input.nextInt();
        }
    }

    public static void docSo(){
        switch (n){
            case 0:
                System.out.println("So vua nhap doc la: SO KHONG");
                break;
            case 1:
                System.out.println("So vua nhap doc la: SO MOT");
                break;
            case 2:
                System.out.println("So vua nhap doc la: SO HAI");
                break;
            case 3:
                System.out.println("So vua nhap doc la: SO BA");
                break;
            case 4:
                System.out.println("So vua nhap doc la: SO BON");
                break;
            case 5:
                System.out.println("So vua nhap doc la: SO NAM");
                break;
            case 6:
                System.out.println("So vua nhap doc la: SO SAU");
                break;
            case 7:
                System.out.println("So vua nhap doc la: SO BAY");
                break;
            case 8:
                System.out.println("So vua nhap doc la: SO TAM");
                break;
            case 9:
                System.out.println("So vua nhap doc la: SO CHIN");
                break;
        }
    }
}
