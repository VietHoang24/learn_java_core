package Chuong3.bai32.Module;

import java.util.ArrayList;

public class HoaDon {
    private KhachHang khachHang = new KhachHang();
    private ArrayList<HangHoa> hangHoa;

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public ArrayList<HangHoa> getHangHoa() {
        return hangHoa;
    }

    public void setHangHoa(ArrayList<HangHoa> hangHoa) {
        this.hangHoa = hangHoa;
    }
}
