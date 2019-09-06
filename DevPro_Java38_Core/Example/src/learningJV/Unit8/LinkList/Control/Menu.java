package learningJV.Unit8.LinkList.Control;

import java.util.Scanner;

public class Menu {
    static Scanner in = new Scanner(System.in);
    public static void menu(){
        do {
            Listmenu.menuLv1();
            System.out.print("Nhap lua chon cua ban: ");
            int n = in.nextInt();
            while (n<0 || n>4){
                System.out.print("nhap lai: ");
                n = in.nextInt();
            }
            Switch.chooceLv1(n);
        } while (true);
    }
}
