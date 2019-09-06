package VuVanHung_Day3.BaiTap2.Menu;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void menu(){
        do{
            HienThiMenu.hienThi();
            System.out.print("Nhap lua chon cua ban: ");
            int n = input.nextInt();
            while (n<0||n>5){
                System.out.print("Lua chon khong ton tai, moi nhap lai: ");
                n = input.nextInt();
            }
            LuaChon.choose(n);
        } while (true);
    }
}
