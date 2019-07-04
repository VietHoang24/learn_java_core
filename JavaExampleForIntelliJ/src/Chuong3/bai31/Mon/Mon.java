package Chuong3.bai31.Mon;

import java.util.Scanner;

public class Mon {
    private String tenMon;
    private int soHocTrinh;
    private String hocKy;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ten mon hoc: ");
        tenMon = input.nextLine();
        System.out.print("So hoc trinh: ");
        soHocTrinh = input.nextInt();
        input.nextLine();
        System.out.print("Hoc ky: ");
        hocKy = input.nextLine();
    }

    public void xuat(){

    }
}
