package Chuong3.bai33.Module;

import java.util.ArrayList;

public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private ArrayList<MonHoc> listMH = new ArrayList<MonHoc>();
    private LopHoc lopHoc;

    public ArrayList<MonHoc> getListMH() {
        return listMH;
    }

    public void setListMH(ArrayList<MonHoc> listMH) {
        this.listMH = listMH;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }
}
