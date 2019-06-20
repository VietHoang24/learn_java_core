import java.util.Scanner;
import java.text.DecimalFormat;

public class HinhCau {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double banKinh;
        do {
            System.out.print("Nhap ban kinh hinh cau: ");
            banKinh = input.nextFloat();
        } while (banKinh < 0);
        double dienTich = 4 * Math.PI * banKinh * banKinh;
        double theTich = (float) 4 / 3 * Math.PI * Math.pow(banKinh, 3.0);
        DecimalFormat df = new DecimalFormat("###,###.####");
        System.out.println("\nDien tich hinh cau: " + df.format(dienTich));
        System.out.println("The tich hinh cau: " + df.format(theTich));
    }
}
