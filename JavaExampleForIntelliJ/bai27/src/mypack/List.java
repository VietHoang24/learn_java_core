package mypack;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private ArrayList<TamGiac> list;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        list = new ArrayList<TamGiac>();
        System.out.print("So tam giac can nhap: ");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("- Tam giac thu " + (i+1) + ":");
            TamGiac a = new TamGiac();
            a.nhap();
            list.add(a);
        }
    }

    public void xuat(){
        System.out.printf("%20s%20s%20s%20s%20s%20s%n", "STT",
                "Canh A", "Canh B", "Canh C", "Chu Vi", "Dien Tich");
        for(int i=0; i<list.size(); i++){
            System.out.printf("%20d%20d%20d%20d%20d%20.2f%n", i+1,
                    list.get(i).getCanhA(), list.get(i).getCanhB(), list.get(i).getCanhC(),
                    list.get(i).getChuVi(), list.get(i).getDienTich());
        }
    }
}
