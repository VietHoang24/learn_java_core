package VuVanHung_Day5.Process;

import VuVanHung_Day5.Module.VDV;

import static VuVanHung_Day5.Process.SumResult.sumResult;

public class Function1 extends VDV {
    //Hien thi toan bo danh sach va tong thanh tich
    public static void function1() {
        Title.title();
        for (int i=0; i<name.length; i++){
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
