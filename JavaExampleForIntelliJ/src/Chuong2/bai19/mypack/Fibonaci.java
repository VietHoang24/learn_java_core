package Chuong2.bai19.mypack;

import java.util.Scanner;

public class Fibonaci {
    private int n;
    static Scanner input = new Scanner(System.in);

    public int fibonaciFind(int viTri) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (viTri < 0)
            return -1;
        else {
            if (viTri == 0 || viTri == 1) {
                return viTri;
            } else {
                for (int i = 2; i < viTri; i++) {
                    f0 = f1;
                    f1 = fn;
                    fn = f0 + f1;
                }
            }
        }
        return fn;
    }

    public void nhapSoPhanTu() {
        System.out.print("Nhap so phan tu can in: ");
        n = input.nextInt();
    }

    public void xuatDayFibonaci() {
        System.out.print(n + " phan tu dau tien trong day Fibonaci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonaciFind(i) + ", ");
        }
        System.out.println();
    }
}
