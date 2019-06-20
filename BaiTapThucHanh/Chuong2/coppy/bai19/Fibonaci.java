import mypack.Process;
import java.util.Scanner;

public class Fibonaci {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Process a = new Process();

        System.out.println("- Day Fibonaci");
        a.nhapSoPhanTu();
        a.xuatDayFibonaci();

        int viTri;
        System.out.println("- So Fibonaci tai vi tri bat ky");
        System.out.print("Nhap vi tri can tim: ");
        viTri = input.nextInt();
        System.out.println("Gia tri tai vi tri thu " + viTri + " la: " + a.fibonaciFind(viTri));
    }
}