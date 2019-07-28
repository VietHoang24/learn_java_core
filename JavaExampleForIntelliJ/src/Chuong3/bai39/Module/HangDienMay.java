package Chuong3.bai39.Module;

public class HangDienMay extends HangHoa {
    private final double vat = 0.1;
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay() {
    }

    public HangDienMay(String maHang, String tenHang, int soLuongTonKho, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public double getVat() {
        return vat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String danhGia() {
        if (getSoLuongTonKho()<3){
            return "Ban duoc";
        } else {
            return " ";
        }
    }
}
