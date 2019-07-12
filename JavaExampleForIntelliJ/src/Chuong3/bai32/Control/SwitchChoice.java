package Chuong3.bai32.Control;

import Chuong3.bai32.IO.*;

public class SwitchChoice {
    public static void luaChon(int n){
        switch (n){
            case 1:
                System.out.println();
                input.inputHoaDon();
                break;
            case 2:
                output.outputHoaDon();
                break;
            case 3:
                Sort.sapXep();
                output.outputHoaDon();
                break;
            case 4:
                System.out.println("\nThoat chuong trinh.");
                System.exit(0);
        }
    }
}
