package mypack;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private ArrayList<SinhVien> list;
    static Scanner input = new Scanner(System.in);

    public void nhap(){
        list = new ArrayList<SinhVien>();
        System.out.print("So luong sinh vien can nhap: ");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("- Sinh vien thu "+ (i+1) +": ");
            SinhVien a = new SinhVien();
            a.nhapDuLieu();
            list.add(a);
        }
    }

    public void xuat(){
        SinhVien.inTieuDe();
        for(int i=0; i<list.size(); i++){
            list.get(i).inDuLieu();
        }
    }

    public void inSinhVienTBLN(){
        float MAX = list.get(0).getDiemTrungBinh();
        SinhVien.inTieuDe();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getDiemTrungBinh()>MAX)
                MAX = list.get(i).getDiemTrungBinh();
        }
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getDiemTrungBinh()==MAX){
                list.get(i).inDuLieu();
            }
        }
    }
}
