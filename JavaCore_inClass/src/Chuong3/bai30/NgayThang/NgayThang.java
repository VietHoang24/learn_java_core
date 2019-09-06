package Chuong3.bai30.NgayThang;

import java.util.Scanner;

public class NgayThang {
    private int ngay, thang, nam;
    static Scanner input = new Scanner(System.in);


    //phan mo rong
    public NgayThang() {
    }

    public void nhap(){
        System.out.print("Nam  : ");
        nam = input.nextInt();
        while (nam%100==0){
            System.out.print("Nam vua nhap la nam the ky, moi nhap lai: ");
            nam = input.nextInt();
        }

        System.out.print("Thang: ");
        thang = input.nextInt();
        while (thang<0 || thang>12){
            System.out.print("Thang vua nhap khong thoa man, moi nhap lai: ");
            thang = input.nextInt();
        }

        System.out.print("Ngay : ");
        ngay = input.nextInt();
        if ((thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12)&&(ngay<0||ngay>31)){
            System.out.print("Ngay vua nhap khong thoa man, moi nhap lai: ");
            ngay = input.nextInt();
        } else {
            if ((thang==4||thang==6||thang==9||thang==11)&&(ngay<0||ngay>30)){
                System.out.print("Ngay vua nhap khong thoa man, moi nhap lai: ");
                ngay = input.nextInt();
            } else {
                if (nam%4==0){
                    if(thang==2&&(ngay<0||ngay>29)){
                        System.out.print("Ngay vua nhap khong thoa man, moi nhap lai: ");
                        ngay = input.nextInt();
                    }
                } else {
                    if(thang==2&&(ngay<0||ngay>28)){
                        System.out.print("Ngay vua nhap khong thoa man, moi nhap lai: ");
                        ngay = input.nextInt();
                    }
                }
            }
        }

        input.nextLine();
    }


    //phan binh thuong
    public boolean checkDay(int ngay){
        int[] soNgay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
