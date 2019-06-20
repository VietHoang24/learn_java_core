import java.util.Scanner;

public class TimNgay {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int thang;
        int nam;
        System.out.print("Nhap vao thang bat ky: ");
        thang = input.nextInt();
        System.out.print("Nhap vao nam bat ky: ");
        nam = input.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("Thang " + thang + " co 31 ngay.");
                break;
            }
            case 2: {
                if (nam % 4 == 0 && nam % 100 != 0) {
                    System.out.println("Thang 2 co 29 ngay.");
                    break;
                } else {
                    System.out.println("Thang 2 co 28 ngay.");
                    break;
                }
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("Thang " + thang + " co 30 ngay.");
                break;
            }
        }
    }
}
