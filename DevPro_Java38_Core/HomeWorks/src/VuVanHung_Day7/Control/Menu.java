package VuVanHung_Day7.Control;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static void menu(){
        do {
            ListMenu.list();
            System.out.print("Nhap lua chon cua ban: ");
            int n = input.nextInt();
            while (n<0 || n>10){
                System.out.print("Lua chon khong ton tai, moi nhap lai: ");
                n = input.nextInt();
            }
            input.nextLine();
            Switch.chooce(n);
        } while (true);
    }
}
