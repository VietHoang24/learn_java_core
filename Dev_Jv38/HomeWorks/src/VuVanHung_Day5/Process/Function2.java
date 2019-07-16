package VuVanHung_Day5.Process;

import VuVanHung_Day5.Module.VDV;

import static VuVanHung_Day5.Process.SumResult.sumResult;

public class Function2 extends VDV {
    //Xem vdv co tong ba lan cu ta cao nhat
    public static void function2() {
        int max = sumResult(0);
        int vt = 0;
        for (int i=1; i<result.length; i++) {
            if (max < sumResult(i)) {
                max = sumResult(i);
                vt = i;
            }
        }
        System.out.println("\tName: " + name[vt] + "\tTong TT: " + max);
    }
}
