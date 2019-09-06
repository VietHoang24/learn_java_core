package FinalTest.Cau1.Control.SwitchControl;

import FinalTest.Cau1.Process.OUTPUT.oNguoiLaoDong;

public class choiceOutput extends choiceMain {
    public static void oChoice(int n){
        switch (n){
            case 1:
                oNguoiLaoDong.xuatCongNhan(); break;
            case 2:
                oNguoiLaoDong.xuatKySu(); break;
            case 3:
                oNguoiLaoDong.xuatCongNhan();
                oNguoiLaoDong.xuatKySu();
                break;
            case 4:
                System.out.println("\t===> Back to main menu <===\n");
                endLoop = false;
        }
    }
}
