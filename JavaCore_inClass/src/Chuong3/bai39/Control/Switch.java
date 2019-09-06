package Chuong3.bai39.Control;

import Chuong3.bai39.Process.*;

public class Switch {
    static boolean endLoop = true;
    public static void chooceMain(int n){
        switch (n){
            case 1:
                while (endLoop){
                    ListMenu.listInput();
                    int in = inputMenu.enterChooce();
                    chooceInput(in);
                }
                break;
            case 2:
                endLoop = true;
                while (endLoop){
                    ListMenu.listOutput();
                    int out = inputMenu.enterChooce();
                    chooceOutput(out);
                }
                break;
            case 3:
                endLoop = true;
                while (endLoop){
                    ListMenu.listAdd();
                    int a = inputMenu.enterChooce();
                    chooceAdd(a);
                }
                break;
            case 4:
                System.out.println("\t==> THOAT CHUONG TRINH <==");
                System.exit(0);
        }
    }

    public static void chooceInput(int i){
        switch (i){
            case 1:
                inputHangThucPham.nhapDSTP();
                break;
            case 2:
                inputHangDienMay.nhapDSDM();
                break;
            case 3:
                inputHangSanhSu.nhapDSSS();
                break;
            case 4:
                System.out.println("... back to main menu ...");
                endLoop = false;
        }
    }

    public static void chooceOutput(int o){
        switch (o){
            case 1:
                outputThucPham.xuatDSThucPham();
                break;
            case 2:
                outputDienMay.xuatDSDienMay();
                break;
            case 3:
                outputSanhSu.xuatDSSanhSu();
                break;
            case 4:
                System.out.println("... back to main menu ...");
                endLoop = false;
        }
    }

    public static void chooceAdd(int a){
        switch (a){
            case 1:
                inputHangThucPham.themThucPham();
                break;
            case 2:
                inputHangDienMay.themDienMay();
                break;
            case 3:
                inputHangSanhSu.themSanhSu();
                break;
            case 4:
                System.out.println("... back to main menu ...");
                endLoop = false;
        }
    }
}
