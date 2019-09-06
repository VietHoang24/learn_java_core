package Chuong3.bai31.Ngay;

import java.util.Scanner;

public class Date {
    private int ngay, thang, nam;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ngay: ");
        ngay = input.nextInt();
        System.out.print("Thang: ");
        thang = input.nextInt();
        System.out.print("Nam: ");
        nam = input.nextInt();
        input.nextLine();
    }

    public void xuat(){ System.out.print(ngay + "/" + thang + "/" + nam); }
}
