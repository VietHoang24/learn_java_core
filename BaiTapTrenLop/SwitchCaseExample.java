import java.util.Scanner;

public class SwitchCaseExample {
    static Scanner input = new Scanner(System.in);

    static int nhap(int n, char c) {
        System.out.print("Nhap " + c + " = ");
        n = input.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int a, b;
        nhap(SwitchCaseExample.a, 'a');
        nhap(SwitchCaseExample.b, 'b');
        System.out.println("a = " + a + ",b = " + b);
    }
}