package Chuong2.bai13;

import java.util.Scanner;

public class XuLyChuoi {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String a;
        System.out.print("Nhap chuoi: ");
        a = input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ')
                System.out.println();
            else
                System.out.print(a.charAt(i));
        }
        System.out.println();
    }
}
