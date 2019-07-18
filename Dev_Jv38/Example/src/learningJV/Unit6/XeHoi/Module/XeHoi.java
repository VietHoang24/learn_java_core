package learningJV.Unit6.XeHoi.Module;

public class XeHoi {
    private String maXe;
    private String nhanHieu;
    private String hangSX;
    private String kieuDang;
    private double giaTien;
    private String xuatXu;

    public XeHoi() {
    }

    public XeHoi(String maXe, String nhanHieu, String hangSX, String kieuDang, double giaTien, String xuatXu) {
        this.maXe = maXe;
        this.nhanHieu = nhanHieu;
        this.hangSX = hangSX;
        this.kieuDang = kieuDang;
        this.giaTien = giaTien;
        this.xuatXu = xuatXu;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String toString(){
        return "[MAXE = " + maXe + ", NHANHIEU = " + nhanHieu + ", HANGSX = " +
                hangSX + ", KIEUDANG = " + kieuDang + ", GIA = " + giaTien + ", XUATXU = " + xuatXu + "].";
    }
}
