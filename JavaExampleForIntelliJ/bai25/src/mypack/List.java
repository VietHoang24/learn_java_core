package mypack;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private ArrayList<XeDemo> list;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        list = new ArrayList<XeDemo>();
        System.out.print("Nhap vao tong so thong tin xe: ");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("- Thong tin xe thu "+ (i+1) + ": ");
            XeDemo a = new XeDemo();
            a.nhap();
            list.add(a);
        }
    }

    public void xuat(){
        XeDemo.inTieuDe();
        for(int i=0; i<list.size(); i++){
            list.get(i).xuat();
        }
    }
}
