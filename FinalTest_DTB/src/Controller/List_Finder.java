package Controller;

import Module.*;
import java.util.ArrayList;
import java.util.Scanner;

public class List_Finder {
    static ArrayList<SinhVien> listSinhVien = Database_GetListData.getListSinhVien();
    static ArrayList<MonHoc> listMonHoc = Database_GetListData.getListMonHoc();
    static ArrayList<Diem> listDiem = Database_GetListData.getListDiem();
    static Scanner input = new Scanner(System.in);

    public static void timKiem_MaSinhVien() {
        System.out.print("- Nhap vao ma sinh vien can tim: ");
        String maSinhVien = input.nextLine();
        int dem = 0;
        for (int i=0; i<listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getMaSinhVien().compareTo(maSinhVien)==0) dem++;
        }
        if (dem!=0) {
            int demHeSo = 0;
            float tongDiem = 0;
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.printf("%20s%20s%20s%20s%n", "Ma Sinh Vien |", "Ho Va Ten |", "Ten Mon Hoc |", "Diem Mon Hoc");
            System.out.println("-----------------------------------------------------------------------------------------");
            for (int i=0; i<listSinhVien.size(); i++) {
                if (listSinhVien.get(i).getMaSinhVien().compareTo(maSinhVien)==0) {
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
        } else {
            System.out.println("Ma sinh vien vua nhap khong ton tai. Dung chuong trinh...");
            return;
        }
    }

    public static void timKiem_MaMonHoc() {
        System.out.print("- Nhap vao ma mon hoc can tim: ");
        String maMonHoc = input.nextLine();
        int dem = 0;
        for (int i=0; i<listMonHoc.size(); i++) {
            if (listMonHoc.get(i).getMaMonHoc().compareTo(maMonHoc)==0) dem++;
        }
        if (dem!=0) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.printf("%20s%20s%20s%20s%n", "Ma Sinh Vien |", "Ho Va Ten |", "Ten Mon Hoc |", "Diem Mon Hoc");
            System.out.println("-----------------------------------------------------------------------------------------");
            for (int i=0; i<listSinhVien.size(); i++) {
                for (int j=0; j<listDiem.size(); j++) {
                    for (int k=0; k<listMonHoc.size(); k++) {
                        if(listMonHoc.get(k).getMaMonHoc().compareTo(maMonHoc)==0 &&
                                listDiem.get(j).getMaSinhVien().compareTo(listSinhVien.get(i).getMaSinhVien())==0 &&
                                listDiem.get(j).getMaMonHoc().compareTo(listMonHoc.get(k).getMaMonHoc())==0) {
                            System.out.printf("%20s%20s%20s%18.1f%n",
                                    listSinhVien.get(i).getMaSinhVien()+" |",
                                    listSinhVien.get(i).getHoDem()+" "+listSinhVien.get(i).getTen()+" |",
                                    listMonHoc.get(k).getTenMonHoc()+" |",
                                    listDiem.get(j).getDiemSo());
                        }
                    }
                }
            }
            System.out.println("-----------------------------------------------------------------------------------------");
        } else {
            System.out.println("Ma mon hoc vua nhap khong ton tai. Dung chuong trinh...");
            return;
        }
    }
}
