package FinalTest.Cau1.Control.SwitchControl;

import FinalTest.Cau1.Process.INPUT.iCongNhan;
import FinalTest.Cau1.Process.INPUT.iKySu;

public class choiceInput extends choiceMain {
    public static void iChoice(int n){
        switch (n){
            case 1:
                iCongNhan.nhapDanhSachCongNhan(); break;
            case 2:
                iKySu.nhapDanhSachKySu(); break;
            case 3:
                System.out.println("\t===> Back to main menu <===\n");
                endLoop = false;
        }
    }
}
