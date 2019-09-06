package learningJV.Unit8.LinkList;

import java.util.Scanner;

public class edit extends input {
    static Scanner in = new Scanner(System.in);
    public static void setCD(){
        System.out.print("nhap vi tri chieu dai muon sua: ");
        int i = in.nextInt();
        System.out.print("Nhap gia tri thay the: ");
        double cd = in.nextDouble();
        list.get(i).setCd(cd);
    }

    public static void setCR(){
        System.out.print("nhap vi tri chieu rong muon sua: ");
        int i = in.nextInt();
        System.out.print("Nhap gia tri thay the: ");
        double cr = in.nextDouble();
        list.get(i).setCr(cr);
    }
}
