package learningJV.Unit3.BaiTap1.BaiToan4;

import java.util.Scanner;

public class Date {
    private static int nam, thang;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Thang: ");
        thang = input.nextInt();
        while (thang<0 || thang>12){
            System.out.print("Thang khong hop le, moi nhap lai: ");
            thang = input.nextInt();
        }
        System.out.print("Nam: ");
        nam = input.nextInt();
        while (nam%100==0){
            System.out.print("Nam vua nhap la nam the ky, moi nhap lai: ");
            nam = input.nextInt();
        }
        input.nextLine();
    }

    public static void check(){
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + thang + " co 31 ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + thang + " co 30 ngay.");
                break;
            case 2:
                if(nam%4==0){
                    System.out.println("Thang " + thang + " co 29 ngay.");
                    break;
                } else {
                    System.out.println("Thang " + thang + " co 28 ngay.");
                    break;
                }
                default:
                    return;
        }
    }
}
