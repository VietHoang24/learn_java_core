import java.util.Scanner;

public class bai3 {
    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int tongNguoc = 0;
        System.out.print("Moi nhap so can kiem tra: ");
        num = sn.nextInt();
        int soDu;
        int cat = num;
        while (num != 0) {
            soDu = num % 10;
            tongNguoc = tongNguoc * 10 + soDu;
            num /= 10;
        }
        if (cat == tongNguoc)
            System.out.println("So " + cat + " la so dao nguoc");
        else
            System.out.println("So " + cat + " khong la so dao nguoc");
    }
}