import java.util.Scanner;

public class TamGiac {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Nhap vao thong so cac canh tam giac:");
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            System.out.println("Chu vi tam giac la: " + (a + b + c));
            float s = (a + b + c) / 2;
            System.out.println("Dien tich tam giac la: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        } else {
            System.out.println("3 canh vua nhap khong tao thanh mot tam giac.");
        }
    }
}
