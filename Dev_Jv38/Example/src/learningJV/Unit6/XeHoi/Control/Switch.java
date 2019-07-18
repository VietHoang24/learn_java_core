package learningJV.Unit6.XeHoi.Control;

import learningJV.Unit6.XeHoi.Process.*;

public class Switch {
    public static void choose(int n){
        switch (n){
            case 1:
                System.out.println("\n->Xuat thong thin xe:");
                output.xuat();
                break;
            case 2:
                System.out.println("\n->Sua thong tin xe<-");
                input.suaThongTin();
                break;
            case 3:
                System.err.println("\n->Thoat chuong trinh<-");
                System.exit(0);
        }
    }
}
