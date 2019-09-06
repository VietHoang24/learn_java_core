package Chuong3.bai34.Process;

import Chuong3.bai34.Module.Date;

import java.util.Scanner;

public class intputDate extends inputPhieuNhapSach {
    static Scanner input = new Scanner(System.in);
    public static void nhap(){
        Date a = new Date();

        System.out.print("Ngay: ");
        int ngay = input.nextInt();
        a.setNgay(ngay);

        System.out.print("Thang: ");
        int thang = input.nextInt();
        a.setThang(thang);

        System.out.print("Nam: ");
        int nam = input.nextInt();
        a.setNam(nam);
        input.nextLine();

        listDate.add(a);
    }
}
