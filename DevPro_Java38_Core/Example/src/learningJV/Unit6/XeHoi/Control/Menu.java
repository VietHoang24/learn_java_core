package learningJV.Unit6.XeHoi.Control;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        do {
            ListMenu.list();
            System.out.print("Nhap lua chon cua ban: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            while (n<0 || n>3){
                System.out.print("Lua chon khong ton tai, moi nhap lai: ");
                n = input.nextInt();
            }
            input.nextLine();
            Switch.choose(n);
        } while (true);
    }
}
