package Chuong3.bai22.mypack;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private ArrayList<PhuongTrinhBac2> list;
    static Scanner input = new Scanner(System.in);

    public void nhap() {
        list = new ArrayList<PhuongTrinhBac2>();
        System.out.print("So luong phuong trinh bac hai la: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("- Phuong trinh thu " + (i + 1) + ": ");
            PhuongTrinhBac2 a = new PhuongTrinhBac2();
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
