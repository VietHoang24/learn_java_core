package VuVanHung_Day5.Process;

import VuVanHung_Day5.Module.VDV;

import static VuVanHung_Day5.Process.SumResult.sumResult;

public class Function8 extends VDV {
    public static void function8() {
        int max = sumResult(0);
        for (int i=0; i<name.length; i++){
            if(max < sumResult(i)) {
                max = sumResult(i);
            }
        }

        int i = 0;
        while(i < name.length && sumResult(i) == max){
            i++;
        }

        if (i==name.length){
            System.out.println("Danh sach khong co nguoi xep thu 2.");
            return;
        }

        int max2 = sumResult(i);
        i++;
        while (i<name.length){
            if(sumResult(i)<max && sumResult(i)>max2){
                max2 = sumResult(i);
            }
            i++;
        }

        Title.title();
        for (int j=0; j<name.length; j++){
                if (max2 == sumResult(j)){
                    System.out.printf("%3d ", j+1);
                    System.out.printf("%-8s",name[j]);
                    System.out.printf("%4d  ", result[j][0]);
                    System.out.printf("%4d  ", result[j][1]);
                    System.out.printf("%4d  ", result[j][2]);
                    System.out.printf("%5d ", sumResult(j));
                    System.out.println();
                }
            }
    }
}
