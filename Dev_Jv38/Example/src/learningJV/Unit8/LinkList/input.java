package learningJV.Unit8.LinkList;

import java.util.ArrayList;
import java.util.Scanner;

public class input {
    static ArrayList<hcn> list = new ArrayList<hcn>();
    static Scanner in = new Scanner(System.in);

    public static void nhap(){
        hcn a = new hcn();
        System.out.print("Chieu dai: ");
        double cd = in.nextDouble();
        a.setCd(cd);
        System.out.print("Chieu rong: ");
        double cr = in.nextDouble();
        a.setCr(cr);

        list.add(a);
    }

    public static void nhapDS(){
        System.out.print("So hinh chu nhat can nhap: ");
        int n = in.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("HCN " + (i+1));
            nhap();
        }
    }
}
