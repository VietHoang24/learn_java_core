package VuVanHung_Day5.Process;

import VuVanHung_Day5.Module.VDV;

import static VuVanHung_Day5.Process.SumResult.sumResult;

public class Function3 extends VDV {
    //Hien thi 3 van dong vien co tong thanh tich cao nhat
    public static void daoTen(String[] name, int i, int j) {
        String temp = name[i];
        name[i] = name[j];
        name[j] = temp;
    }

    public static void daoTT(int[][] result, int i, int j) {
        for (int k=0; k<3; k++) {
            int temp = result[i][k];
            result[i][k] = result[j][k];
            result[j][k] = temp;
        }
    }

    public static void sort1() {//Sap theo tong thanh tich giam dan
        for (int i=0; i<name.length; i++)
            for (int j=i+1; j<name.length; j++)
                if (name[i].compareTo(name[j]) > 0) {
                    daoTen(name, i, j);
                    daoTT(result, i, j);
                }
    }

    public static void function3() {
        Title.title();
        sort1();
        for (int i=0; i<3; i++) {
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
