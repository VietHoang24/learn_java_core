package mypack;
import java.util.Scanner;

public class KhoangCachDiem {
    public int x1, y1, x2, y2;
    static Scanner input = new Scanner(System.in);

    public void nhapDiem() {
        System.out.print("Nhap x1: ");
        x1 = input.nextInt();
        System.out.print("Nhap y1: ");
        y1 = input.nextInt();
        System.out.print("Nhap x2: ");
        x2 = input.nextInt();
        System.out.print("Nhap y2: ");
        y2 = input.nextInt();
    }

    public double khoangCach() {
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return distance;
    }
}
