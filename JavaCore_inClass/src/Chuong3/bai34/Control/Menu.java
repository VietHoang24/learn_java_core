package Chuong3.bai34.Control;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static void menu(){
        do {
            ListMenu.list();
            System.out.print("Nhap lua chon cua ban: ");
            int n = input.nextInt();
            input.nextLine();
            Switch.choose(n);
        } while (true);
    }
}
