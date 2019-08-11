package FinalTest.Cau1.Process.ChoiceInMenu;

import java.util.Scanner;

public class enterChoice {
    static Scanner input = new Scanner(System.in);
    public static int enterChoice(){
        System.out.print("Nhap lua chon cua ban: ");
        int n = input.nextInt();
        while (n<0 || n>4){
            System.out.print("Lua chon khong ton tai, moi nhap lai.");
            n = input.nextInt();
        }
        input.nextLine();
        return n;
    }

    public static int iEnterChoice(){
        System.out.print("Nhap lua chon cua ban: ");
        int n = input.nextInt();
        while (n<0 || n>3){
            System.out.print("Lua chon khong ton tai, moi nhap lai.");
            n = input.nextInt();
        }
        input.nextLine();
        return n;
    }
}
