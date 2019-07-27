package VuVanHung_Day7.Module;

import java.util.Scanner;

public class inputList {
    public static CanBo[] listCB;
    public static CongNhan[] listCN;
    static Scanner input = new Scanner(System.in);

    public static void nhapCB(){
        System.out.print("So can bo can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        listCB = new CanBo[n];
        for(int i=0; i<n; i++){
            listCB[i] = new CanBo();
            System.out.println("\tCan bo thu" + (i+1));
            listCB[i].inputCB();
        }
    }

    public static void nhapCN(){
        System.out.print("So cong nhan can nhap: ");
        int n = input.nextInt();
        input.nextLine();
        listCN = new CongNhan[n];
        for(int i=0; i<n; i++){
            listCN[i] = new CongNhan();
            System.out.println("\tCong nhan thu " + (i+1));
            listCN[i].inputCN();
        }
    }
}
