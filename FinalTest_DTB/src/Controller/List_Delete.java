package Controller;

import Module.*;

public class List_Delete {
    public static void xoaSinhVien() {
        String maSinhVien = Data_Input.maSinhVien();
        if (Database_Delete.xoaSinhVien_SinhVien(maSinhVien) && Database_Delete.xoaSinhVien_Diem(maSinhVien)) {
            System.out.println("Xoa thong tin sinh vien thanh cong");
        } else {
            System.out.println("Xoa thong tin sinh vien khong thanh cong.");
        }
    }

    public static void xoaMonHoc() {

    }

    public static void xoaDiem() {

    }
}
