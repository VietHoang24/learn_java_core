import java.util.Scanner;

public class bai2 {
    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        float result;
        int choice;
        do {
            System.out.println("1.Nhap 2 so nguyen");
            System.out.println("2.Tong 2 so nguyen");
            System.out.println("3.Hieu 2 so nguyen");
            System.out.println("4.Tich 2 so nguyen");
            System.out.println("5.Thuong 2 so nguyen");
            System.out.println("6.Thoat khoi lua chon");
            System.out.println("Moi ban nhap vao lua chon: ");
            choice = sn.nextInt();
            sn.nextLine();
            switch (choice) {
            case 1:
                System.out.println("Nhap so thu nhat: ");
                num1 = sn.nextInt();
                System.out.println("Nhap so thu hai: ");
                num2 = sn.nextInt();
                continue;
            case 2:
                result = num1 + num2;
                System.out.println("Tong hai so: " + result);
                break;
            case 3:
                result = num1 - num2;
                System.out.println("Hieu hai so: " + result);
                break;
            case 4:
                result = num1 * num2;
                System.out.println("Tich hai so: " + result);
                break;
            case 5:
                result = (float) num1 / num2;
                System.out.println("Thuong hai so: " + result);
                break;
            case 6:
                System.out.println("Thoat chuong trinh.");
                break;
            }
        } while (choice > 6);
    }
}