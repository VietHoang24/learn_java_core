package learningJV.Unit8.QuanLyBanHang.Process.Input;

import java.util.Scanner;

public class Choice {
    static Scanner input = new Scanner(System.in);
    public static int enterChooce(){
        System.out.print("Nhap lua chon cua ban: ");
        int n = input.nextInt();
        input.nextLine();
        while (n<0 || n>6){
            System.out.print("Lua chon khong ton tai, moi nhap lai: ");
            n = input.nextInt();
        }
        return n;
    }
}
