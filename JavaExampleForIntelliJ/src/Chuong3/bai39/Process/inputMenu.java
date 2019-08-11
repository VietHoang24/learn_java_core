package Chuong3.bai39.Process;

import java.util.Scanner;

public class inputMenu {
    static Scanner input = new Scanner(System.in);
    public static int enterChooce(){
        System.out.print("Nhap lua chon cua ban: ");
        int n = input.nextInt();
        while (n<0 || n>4){
            System.out.print("Lua chon khong ton tai, moi nhap lai: ");
            n = input.nextInt();
        }
        input.nextLine();
        return n;
    }
}
