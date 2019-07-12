package Chuong3.bai33.Module;

import java.util.ArrayList;

public class MonHoc {
    private String tenMonHoc;
    private int soTrinh;
    private float diem;
    private ArrayList<MonHoc> listMH = new ArrayList<MonHoc>();

    public ArrayList<MonHoc> getListMH() {
        return listMH;
    }

    public void setListMH(ArrayList<MonHoc> listMH) {
        this.listMH = listMH;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTrinh() {
        return soTrinh;
    }

    public void setSoTrinh(int soTrinh) {
        this.soTrinh = soTrinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
}
