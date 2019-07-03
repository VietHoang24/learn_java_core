package Chuong3.bai25.Main;

import Chuong3.bai25.mypack.List;
import Chuong3.bai25.mypack.XeDemo;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        XeDemo a = new XeDemo();
        List b = new List();
        do {
            System.out.println("\n\t\t--- Menu ---");
            System.out.println("1. Nhap vao thong tin cho 1 xe.");
            System.out.println("2. Nhap vao thong tin 1 danh sach xe.");
            System.out.println("3. Xuat thong tin xe vua nhap.");
            System.out.println("4. Xuat thong tin danh sach xe.");
            System.out.println("5. Thoat.");
            System.out.print("Nhap lua chon: ");
            n = input.nextInt();

            switch (n){
                case 1:{
                    System.out.println("\n\t\t\t- Nhap thong tin cho 1 xe\n");
                    a.nhap();
                    break;
                }
                case 2:{
                    System.out.println("\n\t\t\t- Nhap thong tin cho 1 danh sach xe\n");
                    b.nhap();
                    break;
                }
                case 3:{
                    System.out.println("\n\t\t\t\t\t\t\t\t\t- Xuat thong tin xe vua nhap\n");
                    XeDemo.inTieuDe();
                    a.xuat();
                    break;
                }
                case 4:{
                    System.out.println("\n\t\t\t\t\t\t\t\t\t- Xuat thong tin danh sach xe\n");
                    b.xuat();
                    break;
                }
                case 5:{
                    System.out.println("\n------------- Thoat chuong trinh!!! ---------------");
                    return;
                }
                default:{
                    System.out.println("Ohs!!!... Lua chon khong ton tai...");
                    while (n<1 || n>5){
                        System.out.print("=> Moi nhap lai: ");
                        n = input.nextInt();
                    }
                }
            }

            /*if (n == 1) {
                System.out.println("- Nhap thong tin cho 1 xe");
                a.nhap();
            } else {
                if (n == 2) {
                    System.out.println("- Nhap thong tin cho 1 danh sach xe");
                    b.nhap();
                } else {
                    if (n == 3) {
                        System.out.println("- Xuat thong tin xe vua nhap");
                        XeDemo.inTieuDe();
                        a.xuat();
                    } else {
                        if (n == 4) {
                            System.out.println("- Xuat thong tin danh sach xe");
                            b.xuat();
                        } else{
                            if(n==5)    return;
                            else{
                                System.out.println("Lua chon khong ton tai.");
                                while (n<1 || n>5){
                                    System.out.println("Moi nhap lai: ");
                                    n = input.nextInt();
                                }
                            }
                        }
                    }
                }
            }*/

        } while(true);
    }
}
