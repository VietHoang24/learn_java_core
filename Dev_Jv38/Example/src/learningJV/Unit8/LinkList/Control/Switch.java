package learningJV.Unit8.LinkList.Control;

import learningJV.Unit8.LinkList.*;

import java.util.Scanner;

public class Switch {
    static Scanner in = new Scanner(System.in);
    static boolean endLoop = true;
    public static void chooceLv1(int n){
        switch (n){
            case 1:
                input.nhapDS();
                break;
            case 2:
                output.xuat();
                break;
            case 3:
                while (endLoop){
                    Listmenu.menuLv2();
                    int x = input.luaChon();
                    chooceLv2(x);
                }
                break;
            case 4:
                System.out.println("Thoat chuong trinh.");
                System.exit(0);
        }
    }

    public static void chooceLv2(int x){
        switch (x){
            case 1:
                edit.setCD();
                break;
            case 2:
                edit.setCR();
                break;
            case 3:
                System.out.println("... BACK ...");
                endLoop = false;
        }
    }
}
