package Chuong3.bai39.Control;

import Chuong3.bai39.Process.inputMenu;

public class Menu {
    public static void mainMenu(){
        do {
            ListMenu.listMain();
            int n = inputMenu.enterChooce();
            Switch.chooceMain(n);
        } while (true);
    }
}
