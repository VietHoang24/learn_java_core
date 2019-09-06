package Chuong3.bai36.Process;

import Chuong3.bai36.Module.Date;
import java.util.Scanner;

public class inputDate {
    static Scanner input = new Scanner(System.in);

    public static void nhapDate(Date date){
        System.out.print("Ngay: ");
        int ngay = input.nextInt();
        date.setNgay(ngay);

        System.out.print("Thang: ");
        int thang = input.nextInt();
        date.setThang(thang);

        System.out.print("Nam: ");
        int nam = input.nextInt();
        date.setNam(nam);
    }
}
