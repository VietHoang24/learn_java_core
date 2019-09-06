package Chuong2.bai15;

import java.util.Scanner;

public class SoSanhChuoi {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String a, b;
        System.out.print("Nhap vao chuoi thu nhat: ");
        a = input.nextLine();
        System.out.print("Nhap vao chuoi thu hai: ");
        b = input.nextLine();
        if (a.equalsIgnoreCase(b))
            System.out.println("Hai chuoi bang nhau");
        else
            System.out.println("Hai chuoi khong bang nhau");
    }
}
