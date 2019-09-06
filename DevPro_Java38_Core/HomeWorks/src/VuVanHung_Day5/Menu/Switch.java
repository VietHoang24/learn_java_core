package VuVanHung_Day5.Menu;

import VuVanHung_Day5.Process.*;

public class Switch {
    public static void luaChon(int n){
        switch (n) {
            case 1:
                System.out.println("\n------ DANH SACH TOAN BO VDV VA TONG THANH TICH -----");
                Function1.function1(); break;
            case 2:
                System.out.println("\n----- VDV CO TONG 3 LAN CU TA CAO NHAT -----");
                Function2.function2(); break;
            case 3:
                System.out.println("\n----- DANH SACH 3 VDV CO TONG TT CAO NHAT-----");
                Function3.function3(); break;
            case 4:
                System.out.println("\n----- DANH SACH VDV SAP XEP THEO TEN-----");
                Function4.function4(); break;
            case 5:
                System.out.println("\n----- DANH SACH VDV CO TEN BAT DAU BANG CHU 'T' -----");
                Function5.function5(); break;
            case 6:
                System.out.println("\n----- DANH SACH VDV TEN CO VAN 'AN' -----");
                Function6.function6(); break;
            case 7:
                System.out.println("\n----- DANH SACH VDV SAP XEP TANG DAN THEO CHIEU DAI TEN -----");
                Function7.function7(); break;
            case 8:
                System.out.println("\n----- DANH SACH VDV CO CUNG TONG THANH TICH -----");
                Function8.function8(); break;
            case 9:
                System.out.println("\n----- DANH SACH VDV CO LAN SU TA THU 3 CAO NHAT -----");
                Function9.function9(); break;
            case 10:
                System.out.println("\n----- DANH SACH VDV CO LAN CU TA THU 1 CAO NHAT -----");
                Function10.function10(); break;
            case 0:
                System.out.println("Thoat chuong trinh.");
                System.exit(0);
        }
    }
}
