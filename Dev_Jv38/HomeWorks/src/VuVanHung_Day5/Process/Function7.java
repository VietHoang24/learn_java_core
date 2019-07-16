package VuVanHung_Day5.Process;

import VuVanHung_Day5.Module.VDV;

public class Function7 extends VDV {
    public static void sort2() {//Sap theo tong thanh tich giam dan
        for (int i=0; i<name.length; i++)
            for (int j=i+1; j<name.length; j++)
                if (name[i].length() > name[j].length()) {
                    Function3.daoTen(name, i, j);
                    Function3.daoTT(result, i, j);
                }
    }

    public static void function7() {
        sort2();
        Function1.function1();
    }
}
