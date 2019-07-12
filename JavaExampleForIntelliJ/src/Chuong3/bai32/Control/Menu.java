package Chuong3.bai32.Control;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        do {
            Choice.chooseList();
            System.out.print("Nhap lua chon cua ban: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            while (n<1 || n>4){
                System.out.print("Lua chon khong ton tai, moi nhap lai: ");
                n = input.nextInt();
            }
            input.nextLine();
            SwitchChoice.luaChon(n);
        } while (true);
    }
}
