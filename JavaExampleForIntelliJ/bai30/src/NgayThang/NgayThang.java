package NgayThang;

import java.util.Scanner;

public class NgayThang {
    private int ngay, thang, nam;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Ngay : ");
        ngay = input.nextInt();
        System.out.print("Thang: ");
        thang = input.nextInt();
        System.out.print("Nam  : ");
        nam = input.nextInt();
        input.nextLine();
    }

    public boolean checkDay(int ngay){
        int[] soNgay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(ngay>0 && ngay<=soNgay[thang])
            return true;
        else {
            if(thang==2 && ngay==29 && nam%4==0 || nam%100!=0)
                return true;
            else
                return false;
        }
    }

    public NgayThang(int ngay, int thang, int nam) {
        //ngay
        if(checkDay(ngay))
            this.ngay = ngay;
        else
            this.ngay = 1;
        //thang
        if(thang>0 && thang<12)
            this.thang = thang;
        else
            this.thang = 1;
        //nam
        this.nam = nam;
    }

    public String toString(){
        return ngay + "/" + thang + "/" + nam;
    }
}
