package Chuong2.bai17;

import java.util.Scanner;

public class TachChuoi {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String a;
        System.out.print("Nhap chuoi: ");
        a = input.nextLine();

        System.out.println("Chuoi sau khi tach:");
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
                System.out.println("");
            else
                System.out.print(a.charAt(i));
        }
        if (a.charAt(a.length() - 1) != ' ')
            System.out.println(a.charAt(a.length() - 1));
    }
}
