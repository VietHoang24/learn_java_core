package learningJV.Unit8.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSinhVien {
    static ArrayList<SinhVien> list = new ArrayList<SinhVien>();

    public static void sortName(){
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getHoTen().compareTo(sv2.getHoTen())>0){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public static void main(String[] args) {
        list.add(new SinhVien(101, "Giang", "Nu", "Tester"));
        list.add(new SinhVien(102, "Cong", "Nam", "JavaWeb"));
        list.add(new SinhVien(103, "Binh", "Nam", "PHP"));

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

//        list.remove(0);
//        System.out.println("Sau khi xoa sinh vien dau tien.");
//        for (SinhVien sv: list) {
//            System.out.println(sv.toString());
//        }

        SinhVien sv = new SinhVien(104, "Kha", "Nam", "C++");
        list.set(1, sv);
        for (SinhVien s: list){
            System.out.println(s.toString());
        }

        System.out.println("Danh sach sap xep theo ten.");
        sortName();
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
