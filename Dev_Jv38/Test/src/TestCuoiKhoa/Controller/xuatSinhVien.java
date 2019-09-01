package TestCuoiKhoa.Controller;

import TestCuoiKhoa.Module.Diem;

public class xuatSinhVien extends nhapSinhVien {
    public static void xuatDSSV() {
        System.out.println("=======> Quan ly danh sach diem cua sinh vien <=======");
        for (int i=0; i<list.size(); i++) {
            System.out.println("\tPhieu thu " + (i+1));
            System.out.println("- Ma sinh vien: " + list.get(i).getMaSinhVien());
            System.out.println("- Ho va ten: " + list.get(i).getHoDem() + " " + list.get(i).getTen());
            System.out.println("- Nam sinh: " + list.get(i).getNamSinh());
            System.out.println("- Gioi tinh: " + list.get(i).getGioiTinh());
            System.out.println("\t> Danh sach mon hoc <");
            float tong = 0;
            xuatMonHoc.tieuDeMH();
            for (int j=0; j<list.get(i).getListMH().size(); j++) {
                //tong+=list.get(i).getListMH().get(j).getHeSo() * ((Diem) list.get(i).getListMH().get(j)).getDiemSo();
                xuatMonHoc.xuatDSMH(i, j);
            }
            System.out.println("- Tong ket: " + (float)tong/list.get(i).getListMH().size());
        }
    }
}
