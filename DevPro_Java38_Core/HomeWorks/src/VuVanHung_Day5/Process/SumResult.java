package VuVanHung_Day5.Process;

import VuVanHung_Day5.Module.VDV;

public class SumResult extends VDV {
    public static int sumResult(int i) {
        int s = 0;
        for (int j=0; j<3; j++)
            s += result[i][j];
        return s;
    }
}
