package VuVanHung_Day7.Control;

import VuVanHung_Day7.Module.*;

public class Switch {
    public static void chooce(int n){
        switch (n){
            case 1:
                System.out.println("\t-> Nhap danh sach can bo.");
                inputList.nhapCB();
                break;
            case 2:
                System.out.println("\t-> Nhap danh sach cong nhan.");
                inputList.nhapCN();
                break;
            case 3:
                System.out.println("\t-> Hien thi danh sach nhan su.");
                outputList.outputNhanSu();
                break;
            case 4:
                System.out.println("\t-> Hien thi danh sach cong nhan nam.");
                outputList.outputCongNhanNam();
                break;
            case 5:
                System.out.println("\t-> Hien thi can bo nu.");
                outputList.outputCanBoNu();
                break;
            case 6:
                System.out.println("\t-> Hien thi can bo luong cao nhat.");
                outputList.ouputCanBoLuongMax();
                break;
            case 7:
                System.out.println("\t-> Hien thi cong nhan luong thap nhat.");
                outputList.ouputCongNhanLuongMin();
                break;
            case 8:
                System.out.println("\t-> Tong luong can bo va cong nhan.");
                outputList.tongLuongCanBo();
                outputList.tongLuongCongNhan();
                break;
            case 9:
                System.out.println("\t-> Chuyen cong nhan xuong cuoi danh sach.");
                outputList.outputNhanSu();
                break;
            case 10:
                System.out.println("\t-> Sap xep danh sach nhan su theo ten.");
                outputList.sapXepTen();
                outputList.outputNhanSu();
                break;
            case 0:
                System.out.println("\t---> Thoat chuong trinh <---");
                System.exit(0);
        }
    }
}
