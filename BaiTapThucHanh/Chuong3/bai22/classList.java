import java.util.ArrayList;
import java.util.Scanner;

public class classList {
    private ArrayList<classPTB2> list;
    static Scanner input = new Scanner(System.in);

    public void nhap() {
        list = new ArrayList<classPTB2>();
        System.out.print("So luong phuong trinh bac hai la: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("- Phuong trinh thu " + (i + 1) + ": ");
            classPTB2 a = new classPTB2();
            a.nhap();
            list.add(a);
        }
    }

    public void xuat() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("PT" + (i + 1) + ": ");
            list.get(i).inTieuDe();
        }
        System.out.println();
    }
}