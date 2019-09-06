package VuVanHung_Day2.bai9;

import java.util.Scanner;

public class TimMax {
    public static PhanTu nhap(){
        PhanTu x = new PhanTu();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap cac phan tu");

        System.out.print("a = ");
        int a = input.nextInt();
        x.setA(a);

        System.out.print("b = ");
        int b = input.nextInt();
        x.setB(b);

        System.out.print("c = ");
        int c = input.nextInt();
        x.setC(c);

        return x;
    }

    public static int max(PhanTu x){
        int MAX = x.getA();
        if(x.getA()<x.getB())
            MAX = (x.getB()>x.getC()) ? x.getB() : x.getC();
        return MAX;
    }

    public static void main(String[] args) {
        PhanTu x = new PhanTu();
        x = nhap();
        System.out.println("Gia tri lon nhat trong ba so (" +
                x.getA() + ", " + x.getB() + ", " + x.getC() + ") la: " + max(x));
    }
}
