import java.util.Scanner;

public class NoiChuoi {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String a;
        int n;
        System.out.print("Nhap chuoi: ");
        a = input.nextLine();
        System.out.print("Nhap so nguyen: ");
        n = input.nextInt();
        System.out.print("Chuoi moi: ");
        if (n < 2)
            System.out.println(a);
        else {
            for (int i = 0; i < n; i++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}