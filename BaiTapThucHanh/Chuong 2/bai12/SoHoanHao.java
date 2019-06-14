import java.util.Scanner;

public class SoHoanHao {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        System.out.print("Nhap vao so bat ky: ");
        a = input.nextInt();
        int kq = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                kq += i;
        }
        if (kq == a)
            System.out.println("So vua nhap la so hoan hao.");
        else
            System.out.println("So vua nhap khong la so hoan hao.");
    }
}