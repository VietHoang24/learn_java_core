package VuVanHung_Day5.Process;

import VuVanHung_Day5.Module.VDV;

import static VuVanHung_Day5.Process.SumResult.sumResult;

public class Function5 extends VDV {
    public static void function5() {
        Title.title();
        for (int i=0; i<name.length; i++){
            if (name[i].charAt(0) == 'T'){
                System.out.printf("%3d ", i+1);
                System.out.printf("%-8s",name[i]);
                System.out.printf("%4d  ", result[i][0]);
                System.out.printf("%4d  ", result[i][1]);
                System.out.printf("%4d  ", result[i][2]);
                System.out.printf("%5d ", sumResult(i));
                System.out.println();
            }
        }
    }
}
