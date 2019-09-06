package Chuong3.bai33.Control;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static void menu(){
        do {
            ListMenu.listMenu();
            System.out.print("\t-> Nhap lua chon cua ban: ");
            int n = input.nextInt();
            while (n<1 || n>4){
                System.out.print("Lua chon khong ton tai, moi nhap lai: ");
                n = input.nextInt();
            }
            input.nextLine();
            Switch.luaChon(n);
        } while (true);
    }
}
