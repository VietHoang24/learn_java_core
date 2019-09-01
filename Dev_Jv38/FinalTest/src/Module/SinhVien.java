package Module;

import java.util.ArrayList;

public class SinhVien {
    private String maSinhVien;
    private String hoDem;
    private String ten;
    private int namSinh;
    private String gioiTinh;
    private ArrayList<MonHoc> list = new ArrayList<MonHoc>();

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoDem, String ten, int namSinh, String gioiTinh, ArrayList<MonHoc> list) {
        this.maSinhVien = maSinhVien;
        this.hoDem = hoDem;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.list = list;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public ArrayList<MonHoc> getList() {
        return list;
    }

    public void setList(ArrayList<MonHoc> list) {
        this.list = list;
    }
}
