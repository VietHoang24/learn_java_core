package Chuong3.bai34.Module;

import java.util.ArrayList;

public class PhieuNhapSach {
    private String maPhieu;
    private Date ngayLap;
    private ArrayList<ChiTietSach> listBook = new ArrayList<ChiTietSach>();

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public ArrayList<ChiTietSach> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<ChiTietSach> listBook) {
        this.listBook = listBook;
    }
}
