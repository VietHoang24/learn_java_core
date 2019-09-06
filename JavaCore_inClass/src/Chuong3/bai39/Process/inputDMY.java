package Chuong3.bai39.Process;

import Chuong3.bai39.Module.DMY;

import java.util.Scanner;

public class inputDMY {
    static Scanner input = new Scanner(System.in);
    public static void nhapDate(DMY date){
        System.out.print("Ngay: ");
        int ngay = input.nextInt();
        date.setNgay(ngay);

        System.out.print("Thang: ");
        int thang = input.nextInt();
        date.setThang(thang);

        System.out.print("Nam: ");
        int nam = input.nextInt();
        date.setNam(nam);
        input.nextLine();
    }
}
