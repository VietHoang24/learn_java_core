import java.util.Scanner;

public class TachSo {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        System.out.print("Nhap vao so bat ky: ");
        a = input.nextInt();
        System.out.print("In nguoc lai so vua nhap:");
        while (a > 0) {
            System.out.print(a % 10);
            a /= 10;
        }
        System.out.println();
    }
}