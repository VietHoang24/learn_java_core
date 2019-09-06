package learningJV.Unit8.QuanLyBanHang.Control;

import learningJV.Unit8.QuanLyBanHang.Process.Input.Choice;

public class Menu {
    public static void menu(){
        do {
            ListMenu.list();
            int n = Choice.enterChooce();
            Switch.chooce(n);
        } while (true);
    }
}
