package learningJV.Unit3.BaiTap3.BaiToan3;

import java.util.Scanner;
import static learningJV.Unit3.BaiTap3.BaiToan1.GiaiThua.giaiThua;

public class SaiSo {
    private static double x, esp;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.print("Nhap so thuc x: ");
        x = input.nextDouble();
        System.out.print("Nhap sai so: ");
        esp = input.nextDouble();
    }

    public static void tinhSaiSo(){
        double s = 1, val = 1;
        int i = 1;
        while (Math.abs(s)>=esp){
            s = Math.pow(x, i)/ giaiThua(i);
            val += s;
            i++;
        }
        System.out.println("e^" + x + " = " + val);
    }
}
