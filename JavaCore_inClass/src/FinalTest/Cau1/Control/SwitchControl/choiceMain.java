package FinalTest.Cau1.Control.SwitchControl;

import FinalTest.Cau1.Control.ListMenuControl.*;
import FinalTest.Cau1.Process.ChoiceInMenu.enterChoice;
import FinalTest.Cau1.Process.SORT.sapXep;

public class choiceMain {
    public static boolean endLoop = true;
    public static void mChoice(int n){
        switch (n){
            case 1:
                while (endLoop){
                    menuInput.menuInputController();
                    int i = enterChoice.iEnterChoice();
                    choiceInput.iChoice(i);
                } break;
            case 2:
                endLoop = true;
                while (endLoop){
                    menuOutput.menuOutputController();
                    int o = enterChoice.enterChoice();
                    choiceOutput.oChoice(o);
                } break;
            case 3:
                sapXep.sort();
                System.out.println("----------> Sort completed <---------");
                break;
            case 4:
                System.out.println("\t===> Thoat chuong trinh <===\n");
                System.exit(0);
        }
    }
}
