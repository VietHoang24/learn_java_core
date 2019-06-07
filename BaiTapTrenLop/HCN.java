import java.util.Scanner;

class DoDaiHCN {
    static Scanner input = new Scanner(System.in);
    int a, b;

    public void nhap() {
        System.out.print("Chieu dai: ");
        a = input.nextInt();
        System.out.print("Chieu rong: ");
        b = input.nextInt();
    }

    public void xuat() {
        System.out.println("Chieu dai: " + a + "\nChieu rong: " + b);
    }

    public static void main(String[] args) {
        DoDaiHCN x = new DoDaiHCN();
        x.nhap();
        x.xuat();
    }
}