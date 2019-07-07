package VuVanHung_Day3.BaiTap2.BaiToan;

import java.util.Scanner;

public class BaiToan4 {
    private static double ax, ay, bx, by, cx, cy;
    private static double ab, bc, ac;
    static Scanner input = new Scanner(System.in);

    public static void nhap(){
        System.out.println("Nhap toa do cac diem");
        System.out.print("xA = ");
        ax = input.nextDouble();
        System.out.print("yA = ");
        ay = input.nextDouble();
        System.out.print("xB = ");
        bx = input.nextDouble();
        System.out.print("yB = ");
        by = input.nextDouble();
        System.out.print("xC = ");
        cx = input.nextDouble();
        System.out.print("yC = ");
        cy = input.nextDouble();

        ab = Math.sqrt((bx-ax)*(bx-ax)+(by-ay)*(by-ay));
        bc = Math.sqrt((bx-cx)*(bx-cx)+(by-cy)*(by-cy));
        ac = Math.sqrt((cx-ax)*(cx-ax)+(cy-ay)*(cy-ay));
    }

    public static boolean check(){
        if(ab+bc>ac && ab+ac>bc && bc+ac>ab && ab>0 && bc>0 && ac>0)
            return true;
        else
            return false;
    }

    public static double chuVi(){
        return ab+bc+ac;
    }

    public static double dienTich(){
        double s = chuVi()/2;
        return Math.sqrt(s*(s-ab)*(s-bc)*(s-ac));
    }

    public static double banKinh(){
        return (ab*bc*ac)/(4*dienTich());
    }

    public static void xuat(){
        if(check()){
            System.out.println("Ba diem A, B, C khong thang hang.");
            System.out.println("Chu vi tam giac la: " + chuVi());
            System.out.println("Dien tich tam giac la: " + dienTich());
            System.out.println("Ban kinh duong tron ngoai tiep la: " + banKinh());
        } else
            System.out.printf("Ba diem A, B, C thang hang.");
    }
}
