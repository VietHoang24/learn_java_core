import mypack.CauTrucChon;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CauTrucChon a = new CauTrucChon();
        System.out.println("- Nhap cac so:");
        a.nhap();
        String x;
        System.out.print("Nhap ky tu bat ky: ");
        x = input.nextLine();
        x = x.trim(); // xoa khoang trang 2 dau
        char b = x.charAt(0); // lay ky tu dau tien
        switch (b) {
            case 'C':
            case 'c': {
                System.out.println("- Tong hai so vua nhap la: " + a.tong());
                break;
            }
            case 'T':
            case 't': {
                System.out.println("- Hieu hai so vua nhap la: " + a.hieu());
                break;
            }
            case 'N':
            case 'n': {
                System.out.println("- Tich hai so vua nhap la: " + a.tich());
                break;
            }
            case 'D':
            case 'd': {
                System.out.println("- Thuong hai so vua nhap la: " + a.thuong());
                break;
            }
            default:
                System.out.println("- Lua chon khong co chuc nang !!!");
        }
    }
}
