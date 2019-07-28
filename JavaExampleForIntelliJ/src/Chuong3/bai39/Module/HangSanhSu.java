package Chuong3.bai39.Module;

import java.util.Date;

public class HangSanhSu extends HangHoa {
    private final double vat = 0.1;
    private String hangSX;
    private String nhaSX;
    private String diaChi;
    private DMY ngayNhapKho;

    public HangSanhSu() {
    }

    public HangSanhSu(String maHang, String tenHang, int soLuongTonKho, double donGia, String hangSX, String nhaSX, String diaChi, DMY ngayNhapKho) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.hangSX = hangSX;
        this.nhaSX = nhaSX;
        this.diaChi = diaChi;
        this.ngayNhapKho = ngayNhapKho;
    }

    public double getVat() {
        return vat;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public DMY getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(DMY ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public String danhGia() {
        Date date = new Date();
        if (getSoLuongTonKho()>50 &&
                (getNgayNhapKho().getThang()==date.getMonth() && getNgayNhapKho().getNam()==date.getYear() && date.getDay()-getNgayNhapKho().getNgay()>10) ||
                (getNgayNhapKho().getThang()<date.getMonth() || getNgayNhapKho().getNam()<date.getYear())){
            return "Ban cham";
        } else {
            return " ";
        }
    }
}
