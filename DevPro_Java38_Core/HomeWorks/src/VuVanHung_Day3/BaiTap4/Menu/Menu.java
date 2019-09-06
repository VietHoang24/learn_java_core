package VuVanHung_Day3.BaiTap4.Menu;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void menu(){
        do{
            HienThi.listMenu();
            System.out.print("Nhap lua chon cua ban: ");
            int n = input.nextInt();
            while (n<0||n>6){
                System.out.print("Lua chon khong ton tai, moi nhap lai: ");
                n = input.nextInt();
            }
            LuaChon.choose(n);
        } while (true);
    }
}
