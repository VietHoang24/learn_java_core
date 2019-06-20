package mypack;
import java.util.Scanner;

public class PhuongTrinhBac1 {
    static public double a, b;
    static Scanner input = new Scanner(System.in);

    public void nhap() {
        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
    }

    public double giaiPhuongTrinh() {
        return -b / a;
    }
}
