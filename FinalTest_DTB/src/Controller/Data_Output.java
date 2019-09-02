package Controller;

import Module.*;
import java.util.ArrayList;

public class Data_Output {
    public static void xuatSinhVien() {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        System.out.printf("%20s%20s%20s%20s%20s%n", "Ma Sinh Vien", "Ho Dem", "Ten", "Nam Sinh", "Gioi Tinh");
        for (int i=0; i<listSinhVien.size(); i++) {
            System.out.printf("%20s%20s%20s%20d%20s%n",
                    listSinhVien.get(i).getMaSinhVien(),
                    listSinhVien.get(i).getHoDem(),
                    listSinhVien.get(i).getTen(),
                    listSinhVien.get(i).getNamSinh(),
                    listSinhVien.get(i).getGioiTinh());
        }
    }

    public static void xuatMonHoc() {
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        System.out.printf("%20s%20s%20s%n", "Ma Mon Hoc", "Ten Mon Hoc", "He So");
        for (int i=0; i<listMonHoc.size(); i++) {
            System.out.printf("%20s%20s%20s%n",
                    listMonHoc.get(i).getMaMonHoc(),
                    listMonHoc.get(i).getTenMonHoc(),
                    listMonHoc.get(i).getHeSoMonHoc());
        }
    }

    public static void xuatDiem() {
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        System.out.printf("%20s%20s%20s%n", "Ma Sinh Vien", "Ma Mon Hoc", "Diem So");
        for (int i=0; i<listDiem.size(); i++) {
            System.out.printf("%20s%20s%20.1f%n",
                    listDiem.get(i).getMaSinhVien(),
                    listDiem.get(i).getMaMonHoc(),
                    listDiem.get(i).getDiemSo());
        }
    }

    public static void xuatDanhSach() {
        ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
        ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
        ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
        int demHeSo = 0;
        float tongDiem = 0;
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("%20s%20s%20s%20s%n", "Ma Sinh Vien |", "Ho Va Ten |", "Ten Mon Hoc |", "Diem Mon Hoc");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i=0; i<listSinhVien.size(); i++) {
            for (int j=0; j<listDiem.size(); j++) {
                for (int k=0; k<listMonHoc.size(); k++) {
                    if(listDiem.get(j).getMaSinhVien().compareTo(listSinhVien.get(i).getMaSinhVien())==0 &&
                            listDiem.get(j).getMaMonHoc().compareTo(listMonHoc.get(k).getMaMonHoc())==0) {
                        System.out.printf("%20s%20s%20s%18.1f%n",
                                listSinhVien.get(i).getMaSinhVien()+" |",
                                listSinhVien.get(i).getHoDem()+" "+listSinhVien.get(i).getTen()+" |",
                                listMonHoc.get(k).getTenMonHoc()+" |",
                                listDiem.get(j).getDiemSo());
                        tongDiem+=listDiem.get(j).getDiemSo()*listMonHoc.get(k).getHeSoMonHoc();
                        demHeSo+=listMonHoc.get(k).getHeSoMonHoc();
                    }
                }
            }
            System.out.printf("%40s%5.1f%n", "=====> Diem tong ket:", tongDiem/demHeSo);
            System.out.println("-----------------------------------------------------------------------------------------");
        }
    }
}
