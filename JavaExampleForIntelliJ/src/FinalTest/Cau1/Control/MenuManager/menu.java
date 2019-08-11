package FinalTest.Cau1.Control.MenuManager;

import FinalTest.Cau1.Control.ListMenuControl.menuMain;
import FinalTest.Cau1.Control.SwitchControl.choiceMain;
import FinalTest.Cau1.Process.ChoiceInMenu.enterChoice;

public class menu {
    public static void menuController(){
        do {
            menuMain.menuMainController();
            int n = enterChoice.enterChoice();
            choiceMain.mChoice(n);
        } while (true);
    }
}
